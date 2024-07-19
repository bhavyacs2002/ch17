class Movie{
  public static void movieticket(int age,String name)
  {
	  int price=0;
	  System.out.println("running movieticket in movie");
	  System.out.println("age:"+age);
	  System.out.println("name:"+name);
	  if (age<18)
	  {
		 price=500;
		System.out.println("the movie ticket price is "+ price);
	  }
	  else
	  { 
		price=1000;
		System.out.println("the movie ticket price is "+ price); 
	  }  
  }
  public static void main(String[] args)
  {
	movieticket(20,"Jordan");  
  }
}