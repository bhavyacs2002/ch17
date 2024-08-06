class SoftwareEngineer{
	String name;
	int experience;
	String designation;
	long salary;
	SoftwareEngineer(String name,int experience,String designation,long salary)
	{
		System.out.println("created one int,and two string and long constructor");
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Experience:"+experience);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
	}
}