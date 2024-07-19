class Market
{
	public static String product(double price)
	{
		System.out.println("Running product in Market");
		if(price<500 && price>0)
		{
			return "cheap";
		}
		else if (price>500)
		{
			return "costly";
		}
		return "invalid";
	}
	public static String Phone(long phoneNo)
	{
		System.out.println("Running Phone in Market");
		if (phoneNo==6362411289L)
		{
			return "available";
		}
		else{
			return "not available";	
		}
	}
	public static void doctor(boolean available)
	{
		System.out.println("Running doctor in Market");
		if(available==true)
		{
			System.out.println("no return type");
		}
		else{
			System.out.println("not availble");
		}
		return;
	}		
}                           