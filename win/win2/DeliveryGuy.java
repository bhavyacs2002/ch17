class DeliveryGuy{
	public static void deliver(String item)
	{
		System.out.println("running deliver in DeliveryGuy with one string parameter");
		DeliveryVehicle.deliver(item,"Bangalore");
}
}