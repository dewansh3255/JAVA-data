//Question 6 (22-09-2020)
//Java Program to Understand that the Parameterized Constructor 
//of the Super Class can be called from Sub Class Using super()

class Super
{
	String name;
	Super(String name)
	{
		this.name = name;
	}
}
class Subclass extends Super
{
   int id;
   Subclass(String name, int id)
   {
		super(name);
		this.id=id;
   }
   void Display()
   {
   		System.out.println("Hello, my name is "+name+" and my ID is "+id);
   }
   public static void main(String[] args) 
   {
   		Subclass obj = new Subclass("Dewansh",5258);
   		obj.Display();	
   }
}