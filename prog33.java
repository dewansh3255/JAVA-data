//Array of abjects
class A
{
	int id;
	public A(int id)
	{
		this.id=id;
	}
	public static void main(String[] args) {
		A object[] = new A[10];
		for (int i=0;i<10 ;i++ )
		{
			object[i] = new A(i+1);
			System.out.println(object[i].id);	
		}
	}
}