import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temp in Fahrenheit : ");
		double f = sc.nextDouble();
		double C;
		C = 5*(f-32)/9;
		System.out.println("Temp in celsius is : "+C);
	}
}