abstract class A
{
	void fun()
	{
		System.out.println("hello, this is fun method");
	}
	abstract void undefined();
}
class Main extends A
{
	void undefined()
	{
		System.out.println("Undefined method");
	}
	public static void main(String[] args) 
	{
		Main m = new Main();
		m.fun(); 	
		m.undefined();
		// A.fun();
	}
}