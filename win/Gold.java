class Gold
{
	int carat;
	double price;
	int grams;
	public Gold(int goldCarat,int goldGrams,double goldPrice)
	{
		System.out.println("Gold created");
		carat=goldCarat;
		grams=goldGrams;
		price=goldPrice;
		System.out.println("carat:"+carat);
		System.out.println("grams:"+grams);
		System.out.println("price:"+price);
	}
}