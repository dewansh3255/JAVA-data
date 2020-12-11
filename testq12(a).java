//Final Keyword example

class A
{
	public static void main(String[] args) {
		int a = 54;
		System.out.println(a);
		int a = 67;
		System.out.println(a);
		final int a = 1234;
		System.out.println(a);
		// a = 123;     //this will give error
	}
}