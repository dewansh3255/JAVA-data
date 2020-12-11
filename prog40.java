//Single inheritance

class Teacher
{
	private String designation = "Teacher" ;
	private String collegeName = "SVVV" ;
	public String getDesignation()
	{
		return designation;
	}
	public void setdesignation(String designation)
	{
		this.designation = designation;
	}
	public String getcollegeName()
	{
		return collegeName;
	}
	public void setcollegeName(String collegeName)
	{
		this.collegeName = collegeName;
	}
	void does()
	{
		System.out.println("Teaching");
	}
}
class JavaExample extends Teacher
{
	String mainSubject = "Physics";
	public static void main(String[] args) {
		JavaExample obj = new JavaExample();
		System.out.println(obj.getcollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();
	}
}