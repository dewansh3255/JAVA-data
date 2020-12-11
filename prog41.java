//multilevel inheritance

class Teacher 
{
	private int Id =1231;
	private String Name ="Dewansh Khandelwal";
	private String College ="SVVV";

	public int getId ()
	{
		return Id;
	}
	public void setId (int Id)
	{
		this.Id=Id;
	}
	public String getName ()
	{
		return Name;
	}
	public void setName (String Name)
	{
		this.Name=Name;
	}
	public String getCollege ()
	{
		return College;
	}
	public void setCollege (String college)
	{
		this.College=College;
	}
}
class CSEteacher extends Teacher
{
	private boolean Haslaptop = true;
	private boolean TakeOnlineClasses = true;	//mistake 1

	public boolean IsHasLaptop ()
	{
		return Haslaptop;
	}
	public void SetHasLaptop (boolean Haslaptop)	//mistake 3
	{
	 	this.Haslaptop=Haslaptop;
	}
	public boolean IsTakeOnlineClasses ()
	{
		return TakeOnlineClasses;
	}
	public void SetTakeOnlineClasses (boolean onlineclasses)
	{
		this.TakeOnlineClasses = TakeOnlineClasses;
	}
}
class HOD extends CSEteacher
{
	private String CabinNum = "526";
	private int NumberofStaff = 12;

	public String getCabinNum()
	{
		return CabinNum;
	}
	public void SetCabinNum (String cabinNum)
	{
		this.CabinNum=CabinNum;
	}
	public int getNumberofStaff ()
	{
		return NumberofStaff;
	}
	public void setNumberofStaff (int numberofStaff)
	{
		this.NumberofStaff=NumberofStaff;
	}
}
class Main
{
	public static void main(String[] args) 
	{
		HOD hod = new HOD();
		System.out.println(hod.getName ());
		System.out.println(hod.getCollege ());
		System.out.println(hod.getId ());
		System.out.println(hod.IsHasLaptop ());
		System.out.println(hod.IsTakeOnlineClasses ());	//mistke 2
		System.out.println(hod.getCabinNum ());
		System.out.println(hod.getNumberofStaff ());
	}
}