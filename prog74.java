//Authentication - ie. only comparing the values but not references

class A
{
	public static void main(String[] args) 
	{
		String a = new String("A string");
		String b = "a string";
		System.out.println(a);	
		System.out.println(b);	
		System.out.println(a.equalsIgnoreCase(b));
	}
}