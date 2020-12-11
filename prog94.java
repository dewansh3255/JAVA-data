class Demo
{
	public static void main(String[] args) 
	{
		try
		{
			if(false)
			{
				System.out.println(10/0);
			}
			else if(true)
			{
				int A[] = new int[5];
				A[5] = 10;
			}
			else
			{
				String s = "abcd";
				System.out.println(s.charAt(8));
			}
		}	
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("End of code <\\>");
	}
}