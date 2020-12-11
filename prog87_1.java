//throw - catch
//used to explicitly throw and catch an exception

class Throw
{
	public static void main(String[] args)
	{
		int voteAge = 18;
		int age = 15;
		try
		{
			if(age<voteAge)
				throw new ArithmeticException("not valid");
			else
				System.out.println("welcome to vote");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception : "+e.getMessage());
			System.out.println("Rest of the code....");
		}
	} 
}