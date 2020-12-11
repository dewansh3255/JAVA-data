import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		float b;
		char c;
		double d;
		long l;
		boolean bool;
		byte by;
		String s;
		short sh;
		System.out.print("\nEnter a number (byte) : ");
		by = sc.nextByte();
		System.out.print("\nEnter a number (short) : ");
		sh = sc.nextShort();
		System.out.print("\nEnter a number (int) : ");
		a = sc.nextInt();
		System.out.print("\nEnter a number (long) : ");
		l = sc.nextLong();
		System.out.print("\nEnter a float (float) : ");
		b = sc.nextFloat();
		System.out.print("\nEnter a float (double) : ");
		d = sc.nextDouble();
		System.out.print("\nEnter a string (string) : ");
		s = sc.next();	
	    /*	here if we write nextLine() in place of next() 
	    then it is not taking input for string
		but if we put the string input on top of all inputs
		it is working	*/
		System.out.print("\nEnter a Boolean : ");
		bool = sc.nextBoolean();
		System.out.println("Byte 		: "+by);	
		System.out.println("Short 		: "+sh);	
		System.out.println("Interger 	: "+a);	
		System.out.println("Long 		: "+l);	
		System.out.println("Float 		: "+b);	
		System.out.println("Double 		: "+d);	
		System.out.println("String 		: "+s);	
		System.out.println("Boolean 	: "+bool);	
	}
}