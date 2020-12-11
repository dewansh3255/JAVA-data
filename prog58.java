interface A
{ 
	void ref1();	//public abstract
}
class Refer
{
	void referMethod()
	{
		System.out.println("Hey! I'm method of refer class");
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Refer refer = new Refer();
		A obj = refer::referMethod;		//object_name :: method_name;
		obj.ref1();	
	}
}