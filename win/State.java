class State{
	String name;
	String language;
	CapitalCity capitalCity=new CapitalCity("Bangalore",15000000);
	State(String name,String language)
	{
		System.out.println("created two string and long constructor");
		this.name=name;
		this.language=language;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Language:"+language);
		this.capitalCity.display();
	}
}