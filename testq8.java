//WAP to find the sum of even and odd numbers sent to var args method.
class A
{
	void method(int... num)
	{
		int esum=0,osum=0;
		for (int i=0;i<num.length ;i++ ) {
			if (num[i]%2==0)
			{
				esum+=num[i];
			}
			else 
			{
				osum+=num[i];
			}	
		}
		System.out.println("Sum of even nos is : "+esum);
		System.out.println("Sum of odd nos is  : "+osum);
	}
	public static void main(String[] args) {
		A o = new A();
		o.method(1,2,3,4,5);
	}
}