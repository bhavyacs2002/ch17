class Paint{
	public static void car(String brand)
	{
		System.out.println("Running car method in class paint with one string parameter");
		System.out.println("Brand:"+brand);
	}
	public static void car(String brand,String color)
	{
		System.out.println("Running car method in class paint with two string parameter");
		System.out.println("Brand:"+brand);
		System.out.println("color:"+color);	
	}
	public static void car(String brand,int price )
	{
		System.out.println("Running car method in class paint with two parameter where one is of string type and the another one is of int type");
		System.out.println("Brand:"+brand);
		System.out.println("price:"+price);
	}
	public static void car(String color,String type,int price )
	{
		System.out.println("Running car method in class paint with three parameter where two are of string type and the another one is of int type");
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("price:"+price);
	}
}