class Coil
{
	String name;
	String usedIn ;
	public Coil(String coilName,String coilUsedIn)
	{
		System.out.println("Coil created");
		name=coilName;
		usedIn=coilUsedIn;
		System.out.println("coil name:"+name);
		System.out.println("coil usedIn:"+usedIn);
	}
}