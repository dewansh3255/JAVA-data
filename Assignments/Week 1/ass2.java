//Program to calc sum of marks of 3 subjects and find percentage marks

class A
{
	public static void main(String[] args) 
	{
		float a,b,c,s;
		a = Float.parseFloat(args[0])	
		b = Float.parseFloat(args[1])	
		c = Float.parseFloat(args[2])	
		s=a+b+c;
		System.out.println("Sum : "+s);
		System.out.println("Area : "+(s/3));
	}
}