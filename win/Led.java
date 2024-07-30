class Led
{
	String color;
	String type;
	double price;
	public Led(String ledColor,String ledType,double ledPrice)
	{
		System.out.println("Led created");
		color=ledColor;
		type=ledType;
		price=ledPrice;
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("price:"+price);
	}
}