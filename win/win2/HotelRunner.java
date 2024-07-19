class HotelRunner{
	public static void main(String[] args)
	{
		Hotel.place("Bangalore");
		Hotel.order("Masal Dosa",60.45);
		Hotel.guestService(true,"Masal Dosa",60.45);
		Hotel.menue("Masal Dosa",60.45,true);
		Hotel.rating(4.5f);
	}
}