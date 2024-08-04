class Korosene
{
	double price;
	int quantity;
	boolean quality;

	public Korosene()
	{
		System.out.println("created Mask");
		System.out.println("----------------");
	}
	public Korosene(double price,int quantity,boolean quality)
	{
		System.out.println("Mask constructor with one double,one int and one boolean parameter");
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);
		System.out.println("quality:"+quality);
		System.out.println("----------------");
	}
	public Korosene(int quantity)
	{
		System.out.println("Mask constructor with one int parameter");
		this.quantity=quantity;
		System.out.println("quantity:"+quantity);
		System.out.println("----------------");
	}
	
	public Korosene(double price)
	{
		System.out.println("Mask constructor with one double parameter");
		this.price=price;
		System.out.println("price:"+price);
		System.out.println("----------------");
	}
}