interface Shape
{
	void Area();
	void Perimeter();
}
class Square implements Shape
{
	int s;
	public void Area()
	{
		System.out.println(s*s);
	}
	public void Perimeter()
	{
		System.out.println(4*s);
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Square sq = new Square();
		sq.s = 4;
		sq.Area();
		sq.Perimeter();
	}
}