class Company
{
	int id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("John",5,"Software developer",350000);
	Company(int id,String name,String location)
	{
		System.out.println("created one int,and two string constructor");
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public void display()
	{
		System.out.println("id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Location:"+this.location);
		this.softwareEngineer.display();
	}
}