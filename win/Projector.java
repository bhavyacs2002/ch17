class Projector
{
	String company;
	String type="wireless";
	String color;
	double weight;
	public void setCompany(String company)
	{
		this.company=company;
	}
	public Projector(String color)
	{
		this.color=color;
	}
	public void display()
	{
		System.out.println("company :"+this.company);
		System.out.println("type :"+this.type);
		System.out.println("color :"+this.color);
		System.out.println("weight :"+this.weight);
	}
	}