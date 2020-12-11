interface L
{
	int m(int num);
}
class Main
{
	public static void main(String[] args) 
	{
		L obj = (int num) -> {return num*num;};
			
		System.out.println("square is : "+obj.m(5));
	}
}