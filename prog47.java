//overriding abstract classes
import java.util.Scanner;
abstract class Shape
{
	int area;
	abstract void Area();
}
class Square extends Shape
{
	int s;
	void Area()
	{
		System.out.println("Area of the square is "+(s*s));
	}
}
class Reactangle extends Shape
{
	int l,b;
	void Area()
	{
		System.out.println("Area of the rectangle is "+(l*b));
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Square sq = new Square();
		Reactangle rect = new Reactangle();
		System.out.print("Enter the side of Sqaure : ");	
		sq.s = sc.nextInt();
		System.out.print("Enter the length of rectangle : ");
		rect.l = sc.nextInt();
		System.out.print("Enter the width  of rectangle : ");
		rect.b = sc.nextInt();
		sq.Area();
		rect.Area();
	}
}