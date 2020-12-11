/*
		This happens because the overriden function's return type must match 
		with the return type type of parent class
		otherwise it will give error

		So, This program will error of this kind

		prog44.java:25: error: fun() in B cannot override fun() in A
		        public void fun()
		                    ^
		  return type void is not compatible with int
		1 error
*/

class A
{
	int fun()
	{
		System.out.println("This is inside A");
		return 0;
	}
}
class B extends A
{
	public void fun()
	{
		System.out.println("This is inside B");
	}
}
class Main
{
	public static void main(String[] args) {
		B b = new B();
		b.fun();
	}
}