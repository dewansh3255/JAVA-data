//WAP to find the number of even and odd numbers sent to var args method.
class A
{
	void method(int... num)
	{
		int even=0,odd=0;
		for (int i=0;i<num.length ;i++ ) {
			if (num[i]%2==0)
			{
				even++;
			}
			else 
			{
				odd++;
			}	
		}
		System.out.println("Count of even nos. : "+even+"\nCount of odds : "+odd);
	}
	public static void main(String[] args) {
		A o = new A();
		o.method(1,2,3,4,5);
	}
}