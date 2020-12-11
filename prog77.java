class A
{
	public static void main(String[] args) 
	{
		String a = "A";
		for(int i =0;i<100000;i++)
		{
			a+="JAVA";
		}	
	}
}

/*
	This is a program to explain that how a simple Siting class takes a very long
	time to compile and run a program which contains concatination of a large number
	of Strings, further we will see how we can reduce that timing with StringBuilder
	as well as StringBuffer classes
*/