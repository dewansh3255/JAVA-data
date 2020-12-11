class First
{
	public static void main(String[] args) 
	{
		StringBuilder a = new StringBuilder(2);		
		//here we've set the initial capacity to be 5
		System.out.println(a.capacity());	// 2
		a.append("Dewansh");						
		/*here, since the size of string exceeded the general formula size, 
		hence it takes the min size it can have with that string since the spelling 
		contains 7 characters, hence the string extends to 7*/
		System.out.println(a.capacity());	// 7 (which is >= (2*2)+2 )
		a.append("Dewansh");
		System.out.println(a.capacity());	// 16 ((7*2)+2)
		a.append("Dewansh");
		System.out.println(a.capacity());	// 34 ((16*2)+2)	
		a.append("Dewansh");
		System.out.println(a.capacity());	// 34
		a.append("Dewansh");
		System.out.println(a.capacity());	// 70
		a.append("Dewansh");
		System.out.println(a.capacity());	// 70
	}
}