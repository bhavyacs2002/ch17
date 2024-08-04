class Aeroplane
{
	String company;
	int noOfSeats;
	double ticketPrice;
	String source;
	String destination;

	public Aeroplane()
	{
		System.out.println("----------------");
		System.out.println("created Aeroplane");
	}
	public Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination)
	{
		System.out.println("----------------");
		System.out.println("Aeroplane constructor with one double,one int and three boolean parameter");
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
	}
	public Aeroplane(String company,String source,String destination)
	{
		System.out.println("----------------");
		System.out.println("Aeroplane constructor with three string parameter");
		this.company=company;
		this.source=source;
		this.destination=destination;
	}
	
	public Aeroplane(String company,double ticketPrice,String source,String destination)
	{
		System.out.println("----------------");
		System.out.println("Aeroplane constructor with one double,three string parameter");
		this.company=company;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
	}
}