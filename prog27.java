//use of final as function/method

class A
{
	final void fun()
	{
		System.out.println("This is class A");
	}
}
class B extends A{
	void fun()								//This will error
	{
		System.out.println("This is class B");		
	}
}
class C
{
	public static void main(String[] args) {
		
	}
}