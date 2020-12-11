class InvalidAge extends Exception
{
	InvalidAge(String s)
	{
		super (s);
	}
}		//what is this block, doubt

class TestCustom
{
	static void validate (int age) throws InvalidAge
	{
		if(age<18)
			throw new InvalidAge("You are below 18, growUp");
		else
			System.out.println("Welcome to come");
	}
	public static void main(String[] args) 
	{
		try
		{
			validate(17);
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}
}