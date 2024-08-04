class Kerosene
{
	double price;
	int quantity;
	boolean quality;

	public Kerosene()
	{
		System.out.println("created Kerosene");
	}
	public Kerosene(double price,int quantity,boolean quality)
	{
		System.out.println("----------------");
		System.out.println("Kerosene constructor with one double,one int and one boolean parameter");
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
	}
	public Kerosene(boolean quality)
	{
		System.out.println("----------------");
		System.out.println("Kerosene constructor with one int parameter");
		this.quantity=quantity;
	}
	
	public Kerosene(double price)
	{
		System.out.println("----------------");
		System.out.println("Kerosene constructor with one double parameter");
		this.price=price;
	}
}