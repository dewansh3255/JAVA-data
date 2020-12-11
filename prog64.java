class TestStringComparison
{
	public static void main(String[] args) 
	{
		String s1 = "sachin";
		String s2 = "sAchin";
		System.out.println(s1.equals(s2));				//false
		System.out.println(s1.equalsIgnoreCase(s2));	//true
	}
}