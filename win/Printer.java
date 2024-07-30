class Printer
{
	String company;
	double price;
	public Printer(String printerCompany,double printerPrice)
	{
		System.out.println("Printer created");
		company=printerCompany;
		price=printerPrice;
		System.out.println("printer Company:"+company);
		System.out.println("printer Price:"+price);
	}
}