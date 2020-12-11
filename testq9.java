//WAP to find the area of circle, rectangle, square, cuboid 
//using the function name Area. (Method Overloading) 

class A
{
	void area(double r)
	{
		double ar=(3.14*r*r);
		System.out.println(ar);
	}
	void area(double a,double b)
	{
		double ar=a*b;
		System.out.println(ar);
	}
	void area(float a)
	{
		double ar=(a*a);
		System.out.println(ar);
	}
	void area(double l,double w,double h)
	{
		double ar=((2*l*w)+(2*l*h)+(2*h*w));
		System.out.println(ar);
	}
	public static void main(String[] args) 
	{
		A o = new A();
		o.area(5.35);
		o.area(10.5,13.68);
		o.area(20.62f);
		o.area(15,7.2,2.8);
	}
}