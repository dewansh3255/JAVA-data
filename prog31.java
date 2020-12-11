//Static Block
//here we will notice that the Static block runs befor the main mthod

class A
{
	static int a;
	static 									//Static block
	{
		System.out.println("This is Static Block");
		a=10;
	}
	public static void main(String[] args) 
	{
		System.out.println("This is main function");
		System.out.println(a);
		a=101;
		System.out.println(a);
	}
}