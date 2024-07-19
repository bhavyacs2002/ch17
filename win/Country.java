class Country
{
	public static String countryCode(int code)
	{
		System.out.println("starting countryCode in Country");
		if (code==91)
		{
			return "India";
		}
		if (code==001)
		{
			return "USA";
		}
		if (code==44)
		{
			return "UK";
		}
		if (code==971)
		{
			return "Dubai";
		}
		if (code==33)
		{
			return "France";
		}
		return "Not found";
	}
	public static double price(String item)
	{
		System.out.println("starting price in Country");
		if (item=="Book")
		{
			return 45;
		}
		if (item=="Pen")
		{
			return 15;
		}
		if (item=="Pencil")
		{
			return 10;
		}
		if (item=="scale")
		{
			return 12;
		}
		if (item=="Eraser")
		{
			return 5;
		}
		return 0;
	}
	public static String movie(String movieName)
	{
		if (movieName=="Kalki")
		{
			return "Aswani Dutt";
		}
		if (movieName=="Love Mocktail")
		{
			return "Darling Krishna";
		}
		if (movieName=="Mungaru Male")
		{
			return "Krishnappa";
		}
		if (movieName=="KGF")
		{
			return "Vijay";
		}
		if (movieName=="Mahanati")
		{
			return "Priyanka Dutt";
		}
		return "Not found";
	}
}