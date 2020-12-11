abstract class Abs
{
	abstract void fun1();
}
abstract class Abs2 extends Abs
{
	void fun1()
	{
		System.out.println("fun1");
	}
	abstract void fun2();
}
class Main extends Abs2
{
	void fun2()
	{
		System.out.println("fun 2");
	}
	public static void main(String[] args) {
		
	}
}