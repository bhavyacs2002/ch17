class Chocolate
{
	String brand;
	double price=1000;
	String flavor;
	String size;
	public void setbrand(String brand)
	{
		this.brand=brand;
	}
	public Chocolate(String flavor)
	{
		this.flavor=flavor;
	}
	public void display()
	{
		System.out.println("brand :"+this.brand);
		System.out.println("flavor :"+this.flavor);
		System.out.println("price :"+this.price);
		System.out.println("size :"+this.size);
	}
	}