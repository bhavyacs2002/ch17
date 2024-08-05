class ChocolateRunner
{
	public static void main(String[] args)
	{
		Chocolate chocolate=new Chocolate("ButterScotch");
		chocolate.setCountry("DairyMilk");
		chocolate.size="small";
		chocolate.display();
		Chocolate chocolate1=new Chocolate("vennela");
		chocolate1.setCountry("Fivestar");
		chocolate1.size="medium";
		chocolate1.display();
		Chocolate chocolate2=new Chocolate("Strawberry");
		chocolate2.setCountry("Milkybar");
		chocolate2.size="large";
		chocolate2.display();	
	}
}