class TestStringComparison
{
	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Zatan Tata is a rich man";
		System.out.println(s1.compareTo(s2));	//0
		System.out.println(s1.compareTo(s3));	//1   (since, s3 < s1)
		System.out.println(s3.compareTo(s1));	//-1  (since, s3 < s1)
	}
}