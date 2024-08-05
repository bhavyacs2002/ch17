class ProjectorRunner
{
	public static void main(String[] args)
	{
		Projector projector=new Projector("white");
		projector.setCompany("LG");
		projector.weight=45;
		projector.display();
		Projector projector1=new Projector("blue");
		projector1.setCompany("Lenovo");
		projector1.weight=54;
		projector1.display();
		Projector projector2=new Projector("yellow");
		projector2.setCompany("Epsilon");
		projector2.weight=43;
		projector2.display();	
	}
}