class Mask{
	double cost;
	char size;
	String material;
	public Mask()
	{
		System.out.println("created Mask");
		System.out.println("----------------");
	}
	public Mask(double cost)
	{
		System.out.println("Mask constructor with one double parameter");
		System.out.println("----------------");
	}
	
	public Mask(char size)
	{
		System.out.println("Mask constructor with one char parameter");
		this.size=size;
		System.out.println("----------------");
	}
	
	public Mask(String material)
	{
		System.out.println("----------------");
		System.out.println("Mask constructor with one string parameter");
		this.material=material;
	}
	
	public Mask(double cost,char size)
	{
		System.out.println("----------------");
		System.out.println("Mask constructor with one double,one char parameter");
		this.cost=cost;
		this.size=size;
	}
	
	public Mask(double cost,char size,String material)
	{
		System.out.println("----------------");
		System.out.println("Mask constructor with one double,one char and one string parameter");
		this.cost=cost;
		this.size=size;
		this.material=material;
	}
	
}