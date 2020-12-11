//WAP to show Multilevel inheritance in jAVA
//with example of Student who is studying in clg.

class Student
{
	private String name = "Dewansh Khandelwal";
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
class School extends Student
{
	private int S_roll = 11;
	private String Schl = "St. Mary's Convent";
	public int getS_roll()
	{
		return S_roll;
	}
	public void setS_roll(int S_roll)
	{
		this.S_roll = S_roll;
	}
	public String getSchl()
	{
		return Schl;
	}
	public void setSchl(String Schl)
	{
		this.Schl = Schl;
	}
}
class College extends School
{
	private int C_roll = 5258;
	private String Clg = "SVVV";
	public int getC_roll()
	{
		return C_roll;
	}
	public void setC_roll(int C_roll)
	{
		this.C_roll = C_roll;
	}
	public String getClg()
	{
		return Clg;
	}
	public void setClg(String Clg)
	{
		this.Clg = Clg;
	}
}
class Main
{
	public static void main(String[] args) 
	{
		College clg = new College();
		System.out.println("Name : "+clg.getName());
		System.out.println("School roll no. : "+clg.getS_roll());
		System.out.println("Schhol name : "+clg.getSchl());
		System.out.println("College roll no. : "+clg.getC_roll());
		System.out.println("College name : "+clg.getClg());
	}
}