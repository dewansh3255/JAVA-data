class First
{
	public static void main(String[] args) 
	{
		long l = System.currentTimeMillis();
		System.out.println("Time = "+(System.currentTimeMillis()-l));	
		StringBuilder bf = new StringBuilder();
		for (int i = 0;i<10000;i++) 
		{
			bf.append("JAVA");		
		}
		System.out.println("Time = "+(System.currentTimeMillis()-l));	
	}
}