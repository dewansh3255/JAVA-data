//Wap to sum 2 numbers entered by user.

import java.util.Scanner;
class Sum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,b;
		System.out.println("Enter any two numbers to add : ");
		a = sc.nextInt();
		b = sc.nextInt();
		int s = a+b;
		System.out.println("The sum of given numbers is : "+s);
	}
}