//Exception propagation

class ExepPropagation
{
	void m()
	{
		int data = 50/0;
	}
	void n()
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
	public static void main(String[] args) 
	{
		ExepPropagation obj = new ExepPropagation();
		obj.p();
		System.out.println("normal flow");	
	}
}