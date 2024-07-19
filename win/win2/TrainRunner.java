class TrainRunner{
	public static void main(String[] args)
	{
	Train.book("Kolar","Bangalore");
	Train.book("Kolar","Bangalore",4);
	Train.book("Kolar","Bangalore",3,64.5);
	Train.cancel(4);
	Train.cancel("Kolar","Bangalore");
}
}