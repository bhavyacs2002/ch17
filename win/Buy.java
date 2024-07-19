class Buy{
	public static void product(String brand,double price )
	{
		System.out.println("Running product in Buy with one string and one double parameter");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		if (price<5000 && price>=1000)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is in-valid");
		}
	}
	public static void product(String name,int quantity,String quality,double price)
	{
		System.out.println("Running product in Buy with two string,one int and one double parameter");
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("quality:"+quality);
		System.out.println("price:"+price);
		if (quantity<100 && quantity>10)
		{
			System.out.println("quantity is valid");
		}
		else
		{
			System.out.println("quantity is in-valid");
		}
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("Running bookMovieTicket in Buy with two string,one int and one double parameter");
		System.out.println("name:"+name);
		System.out.println("theaterName:"+theaterName);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		if (price>100 && price<1000)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is in-valid");
		}
	}
	public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("Running buyEgg in Buy with one int and one double parameter");
		System.out.println("total:"+total);
		System.out.println("pricePerEgg:"+pricePerEgg);
		if (pricePerEgg<15 && pricePerEgg>10)
		{
			System.out.println("pricePerEgg is valid");
		}
		else
		{
			System.out.println("pricePerEgg is in-valid");
		}
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("Running buyShampoo in Buy with one int,one double and two string parameter");
		System.out.println("quantityInMl:"+quantityInMl);
		System.out.println("price:"+price);
		System.out.println("brand:"+brand);
		System.out.println("manfDate:"+manfDate);
		if (quantityInMl<100 && quantityInMl>20)
		{
			System.out.println("quantityInMl is valid");
		}
		else
		{
			System.out.println("quantityInMl is in-valid");
		}
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("Running buyCake in Buy with one char,one int,one double and two string parameter");
		System.out.println("size:"+size);
		System.out.println("type:"+type);
		System.out.println("flavour:"+flavour);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		if (cost>20 && cost<1000)
		{
			System.out.println("cost is valid");
		}
		else
		{
			System.out.println("cost is in-valid");
		}
	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("Running buyCake in Buy with one char,one int,one double and two string parameter");
		System.out.println("brand:"+brand);
		System.out.println("serialNo:"+serialNo);
		System.out.println("price:"+price);
		System.out.println("batteryCapacity:"+batteryCapacity);
		System.out.println("screenSize:"+screenSize);
		System.out.println("os:"+os);
		System.out.println("harddiskSize:"+harddiskSize);
		System.out.println("ramSize:"+ramSize);
		if (batteryCapacity>1000 && batteryCapacity<2800)
		{
			System.out.println("batteryCapacity is valid");
		}
		else
		{
			System.out.println("batteryCapacity is in-valid");
		}
	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		System.out.println("Running buySmartWatch in Buy with one string,two int,one double and one char parameter");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("mode:"+mode);
		if (color>1 && color<=7)
		{
			System.out.println("color is valid");
		}
		else
		{
			System.out.println("color is in-valid");
		}
	}
}
