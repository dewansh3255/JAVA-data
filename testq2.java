// WAP to check whether user is male or female by input (M/F)

import java.util.Scanner;
class Gender
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gender (M/F): ");
		char g = sc.next().charAt(0);
		if (g == 'M')
		{
			System.out.println("The given input is "+g+" ie. Male");	
		}
		else if (g == 'm')
		{
			System.out.println("The given input is "+g+" ie. Male");	
		}
		else if (g == 'F')
		{
			System.out.println("The given input is "+g+" ie. female");	
		}
		else if (g == 'f')
		{
			System.out.println("The given input is "+g+" ie. female");	
		}
		
	}
}