// WAP to find sum of 10 numbers entered by user

import java.util.Scanner;
class Sum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=0;
		System.out.println("Enter 10 numbers to add : \n");
		for(int i=1; i<=10; i++)
		{
		 	s += sc.nextInt();	
		}
		System.out.println("The sum of given nos. is "+s);	
	}
}