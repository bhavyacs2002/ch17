class JuiceShopRunner{
	public static void main(String[] juiceInfo)
	{
		System.out.println("starts juiceInfo in JuiceShopRunner");
		if(juiceInfo.length==5)
		{
		String name=juiceInfo[0];
		String brand= juiceInfo[1];
		String flavour= juiceInfo[2];
		String price= juiceInfo[3];
		String quantity= juiceInfo[4];
			
	
		float convertedprice=Float.parseFloat(price);
		float convertedquantity=Float.parseFloat(quantity);
		

		JuiceShop.juiceDetails(name,brand,flavour,convertedprice,convertedquantity);
		}
		System.out.println("ends juiceInfo in JuiceShopRunner");
		
	}
}