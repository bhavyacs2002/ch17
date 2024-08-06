class Hotel
{
	String name="Udupi";
	Owner owner=new Owner("Bhavya",22,"Female");
	Hotel()
	{
		System.out.println("created no-arg constructor");
	}
	public void display()
	{
		System.out.println("Owner Name"+this.name);
		this.owner.display();
	}
}