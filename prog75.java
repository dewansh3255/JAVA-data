class A
{
	public static void main(String[] args) 
	{
		String url = "http://localhost:3306/mysql";
		String sub = url.substring (4);		 
		System.out.println(sub);			//string from 4th index
		sub = url.substring(4,10);			
		System.out.println(sub);			
		/*
		this will print the string from 4th index till 9th index, 
		as the 10th index value will be ommited	
		we can also remember this by 10-4=6, so only 6 valueues will be printed	
		*/
	}
}