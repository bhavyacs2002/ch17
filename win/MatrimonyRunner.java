class MatrimonyRunner
{
	public static void main(String[] args)
	{
		System.out.println("starts MatrimonyRunner");
		Matrimony matrimony=new Matrimony();
		String matrimonyCompanyName=matrimony.matrimonyCompanyName;
		int totalApplications=matrimony.totalApplications;
		String brideDetails=matrimony.brideDetails;
		System.out.println("matrimonyCompanyName :"+matrimonyCompanyName);
		System.out.println("totalApplications :"+totalApplications);
		System.out.println("brideDetails :"+brideDetails);
		matrimony.matrimonyCompanyName="Blissbond";
		matrimony.totalApplications=100;
		matrimony.brideDetails="name=Jonhson"; 
		System.out.println("");
		System.out.println("updated matrimonyCompanyName :"+matrimony.matrimonyCompanyName);
		System.out.println("updated totalApplications :"+matrimony.totalApplications);
		System.out.println("updated brideDetails :"+matrimony.brideDetails);
		System.out.println("=======================");
		
		Application application=new Application();
		String applicationName=application.applicationName;
		String useOfApplication=application.useOfApplication;
		boolean isDefault=application.isDefault;
		System.out.println("applicationName :"+applicationName);
		System.out.println("useOfApplication :"+useOfApplication);
		System.out.println("isDefault :"+isDefault);
		application.applicationName="Difference Find";
		application.useOfApplication="Playing";
		application.isDefault=false;
		System.out.println("");
		System.out.println("updated applicationName :"+application.applicationName);
		System.out.println("updated useOfApplication :"+application.useOfApplication);
		System.out.println("updated isDefault :"+application.isDefault);
		System.out.println("=======================");
		
		Fruit fruit=new Fruit();
		String fruitName=fruit.fruitName;
		double fruitPrice=fruit.fruitPrice;
		int quantity=fruit.quantity;
		System.out.println("fruitName :"+fruitName);
		System.out.println("fruitPrice :"+fruitPrice);
		System.out.println("quantity :"+quantity);
		fruit.fruitName="Pomogranate";
		fruit.fruitPrice=250;
		fruit.quantity=20;
		System.out.println("");
		System.out.println("updated fruitName :"+fruit.fruitName);
		System.out.println("updated fruitPrice :"+fruit.fruitPrice);
		System.out.println("updated quantity :"+fruit.quantity);
		System.out.println("=======================");
		
		Place place=new Place();
		String placeName=place.placeName;
		String famousFor=place.famousFor;
		double totalArea=place.totalArea;
		System.out.println("placeName :"+placeName);
		System.out.println("famousFor :"+famousFor);
		System.out.println("totalArea :"+totalArea);
		place.placeName="Mysore";
		place.famousFor="Palace";
		place.totalArea=6523.746;
		System.out.println("");
		System.out.println("updated placeName :"+place.placeName);
		System.out.println("updated famousFor :"+place.famousFor);
		System.out.println("updated totalArea :"+place.totalArea);
		System.out.println("=======================");
		
		AlcoholBrand alcoholBrand=new AlcoholBrand();
		String brandName=alcoholBrand.brandName;
		double Quantity=alcoholBrand.Quantity;
		double priceOfAlcohol=alcoholBrand.priceOfAlcohol;
		System.out.println("brandName :"+brandName);
		System.out.println("Quantity :"+Quantity);
		System.out.println("priceOfAlcohol :"+priceOfAlcohol);
		alcoholBrand.brandName="Kingfisher";
		alcoholBrand.Quantity=250;
		alcoholBrand.priceOfAlcohol=652.46;
		System.out.println("");
		System.out.println("updated brandName :"+alcoholBrand.brandName);
		System.out.println("updated Quantity :"+alcoholBrand.Quantity);
		System.out.println("updated priceOfAlcohol :"+alcoholBrand.priceOfAlcohol);
		System.out.println("=======================");
		
		Candy candy=new Candy();
		String candyName=candy.candyName;
		String flavor=candy.flavor;
		double candyPrice=candy.candyPrice;
		System.out.println("candyName :"+candyName);
		System.out.println("flavor :"+flavor);
		System.out.println("candyPrice :"+candyPrice);
		candy.candyName="amul";
		candy.flavor="chocolate";
		candy.candyPrice=60;
		System.out.println("");
		System.out.println("updated candyName :"+candy.candyName);
		System.out.println("updated flavor :"+candy.flavor);
		System.out.println("updated candyPrice :"+candy.candyPrice);
		System.out.println("=======================");
		
		Mediciness medicine=new Mediciness();
		String medicineName=medicine.medicineName;
		boolean isUsefull=medicine.isUsefull;
		double medicinePrice=medicine.medicinePrice;
		System.out.println("medicineName :"+medicineName);
		System.out.println("isUsefull :"+isUsefull);
		System.out.println("medicinePrice :"+medicinePrice);
		medicine.medicineName="Cipla";
		medicine.isUsefull=true;
		medicine.medicinePrice=15;
		System.out.println("");
		System.out.println("updated medicineName :"+medicine.medicineName);
		System.out.println("updated isUsefull :"+medicine.isUsefull);
		System.out.println("updated medicinePrice :"+medicine.medicinePrice);
		System.out.println("=======================");
		
		Food food=new Food();
		String foodName=food.foodName;
		String foodType=food.foodType;
		double cost=food.cost;
		System.out.println("foodName :"+foodName);
		System.out.println("foodType :"+foodType);
		System.out.println("cost :"+cost);
		food.foodName="Poori";
		food.foodType="veg";
		food.cost=50;
		System.out.println("");
		System.out.println("updated foodName :"+food.foodName);
		System.out.println("updated foodType :"+food.foodType);
		System.out.println("updated cost :"+food.cost);
		System.out.println("=======================");
		
		System.out.println("ends MatrimonyRunner");
		
		
		
		
	}
}