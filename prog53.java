//Static method

interface A
{
	void fun1();
	static void D()
	{
		System.out.println("Static method of interface");
	}
}
class Main implements A
{
	public void fun1()
	{
		System.out.println("FUN1");
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.fun1();
		A.D();
	}
}