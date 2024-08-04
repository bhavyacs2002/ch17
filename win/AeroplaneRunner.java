class AeroplaneRunner
{
	public static void main(String[] args)
	{
		System.out.println("starts KeroseneRunner");
		Aeroplane aeroplane=new Aeroplane();
		Aeroplane aeroplane2=new Aeroplane("KingFisher",200,10000,"Bangalore","Delhi");
		System.out.println("company:"+aeroplane2.company);
		System.out.println("noOfSeats:"+aeroplane2.noOfSeats);
		System.out.println("ticketPrice:"+aeroplane2.ticketPrice);
		System.out.println("source:"+aeroplane2.source);
		System.out.println("destination:"+aeroplane2.destination);
		Aeroplane aeroplane3=new Aeroplane("Air India","Delhi","USA");
		System.out.println("company:"+aeroplane3.company);
		System.out.println("source:"+aeroplane3.source);
		System.out.println("destination:"+aeroplane3.destination);
		Aeroplane aeroplane4=new Aeroplane("IndiGo",15000,"Delhi","Bangalore");	
		System.out.println("company:"+aeroplane4.company);
		System.out.println("ticketPrice:"+aeroplane4.ticketPrice);
		System.out.println("source:"+aeroplane4.source);
		System.out.println("destination:"+aeroplane4.destination);
	}
}