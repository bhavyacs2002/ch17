class SpeakerRunner
{
	public static void main(String[] args)
	{
		Speaker speaker=new Speaker("Medium");
		speaker.setBrand("LG");
		speaker.cost=5000;
		speaker.display();
		Speaker speaker1=new Speaker("small");
		speaker1.setBrand("lenovo");
		speaker1.cost=5000;
		speaker1.display();
		Speaker speaker2=new Speaker("big");
		speaker2.setBrand("philiphs");
		speaker2.cost=5000;
		speaker2.display();	
	}
}