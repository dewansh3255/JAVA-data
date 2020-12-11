import java.util.function.Predicate;
class PredicateInterfaceExample
{
	static Boolean checkAge(String age)
	{
		if(age.equals("true"))
		return true;
		else
		return false;
	}
	public static void main(String [] args)
	{
	//using prediacte interface
		Predicate <String> predicate = PredicateInterfaceExample :: checkAge;
		//Calling Predicate method
		Boolean result = predicate.test("true");
		System.out.println(result);
	}
}