//try-catch block

class TestTryBlock
{
	public static void main(String[] args) 
	{
		// int a = 50;
		// int b = 0;
		try{
			// int c = a/b;
			int data = 100/0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code......");	
	}
}