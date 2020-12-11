class First
{
	public static void main(String[] args) 
	{
		String s = "DewanshDewanshDewanshDewanshDewanshDewanshDewansh";
		StringBuilder a = new StringBuilder("DewanshDewanshDewanshDewanshDewanshDewansh");	
		a.replace(0,7,"Khandelwal ji ");
		s1 = s.replace("Dewansh","Khandelwal");	//we have to use s1 because string is immutable
		System.out.println(a);
		System.out.println(s);
	}	
}