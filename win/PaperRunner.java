class PaperRunner
{
	public static void main(String[] args)
	{
		Paper paper=new Paper("white");
		paper.setThickness(200);
		paper.quality="Better";
		paper.display();
		Paper paper1=new Paper("red");
		paper1.setThickness(150);
		paper1.quality="Best";
		paper1.display();
		Paper paper2=new Paper("yellow");
		paper2.setThickness(100);
		paper2.quality="Good";
		paper2.display();	
	}
}