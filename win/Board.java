class Board
{
	String type;
	double price;
	String usedFor;
	public Board(String boardType,String boardUsedFor,double boardPrice)
	{
		System.out.println("Board created");
		type=boardType;
		price=boardPrice;
		usedFor=boardUsedFor;
		System.out.println("type:"+type);
		System.out.println("price:"+price);
		System.out.println("usedFor:"+usedFor);
	}
}