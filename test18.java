//Question 6 (22-09-2020)
//Java Program to Understand that the Parameterized Constructor 
//of the Super Class can be called from Sub Class Using super()

class Super
{
	Super(int roll, String name)
	{
	   this.roll=roll;
	   this.name=name;
	}
}
class Subclass extends Super
{
   void Display()
   {
		System.out.println(super.roll(11,"Dewansh"));
   }
   public static void main(String args[])
   {
		Subclass obj= new Subclass();
		obj.printNumber();	
   }
}