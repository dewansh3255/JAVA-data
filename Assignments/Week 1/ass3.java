import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double p,r,t,si;
		System.out.print("Enter Principal : ");	
		p = sc.nextDouble();
		System.out.print("Enter Rate      : ");	
		r = sc.nextDouble();
		System.out.print("Enter Time      : ");
		t = sc.nextDouble();
		System.out.println("Simple Interest : "+(p*r*t));
	}
}