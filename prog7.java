import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float per;
		String name;
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter percentage : ");
		per = sc.nextFloat();
		System.out.println("The percentage of "+name+" is "+per);
	}
}