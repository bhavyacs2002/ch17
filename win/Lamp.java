class Lamp
{
	String name;
	double price;
	public Lamp(String lampName,double lampPrice)
	{
		System.out.println("Lamp created");
		name=lampName;
		price=lampPrice;
		System.out.println("lampName:"+name);
		System.out.println("lampPrice:"+price);
	}
}