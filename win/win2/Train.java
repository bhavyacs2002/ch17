class Train{
	public static void book(String source,String destination)
	{
		System.out.println("Running book method in class train with two string parameter");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
	}
	public static void book(String source,String destination,int quantity)
	{
		System.out.println("Running book method in class train with two string parameter and one int parameter");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Quantity:"+quantity);
	}
	public static void book(String source,String destination,int quantity,double price)
	{
		System.out.println("Running book method in class train with two string parameter and one int parameter and one double parameter");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
	}
	public static void cancel(int ticketNo)
	{
		System.out.println("Running book method in class train with one int parameter");
		System.out.println("ticket No:"+ticketNo);	
	}
	public static void cancel(String source,String destination)
	{
		System.out.println("Running book method in class train with two string parameter");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
	}
}