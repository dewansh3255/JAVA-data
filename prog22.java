//default or paramatrised constructor
import java.util.Scanner;
class Student
{
	private int id;
	private String name;
	public Student()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the name : ");
		name = sc.nextLine();
		System.out.print("Enter the ID : ");
		id = sc.nextInt();	
	}
	void Display()
	{
		System.out.println("Name : "+name);
		System.out.println("ID   : "+id);
	}
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.Display();	
	}
}