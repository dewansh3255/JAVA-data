import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		try
		{
			System.out.println("a/b = "+(a/b));
		}
		catch(Exception e)
		{
			System.out.println("This is not valid");
		}
		System.out.println("program finished...");
	}
}