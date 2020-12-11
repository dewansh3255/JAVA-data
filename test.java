class Test
{
	int a,b;
	Test(int i, int j)
	{
		i=a;
		j=b;
	}
	boolean equalTo(Test o)
	{
		if(o.a==a && o.b==b)
			return true;
		else
			return false;
	}
}
class Passob
{
	public static void main(String[] args) {
		Test obj1 = new Test(100,44);
		Test obj2 = new Test(100,44);
		Test obj3 = new Test(22,67);
		System.out.println("obj1==obj2"+obj1.equalTo(obj2));
		System.out.println("obj1==obj3"+obj1.equalTo(obj3));

	}
}