//Lembda expression

interface L
{
	void send();
}
class Main
{
	public static void main(String[] args) 
	{
		L obj = () -> {System.out.println("hey, I'm a method");};	
		obj.send();
	}
}