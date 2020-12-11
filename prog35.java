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
		o.method(1);
		o.method(31,32,33,34,35,36);
		o.method(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
	}
}