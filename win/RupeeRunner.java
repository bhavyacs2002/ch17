class RupeeRunner
{ public static void main(String[] args)
	{
	System.out.println("starts RupeeRunner");
	Rupee rupee=new Rupee();
	String shape=rupee.shape;
	String metalUsed=rupee.metalUsed;
	int amount=rupee.amount;
	System.out.println("shape :"+shape);
	System.out.println("metalUsed :"+metalUsed);
	System.out.println("amount :"+amount);
	System.out.println("=======================");
	
	AirCondition airCondition=new AirCondition();
	String company=airCondition.company;
	double price=airCondition.price;
	int Quantity=airCondition.Quantity;
	System.out.println("company :"+company);
	System.out.println("price :"+price);
	System.out.println("Quantity :"+Quantity);
	System.out.println("=======================");
	
	AutoRikshaw autoRikshaw=new AutoRikshaw();
	String autoNo=autoRikshaw.autoNo;
	int noOfWheels=autoRikshaw.noOfWheels;
	double priceOfAuto=autoRikshaw.priceOfAuto;
	System.out.println("autoNo :"+autoNo);
	System.out.println("noOfWheels :"+noOfWheels);
	System.out.println("priceOfAuto :"+priceOfAuto);
	System.out.println("=======================");
	
	AutoDriver autoDriver=new AutoDriver();
	String name=autoDriver.name;
	long PhoneNo=autoDriver.PhoneNo;
	int age=autoDriver.age;
	System.out.println("name :"+name);
	System.out.println("PhoneNo :"+noOfWheels);
	System.out.println("age :"+age);
	System.out.println("=======================");
	
	Rapido rapido=new Rapido();
	String driverName=rapido.driverName;
	String VehicleType=rapido.VehicleType;
	int vehicleNo=rapido.vehicleNo;
	System.out.println("driverName :"+driverName);
	System.out.println("VehicleType :"+VehicleType);
	System.out.println("vehicleNo :"+vehicleNo);
	System.out.println("=======================");
	
	CabCompany cabCompany=new CabCompany();
	String companyName=cabCompany.companyName;
	double ticketPrice=cabCompany.ticketPrice;
	boolean isAvailable=cabCompany.isAvailable;
	System.out.println("companyName :"+companyName);
	System.out.println("ticketPrice :"+ticketPrice);
	System.out.println("isAvailable :"+isAvailable);
	System.out.println("=======================");
	
	BMTC bmtc=new BMTC();
	String conductorName=bmtc.conductorName;
	double busTicket=bmtc.busTicket;
	String destinationPlace=bmtc.destinationPlace;
	System.out.println("conductorName :"+conductorName);
	System.out.println("busTicket :"+busTicket);
	System.out.println("destinationPlace :"+destinationPlace);
	System.out.println("=======================");
	
	FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
	String nameOfCompany=foodDeliveryCompany.nameOfCompany;
	double deliveryCharge=foodDeliveryCompany.deliveryCharge;
	boolean isInService=foodDeliveryCompany.isInService;
	System.out.println("nameOfCompany :"+nameOfCompany);
	System.out.println("deliveryCharge :"+deliveryCharge);
	System.out.println("isInService :"+isInService);
	System.out.println("=======================");
	
	System.out.println("ends RupeeRunner");
	
	
}
}