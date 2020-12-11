//default method

interface A
{
	abstract void fun1();
	default void D()
	{
		System.out.println("default method pf interface");
	}
}
class Main implements A
{
	public void fun1()
	{
		System.out.println("this is fun1");
	}
	/*public void D()						//open the comment and the default method would be overridden
	{
		System.out.println("default method D() overridden");
	}*/
	public static void main(String[] args) {
		Main m = new Main();
		m.fun1();
		m.D();
	}
}