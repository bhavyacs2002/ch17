class HospitalRunner{
	public static void main(String[] args)
	{
		System.out.println("running main in RoomRunner");
		double priceOfCetirizine=Hospital.Medicine("Cetirizine");
		System.out.println("priceOfCetirizine:"+priceOfCetirizine);
		double priceOfDolo=Hospital.Medicine("Dolo");
		System.out.println("priceOfDolo:"+priceOfDolo);
		double priceOfAvitan=Hospital.Medicine("Ativan");
		System.out.println("priceOfAvitan:"+priceOfAvitan);
		priceOfAvitan=Hospital.Medicine("paracetomol");
		System.out.println("priceOfAvitan:"+priceOfAvitan);
	
		String MedicineName=Hospital.Disease("cold");
		System.out.println("medicineName:"+MedicineName);
		String Medicine=Hospital.Disease("anxiety");
		System.out.println("medicineName:"+Medicine);
		String nameOfMedicine=Hospital.Disease("headache");
		System.out.println("nameOfMedicine:"+nameOfMedicine);
		String nameMedicine=Hospital.Disease("Shivering");
		System.out.println("nameOfMedicine:"+nameMedicine);
	
		boolean available=Hospital.doctor("Dr.Leena");
		System.out.println("available:"+available);
		available=Hospital.doctor("Dr.Jack");
		System.out.println("available:"+available);
		available=Hospital.doctor("Dr.Gupta");
		System.out.println("available:"+available);
		available=Hospital.doctor("Dr.Bhavya");
		System.out.println("available:"+available);
		
		
		
	
	}
}