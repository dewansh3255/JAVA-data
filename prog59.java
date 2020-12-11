interface A
{ 
	void ref1();	//public abstract
}
class Refer
{
	static void referMethod()
	{
		System.out.println("Hey! I'm method of refer class");
	}
}
class Main
{
	public static void main(String[] args) 
	{
		A obj = Refer::referMethod;		//class_name :: method_name;
		obj.ref1();	
	}
}