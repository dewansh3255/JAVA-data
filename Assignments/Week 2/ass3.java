import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double hra=0,da=0,total=0;
		System.out.print("Enter your basic salary : ");
		double sal = sc.nextInt();
		if(sal<1500)
		{
			hra = sal/10;
			da = (sal*9)/10;
			total = sal+hra+da;
		}
		else if (sal >= 1500)
		{
			hra = 500;
			da = (sal*98)/100;
			total = sal+hra+da;
		}	
		System.out.println("Basic salary = "+sal);
		System.out.println("HRA = "+hra);
		System.out.println("DA = "+da);
		System.out.println("Total Salary = "+total);
	}
}