//WAP to calc the product of 5 inputs of user

import java.util.Scanner;
class Mul
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p,a,b,c,d,e;
		System.out.println("Enter any 5 numbers to multiply : \n");
		a = sc.nextInt();	
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		p=a*b*c*d*e;	
		System.out.println("The product of given nos. is "+p);	
	}
}