import java.util.function.Predicate;
class PredicateInterfaceExample
{
	static Boolean checkAge(int age)
	{
		if(age>17)
			return true;
		else return false;
	}
	public static void main(String[] args) {
		//using predicate func
		Predicate<Integer> predicate = PredicateInterfaceExample::checkAge;
		//calling predicate method
		Boolean result = predicate.test(15);
		System.out.println(result);
	}
}