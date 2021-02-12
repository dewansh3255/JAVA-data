import java.util.*;
class Tile
{
	int x = 5;
}
class Floor extends Tile
{
	int f_len=25;
	int f_brd=50;
	int total_tiles(int t)
	{
		if (f_len % t==0)
		{
			f_len=f_len/t;
		}
		else
		{
			f_len=(f_len/t)+1;
		}
		if (f_brd % t==0)
		{
			f_brd=f_brd/t;
		}
		else
		{
			f_brd=(f_brd/t)+1;
		}
		return f_len*f_brd;
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Tile obj1 = new Tile();
		Floor obj2 = new Floor();
		System.out.print("The total tiles required are : ");
		System.out.println(obj2.total_tiles(obj1.x)); 
	}
}