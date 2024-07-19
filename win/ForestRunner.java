class ForestRunner{
	public static void main(String[] forest)
	{
		System.out.println("main in ForestRunner");
		if(forest.length==4)
		{
			System.out.println("forest contains the required references");
			String name=forest[0];
			String area=forest[1];
			String establishedYear=forest[2];
			String state=forest[3];
			System.out.println("name:"+name);
			System.out.println("area:"+area);
			System.out.println("establishedYear:"+establishedYear);
			System.out.println("state:"+state);
		}
		else
		{
			System.out.println("No required references");
		}
		}
}