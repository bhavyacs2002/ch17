class BloodRunner
{ 
	public static void main(String[] args)
	{
	  char BloodGroup=Blood.group();
	  System.out.println("BloodGroup:"+BloodGroup);
	  String name=Blood.personName();
	  System.out.println("name:"+name);
	  double costOfBlood=Blood.cost();
	  System.out.println("costOfBlood:"+costOfBlood);
	  boolean tested=Blood.hospitalTested();
	  System.out.println("tested:"+tested);
	  boolean isSick=Blood.sickness();
	  System.out.println("isSick:"+isSick);
	  boolean isDonating=Blood.donate();
	  System.out.println("isDonating:"+isDonating);
	}
}