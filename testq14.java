//Question 2 (23-09-2020)
//JAVA Program to accept the Marks of a Student into a 1D array 
//and find Total marks and percentage.

import java.util.Scanner;
class array
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the number of subjects : ");
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Enter the marks of "+n+" subjects(out of 100) : ");
		for (int i=0;i<n;i++) 
		{
			A[i]=sc.nextInt();
			sum+=A[i];	
		}
		System.out.println("Marks obtained : "+sum+" out of "+(100*n));
		int per = (sum/n);
		System.out.println("Percentage     : "+per+"%");
	}
}