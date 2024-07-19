class Hospital{
	public static double Medicine(String medicineName)
	{
		System.out.println("running Medicine in Hospital");
		if(medicineName=="Cetirizine")
		{
			return 60;
		}
		if(medicineName=="Dolo")
		{
			return 76;
		}
		if(medicineName=="Ativan")
		{
			return 100;
		}
		return 0;
		
	}
	public static String Disease(String symptom )
	{
		System.out.println("running cases in Room");
		if(symptom=="cold")
		{
			return "Cetirizine";
		}
		if(symptom=="anxiety")
		{
			return "Ativan";
		}
		if(symptom=="headache")
		{
			return "dolo";
		}
		return "not found";
	}
		public static boolean doctor(String doctorName )
	{
		System.out.println("running cases in Room");
		if(doctorName=="Dr.Leena")
		{
			return true;
		}
		if(doctorName=="Dr.Jack")
		{
			return true;
		}
		if(doctorName=="Dr.Gupta")
		{
			return true;
		}
		return false;
	}
}
