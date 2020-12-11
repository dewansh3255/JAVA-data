interface Abs1
{
	public void fun1();
}
interface Abs2 extends Abs1
{
	public void fun2();
}
class Main implements Abs2{
	public void fun1()
	{
		System.out.println("fun1");
	}
	public void fun2()
	{
		System.out.println("fun2");
	}
	public static void main(String[] args) {
	
		Main m = new Main();
		m.fun1();	
		m.fun2();	
	}
}