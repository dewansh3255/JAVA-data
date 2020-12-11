//Question 3 (23-09-2020)
//Java Program to Illustrates Use of Abstract Class and Method

abstract class A
{
	abstract void fun1();
}
abstract class B extends A
{
	void fun1()
	{
		System.out.println("we are in fun1()");
	}
	abstract void fun2();
}
class Main extends B{
	void fun2()
	{
		System.out.println("we are in fun2()");
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.fun1();
		m.fun2();
	}
}