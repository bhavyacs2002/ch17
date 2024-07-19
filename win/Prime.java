class Prime{
	public static void states(String[] states)
	{
		System.out.println("starts States in Country");
		for(int value=states.length-1;value>=0;value--)
		{
			String ref=states[value];
			System.out.println("States:"+ref);
			 
		}
		System.out.println("ends States in Country");
		
	}
	public static void pincode(int[] pincode)
	{
		System.out.println("starts Pincode in Country");
		for(int pin=pincode.length-1;pin>=0;pin--)
		{
			int pins=pincode[pin];
			System.out.println("Pincode:"+pins);
			
		}
		System.out.println("ends Pincode in Country");
		
	}
	public static void primeMinister(String[] primeMinister)
	{
		System.out.println("starts primeMinister in Country");
		for (int minister=primeMinister.length-1;minister>=0;minister--)
		{
			String prime=primeMinister[minister];
			System.out.println("prime Minister:"+prime);
			
		}
		System.out.println("ends Primeminister in Country");	
	}
	public static void cabinetMinisters(String[] cabinetMinisters)
	{
		System.out.println("starts CabinetMinisters in Country");
		for(int cabinet=cabinetMinisters.length-1;cabinet>=0;cabinet--)
		{
			String mini=cabinetMinisters[cabinet];
			System.out.println("Cabinet Ministers:"+mini);
			
		}
		System.out.println("starts CabinetMinisters in Country");	
	}
	public static void politicalParties(String[] politicalParties)
	{
		System.out.println("starts PoliticalParties in Country");
		for(int party=politicalParties.length-1;party>=0;party--)
		{
			String poli=politicalParties[party];
			System.out.println("Political Parties:"+poli);
			
		}
		System.out.println("starts PoliticalParties in Country");	
	}
}