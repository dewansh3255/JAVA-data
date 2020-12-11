//StringBuilder

class First
{
	public static void main(String[] args) 
	{
		StringBuilder a = new StringBuilder("content");
		for(int i =0;i<10000000;i++)
		{
			a.append(" more content");
		}
		// System.out.println(a);
	}
}


//this program will compile and run very quick.