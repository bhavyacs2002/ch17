class RocketRunner
{
	public static void main(String[] args)
	{
		Rocket rocket=new Rocket(3500);
		rocket.setCountry("Russia");
		rocket.noOfThrusters=50;
		rocket.display();
		Rocket rocket1=new Rocket(4500);
		rocket1.setCountry("India");
		rocket1.noOfThrusters=25;
		rocket1.display();
		Rocket rocket2=new Rocket(5500);
		rocket2.setCountry("USA");
		rocket2.noOfThrusters=30;
		rocket2.display();	
	}
}