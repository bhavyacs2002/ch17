class GanaviRunner
{
	public static void main(String[] args)
	{
		Clip clip=new Clip("black","claw");
		Ganavi ganavi=new Ganavi("bhavya@gmail.com",clip);
		ganavi.display();
		Clip clip1=new Clip("white","claw");
		Ganavi ganavi1=new Ganavi("shree@gmail.com",clip1);
		ganavi1.display();
	}
}