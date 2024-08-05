class Rocket
{
	String country;
	double speed=1000;
	double fuelCapacity;
	int noOfThrusters;
	public void setCountry(String country)
	{
		this.country=country;
	}
	public Rocket(double fuelCapacity)
	{
		this.fuelCapacity=fuelCapacity;
	}
	public void display()
	{
		System.out.println("country :"+this.country);
		System.out.println("speed :"+this.speed);
		System.out.println("fuelCapacity :"+this.fuelCapacity);
		System.out.println("noOfThrusters :"+this.noOfThrusters);
	}
	}