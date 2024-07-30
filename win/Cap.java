class Cap
{
	String color;
	double price;
	String brand;
	public Cap(String capColor,String capBrand,double capPrice)
	{
		System.out.println("Cap created");
		color=capColor;
		price=capPrice;
		brand=capBrand;
		System.out.println("capColor:"+capColor);
		System.out.println("capBrand:"+capBrand);
		System.out.println("capPrice:"+capPrice);
	}
}