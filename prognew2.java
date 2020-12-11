class A
{
	void fun()
	{
		System.out.println("this is inside A");
	}
}
class B extends A
{
	public void fun()
	{
		System.out.println("this is inside B");
	}
}
class Main
{
	public static void main(String[] args) {
		B b = new B();
		b.fun();
	}
}