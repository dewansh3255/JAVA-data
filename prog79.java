//StringBuilder

class First
{
	public static void main(String[] args) 
	{
		StringBuffer a = new StringBuffer("content");
		for(int i =0;i<1000000;i++)
		{
			a.append(" more content");
		}
		System.out.println(a);
	}
}


//this program will compile and run very quick.