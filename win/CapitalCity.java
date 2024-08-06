class CapitalCity
{
	String name;
	long population;
	CapitalCity(String name,long population)
	{
		System.out.println("created one string and long constructor");
		this.name=name;
		this.population=population;
	}
	public void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Population:"+this.population);
	}
}