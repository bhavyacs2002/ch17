class Lens
{
	String company;
	double price;
	public Lens(String lensCompany,double lensPrice)
	{
		System.out.println("Lens created");
		company=lensCompany;
		price=lensPrice;
		System.out.println("lensCompany:"+company);
		System.out.println("lensPrice:"+price);
	}
}