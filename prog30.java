class MethodStatic
{
	static void method()
	{
		System.out.println("This is Static Method");
	}
}
class A
{
	public static void main(String[] args) {
		MethodStatic m = new MethodStatic();
		m.method();				//calling method using object of class
		MethodStatic.method();	//calling method using class name
	}
}