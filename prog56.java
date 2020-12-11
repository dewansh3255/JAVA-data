interface L
{
	void m(int num);
}
class Main
{
	public static void main(String[] args) 
	{	
		L obj = (int num) -> {System.out.println("my lucky number is : "+num);};
		obj.m(7);
	}
}