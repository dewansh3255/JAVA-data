import java.util.Scanner;
class Leap
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year to check : ");	
		int y = sc.nextInt();
		if (y%400==0)
			System.out.println(y+" is a leap year");
		else if (y%4==0)
			System.out.println(y+" is a leap year");
		else 
			System.out.println("This is not a leap year");
	}
}