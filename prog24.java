import java.util.Scanner;
class Student
{
	private String name;
	private int id;
	public Student()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter you name : ");
		name = sc.nextLine();
		System.out.print("Enter you id   : ");
		id = sc.nextInt();
	}
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	void Display()
	{
		System.out.println("\nName : "+name);
		System.out.println("  ID : "+id);
		System.out.println("-------------------");
	}
	public static void main(String[] args) {
		Student s1 = new Student("Dewansh Khandelwal",12);
		Student s2 = new Student();
		s1.Display();
		s2.Display();
	}
}