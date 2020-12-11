//Static keyword example

class Static
{
	static int id;
	static String name;
	static double marks;
}
class A
{
	public static void main(String[] args) {
		Static.id = 123;
		Static.name = "Dewansh Khandelwal";
		Static.marks = 99.42;
		System.out.println(Static.name);
		System.out.println(Static.id);
		System.out.println(Static.marks);
	}
}