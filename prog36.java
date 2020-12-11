class A
{
	void method(int... num)		//make sure 3 dots only
	{
		int sum = 0;
		for(int i =0;i<num.length;i++)
		{
			sum+=num[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		A o = new A();
		int n1[] = {1,2,3,4,5,6,7,8,9,10};
		int n2[] = {1,2,3,4,5,6,7};
		o.method(n1);
		o.method(n2);
	}
}