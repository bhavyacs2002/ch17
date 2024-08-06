class Country{
	String name;
	String continent;
	State state=new State("Karnataka","Kannada");
	Country(String name,String continent)
	{
		System.out.println("created two string and long constructor");
		this.name=name;
		this.continent=continent;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Continent:"+continent);
		this.state.display();
	}
}