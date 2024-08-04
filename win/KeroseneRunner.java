class KeroseneRunner
{
	public static void main(String[] args)
	{
		System.out.println("starts KeroseneRunner");
		Kerosene kerosene=new Kerosene();
		Kerosene kerosene2=new Kerosene(350,250,true);
		System.out.println("price:"+kerosene2.price);
		System.out.println("quantity:"+kerosene2.quantity);
		System.out.println("quality:"+kerosene2.quality);
		Kerosene kerosene3=new Kerosene(500);
		System.out.println("quality:"+kerosene3.quality);
		Kerosene kerosene4=new Kerosene(true);
		System.out.println("price:"+kerosene4.price);
		
		
		
	}
}