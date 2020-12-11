class A
{
	public static void main(String[] args) 
	{
		String a = new String("        Hello, I am Dewansh Khandelwal");
		String b = a.substring(5,12).toUpperCase().trim();
		String c = a.substring(5,12).toUpperCase();
		String d = a.trim().substring(5,12).toUpperCase();
		System.out.println(a);	
		System.out.println(b);	
		System.out.println(c);	
		System.out.println(d);	
	}
}