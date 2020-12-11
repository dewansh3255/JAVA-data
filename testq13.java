//JAVA program to find the number of Non-repeated elements in array

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n, flag=0, count=0;
		System.out.print("Enter the size of array : ");
		n = sc.nextInt();
		System.out.println("Enter the elements of array :");
		int a[] = new int[n];
		for (int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt(); 	
		}
		System.out.println("The Non-repeated elements are : ");
		for (int i=0;i<n;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				if(i != j)
				{
					if(a[i] != a[j])
					{
						flag = 1;
					}
					else
					{
						flag = 0;
						break;
					}
				}
			}
			if (flag == 1)
			{
				count++;
				System.out.print(a[i]+"\t");
			}
		}
	}
}