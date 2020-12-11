//multiple catch

class Demo
{
	public static void main(String[] args) 
	{
		try
		{
			if(false)			//here we give the give anser for condition as true or false without even giving the condition
			{
				System.out.println(10/0);
			}
			else if (false)		//we can change the false with true and vice-versa anytime to turn on/off the condition
			{
				int A[] = new int [5];
				A[6] = 10;
			}
			else
			{
				String s = "abcd";
				System.out.println(s.charAt(8));
			}
		}	
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}