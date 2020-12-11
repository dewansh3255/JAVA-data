class A
{
	public static void main(String[] args) 
	{
		int a,b;
		a = Integer.parseInt(args[0]);	
		b = Integer.parseInt(args[1]);	
		if(a%2==0)
			System.out.println("The next 2 adjacent even numbers of "+a+" are "+(a+2)+" and "+(a+4));
		else
			System.out.println("The next 2 adjacent even numbers of "+a+" are "+(a+1)+" and "+(a+3));	
		if(b%2==0)
			System.out.println("The next 2 adjacent even numbers of "+b+" are "+(b+2)+" and "+(b+4));
		else
			System.out.println("The next 2 adjacent even numbers of "+b+" are "+(b+1)+" and "+(b+3));	
		
	}
}