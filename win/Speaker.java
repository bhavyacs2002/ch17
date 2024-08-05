class Speaker
{
	String brand;
	String size;
	double cost;
	boolean output=true;
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public Speaker(String size)
	{
		this.size=size;
	}
	public void display()
	{
		System.out.println("brand :"+this.brand);
		System.out.println("size :"+this.size);
		System.out.println("cost :"+this.cost);
		System.out.println("output :"+this.output);
	}
	}
