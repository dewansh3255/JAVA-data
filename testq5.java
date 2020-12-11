// WAP to find sum of all inputs given at command line

class A
{
	public static void main(String[] args) 
	{
		int s=0;
		for(int i =0; i<args.length; i++)
		s += Integer.parseInt(args[i]);
		System.out.println("Sum is : "+s);
	}
}