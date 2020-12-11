//program not working and connot understand it too

import java.util.List;
import java.util.ArrayList;
class A
{
	public static void main(String[] args) 
	{
		List names = new ArrayList();
		names add("Mahesh");	
		names add("Ramesh");	
		names add("Rakesh");	
		names add("Suresh");	
		names add("Naresh");	
		names.forEach(System.out::println);
	}
}