class Brain
{
	public static void main(String[] args)
	{
		imagining();
	}
	public static void imagining()
	{
		System.out.println("imagining in the Brain");
		thinking();
	}
	public static void thinking()
	{
		System.out.println("thinking in the Brain");
		imagining();
	}
	
}