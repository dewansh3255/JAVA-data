class NestTry
{
	public static void main(String[] args) 
	{
		try
		{
			try
			{
				System.out.println("going to divide");
				int b= 39/0;
			}catch(ArithmeticException e){System.out.println(e);}
			System.out.println("other statement");
			// String s = "abcd";
			// System.out.println(s.charAt(10));
		}catch(Exception e){System.out.println("handeled");}
		System.out.println("normal flow...");
	}
}