import java.util.Scanner;
class Rev
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be reversed : ");
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0)
		{
			int digit = num%10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		System.out.println("Reversed number = "+rev);	
	}

}