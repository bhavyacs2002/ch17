class BuyRunner
{
	public static void main(String[] args)
	{
		Buy.product("Puma",2500);
		Buy.product("",-100);
		Buy.product("dress",15,"Good",1000.0);
		Buy.product("dress",-10,"Good",1000.0);
		Buy.bookMovieTicket("Kalki","Navarangi",100,300);
		Buy.bookMovieTicket("Kalki","Navarangi",100,-100);
		Buy.buyEgg(100,12);
		Buy.buyEgg(100,-12);
		Buy.buyShampoo(50,50.00,"Chick","10-2024");
		Buy.buyShampoo(1500,50.00,"Chick","10-2024");
		Buy.buyCake('M',"EggLess","Chocolate",100.56,10);
		Buy.buyCake('M',"EggLess","Chocolate",-100.56,10);
		Buy.buyLaptop("Lenovo",10,20000,1500,13,"Windows",450,16000);
		Buy.buyLaptop("Lenovo",10,20000,00,13,"Windows",450,16000);
		Buy.buySmartWatch("titan" ,5000,5,'S',1);
		Buy.buySmartWatch("titan" ,5000,10,'S',-1);
	}
}