//reference matching by == operator

class TestStringComparison
{
	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		System.out.println(s1==s2);		//true because both refer to the same instance
		System.out.println(s1==s3);		//false because different refernce created for s3 in the String pool
	}
}

/*
	s1 aur s2 ko same tarah se define kiya gya hai, 
	isliye uska reference matching me true aa jaata hai
	leking jb ham s3 ki baat kr rhe hai tb usko ek different 
	tarh se define kiya hamne, to uska refernece b alag
	banega, isliye uske comparison me false aaya tha
*/

/*
	Note : == operator compares references but equals() compares values
*/