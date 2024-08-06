class Owner{
	String name;
	int age;
	String gender;

	Owner(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void display()
	{
		System.out.println("created two String and one int constructor");
		System.out.println("Owner Name:"+this.name);
		System.out.println("Owner Age:"+this.age);
		System.out.println("Owner Gender:"+this.gender);
	}
}