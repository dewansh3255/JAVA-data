import java.util.function.Predicate;
class PredecateInterfaceExample
{
	public static void main(String[] args) 
	{
		Predicate <Integer> pr = a -> (a>10);	//creating predicate
		System.out.println(pr.test(10));		//calling Predicate method	
	}
}