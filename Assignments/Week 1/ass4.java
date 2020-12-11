import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of days : ");
		int days = sc.nextInt();
		int d = days;
		int year = days/365;
		days = days - (year*365);
		int month = days/30;
		days = days - (month*30);
		System.out.println("So "+d+" days = "+year+" year(s), "+month+" month(s) and "+days+" day(s)");
	}
}