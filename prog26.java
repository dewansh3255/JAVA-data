//Use of final as a keyword


class A
{
	public static void main(String[] args) {
		a = 54;
		System.out.println(a);
		a = 67;
		System.out.println(a);
		final int a = 1234;
		System.out.println(a);
		// a = 123;     //this will give error
	}
}

class A
{
	public static void main(String[] args) {
		final int a;
		a = 54;		//this method is also true
		// a = 67;		//This will give error
	}
}


/*class A
{
	public static void main(String[] args) {
		final int a = 1234;
		a = 54;
		a = 67;
	}
}*/