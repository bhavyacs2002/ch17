class PalaceRunner{
	public static void main(String[] palace)
	{
		System.out.println("main in PalaceRunner");
		if(palace.length==4)
		{
			System.out.println("palace contains the required references");
			String name=palace[0];
			String location=palace[1];
			String buildBy=palace[2];
			String buildYear=palace[3];
			System.out.println("name:"+name);
			System.out.println("location:"+location);
			System.out.println("buildBy:"+buildBy);
			System.out.println("buildYear:"+buildYear);
		}
		else
		{
			System.out.println("No required references");
		}
		}
}