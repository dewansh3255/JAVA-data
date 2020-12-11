//use of final as class

final class A
{
	void fun()
	{
		System.out.println("This is class A");
	}
}
class B extends A 					//this class cannot be inherrited as class A is final
									//so this will give error
{
	void fun()
	{
		System.out.println("This is class B");
	}
}
class C
{
	public static void main(String[] args) {
		
	}
}