class Vehicle
{
	private String engine = "Honda";
	private boolean hasbreak = true;
	public String getEngine()
	{
		return engine;
	}
	public void setEngine(String engine)
	{
		this.engine = engine;
	}
	public boolean getHasbreak()
	{
		return hasbreak;
	}
	public void setHasbreak(boolean hasbreak)
	{
		this.hasbreak = hasbreak;
	}
}
class Bike extends Vehicle
{
	private boolean hasGear = false;
	private boolean roundHandle = false;
	public boolean gethasGear()
	{
		return hasGear;
	}
	public void sethasGear(boolean hasGear)
	{
		this.hasGear = hasGear;
	}
	public boolean getroundHandle()
	{
		return roundHandle;
	}
	public void setroundHandle(boolean roundHandle)
	{
		this.roundHandle = roundHandle;
	}
}
class Car extends Vehicle
{
	private boolean hasGear = true;
	private boolean roundHandle = true;
	public boolean gethasGear()
	{
		return hasGear;
	}
	public void sethasGear(boolean hasGear)
	{
		this.hasGear = hasGear;
	}
	public boolean getroundHandle()
	{
		return roundHandle;
	}
	public void setroundHandle(boolean roundHandle)
	{
		this.roundHandle = roundHandle;
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Bike bike = new Bike();
		Car car = new Car();
		System.out.println(bike.getEngine());	
		System.out.println(bike.getHasbreak());	
		System.out.println(bike.gethasGear());	
		System.out.println(bike.getroundHandle());	
		System.out.println(car.getEngine());	
		System.out.println(car.getHasbreak());	
		System.out.println(car.gethasGear());	
		System.out.println(car.getroundHandle());	
	}
}