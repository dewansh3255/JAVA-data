//Finally block
//exception handle ho ya na ho, finally block to chalega, iske baap ka raj hai

class Finally
{
	public static void main(String[] args) 
	{
		try
		{
			int data = 25/0;
			System.out.println(data);
		}	
		catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
		finally
		{
			System.out.println("finally block is always executed");
		}
	}

}