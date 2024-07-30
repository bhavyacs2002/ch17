class ChargerRunner
{
	public static void main(String[] args)
	{
	System.out.println("starts ChargerRunner");
	Charger charger=new Charger();
	charger.company="One plus";
	charger.price=1000;
	System.out.println("charger company:"+charger.company);
	System.out.println("charger price:"+charger.price);
	System.out.println("charger type:"+charger.type);
	System.out.println("===================");
	
	Claw claw=new Claw();
	claw.clawAnimal="Tiger";
	claw.clawLength=5;
	System.out.println("clawAnimal:"+claw.clawAnimal);
	System.out.println("clawLength:"+claw.clawLength);
	System.out.println("clawShape:"+claw.clawShape);
	System.out.println("===================");
	
	Crow crow=new Crow();
	crow.color="black";
	crow.canFly=true;
	System.out.println("color:"+crow.color);
	System.out.println("canFly:"+crow.canFly);
	System.out.println("type:"+crow.type);
	System.out.println("===================");
	
	Clock clock=new Clock();
	clock.time="10.30";
	clock.type="Digital";
	System.out.println("time:"+clock.time);
	System.out.println("type:"+clock.type);
	System.out.println("model:"+clock.model);
	System.out.println("===================");
	
	Lolipop lolipop=new Lolipop();
	lolipop.lolipopName="Chupa Chup";
	lolipop.flavor="chocolate";
	System.out.println("lolipopName:"+lolipop.lolipopName);
	System.out.println("flavor:"+lolipop.flavor);
	System.out.println("price:"+lolipop.price);
	System.out.println("===================");
	
	Jean jean=new Jean();
	jean.jeanType="Torn";
	jean.jeanBrand="Puma";
	System.out.println("jeanType:"+jean.jeanType);
	System.out.println("jeanBrand:"+jean.jeanBrand);
	System.out.println("jeanPrice:"+jean.jeanPrice);
	System.out.println("===================");
	
	Keyboard keyboard=new Keyboard();
	keyboard.connectivity="wired";
	keyboard.keyboardType="Mechanical";
	System.out.println("connectivity:"+keyboard.connectivity);
	System.out.println("keyboardType:"+keyboard.keyboardType);
	System.out.println("noOfKeys:"+keyboard.noOfKeys);
	System.out.println("===================");
	
	Mountain mountain=new Mountain();
	mountain.mountainName="Mount Everest";
	mountain.mountainHeight=128849;
	System.out.println("mountainName:"+mountain.mountainName);
	System.out.println("mountainHeight:"+mountain.mountainHeight);
	System.out.println("mountainLocation:"+mountain.mountainLocation);
	System.out.println("===================");
	
	Stadium stadium=new Stadium();
	stadium.stadiumName="Chinnaswamy";
	stadium.buildYear=2008;
	System.out.println("stadiumName:"+stadium.stadiumName);
	System.out.println("buildYear:"+stadium.buildYear);
	System.out.println("stadiumLocation:"+stadium.stadiumLocation);
	System.out.println("===================");
	
	Spray spray=new Spray();
	spray.sprayBrand="Tresseme";
	spray.expiryYear=2028;
	System.out.println("sprayBrand:"+spray.sprayBrand);
	System.out.println("expiryYear:"+spray.expiryYear);
	System.out.println("sprayType:"+spray.sprayType);
	System.out.println("===================");
}
}