//SingleTon Classes

class Single
{
	private static Single s = null;
	private Single()
	{

	}
	public static Single getInstance()
	{
		if(s==null)
		{
			s = new Single();
		}
		return s;
	}
}
class Main
{
	public static void main(String[] args) {
		Single single1 = Single.getInstance();
		Single single2 = Single.getInstance();
		Single single3 = Single.getInstance();
		Single single4 = Single.getInstance();
		Single single5 = Single.getInstance();
		System.out.println(single1);
		System.out.println(single2);
		System.out.println(single3);
		System.out.println(single4);
		System.out.println(single5);
	}
}