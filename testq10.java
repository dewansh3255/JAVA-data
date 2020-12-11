//WAP to find the area of Rectangle, Square, Circle
//these are classes which inherit the class Shape

class Shape
{
	public void rect()
	{
		System.out.print("Area of rectangle : ");
	}
	public void sqr()
	{
		System.out.print("Area of square : ");
	}
	public void cir()
	{
		System.out.print("Area of circle : ");
	}
}
class Rectangle extends Shape
{
	float len = 12.5f;
	float brd = 18.65f;
	float r_area = (len*brd);
}
class Square extends Shape
{
	float side = 55.25f;
	float s_area = (side*side);
}
class Circle extends Shape
{
	float radius = 14.675f;
	float c_area = (3.14f*radius*radius);
}
class Main
{
	public static void main(String[] args) 
	{
		Rectangle r_obj = new Rectangle();
		Square s_obj = new Square();
		Circle c_obj = new Circle();
		r_obj.rect();
		System.out.println(r_obj.r_area);
		s_obj.sqr();
		System.out.println(s_obj.s_area);
		c_obj.cir();
		System.out.println(c_obj.c_area);
	}
}