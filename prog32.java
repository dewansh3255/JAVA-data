class MethodStatic1
{
	static int s1=1;
	static
	{
		System.out.print("This is inside static block ");
	}
}
class MethodStatic2
{
	static int s2=2;
	static
	{
		System.out.print("\nThis is inside static block ");
	}
}
class A
{
	public static void main(String[] args) 
	{
		System.out.println(MethodStatic1.s1);
		System.out.println(MethodStatic2.s2);
		System.out.println("\nThis is main function");
	}
}