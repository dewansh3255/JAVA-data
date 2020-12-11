//Question 5 (23-09-2020)
//Java Program to Initialize the Instance Variables of Employee Class, 
//Using Parameterized Constructor

class Employee
{
	private int id;
	private String name;
	public Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	void Display()
	{
		System.out.println("Name = "+name);	
		System.out.println("ID   = "+id);
	}
	public static void main(String[] args) 
	{
		Employee e = new Employee("Mahendra Singh",7);	
		e.Display();
	}
}