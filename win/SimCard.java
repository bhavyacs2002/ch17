class SimCard
{
	String serviceBy;
	String color;
	long number;
	public SimCard(String cardServiceBy,String simColor,long simNumber)
	{
		System.out.println("SimCard created");
		serviceBy=cardServiceBy;
		color=simColor;
		number=simNumber;
		System.out.println("serviceBy:"+serviceBy);
		System.out.println("color:"+color);
		System.out.println("number:"+number);
	}
}