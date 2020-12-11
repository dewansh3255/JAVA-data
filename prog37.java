//Method overloading in JAVA

class A
{
	void sum(int a, int b)
	{
		int s = a+b;
		System.out.println(s);
	}
	void sum(int a, int b,int c)
	{
		int s = a+b+c;
		System.out.println(s);
	}
	void sum(int a, int b,int c,int d)
	{
		int s = a+b+c+d;
		System.out.println(s);
	}
	void sum(int a, int b,int c,int d,int e)
	{
		int s = a+b+c+d+e;
		System.out.println(s);
	}
	public static void main(String[] args) {
		A o = new A();
		o.sum(1,2);
		o.sum(1,2,3);
		o.sum(1,2,3,4);
		o.sum(1,2,3,4,5);
	}
}