class Hotel
{
	public static void place(String location)
	{
		System.out.println("place method declared in class hotel with one strig parameter");
		System.out.println("location:"+location);
	}
	public static void order(String dish,double price)
	{
		System.out.println("place method declared in class hotel with one strig parameter and one double parameter");
		System.out.println("dish:"+dish);
	}
	public static void guestService(boolean isAvailable,String dish,double price)
	{
		System.out.println("place method declared in class hotel with one boolean parameter,one strig parameter and one double parameter");
		System.out.println("isAvailable:"+isAvailable);
		System.out.println("dish:"+dish);
		System.out.println("price:"+price);
	}
	public static void menue(String dish,double price,boolean isDishAvailable)
	{
		System.out.println("place method declared in class hotel with one strig parameter,one boolean parameter and one double parameter");
		System.out.println("dish:"+dish);
		System.out.println("price:"+price);
		System.out.println("isDishAvailable:"+isDishAvailable);
	}
	public static void rating(float rate)
	{
		System.out.println("place method declared in class hotel with one int parameter");
		System.out.println("rate:"+rate);
	}	
}