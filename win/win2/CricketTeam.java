class CricketTeam
{
  public static void stringBoolean()
  {
    String initialName="Bhavya";
	String lastName="Shree";
	boolean combined=initialName==lastName;
	boolean assignmentCompleted=true;
	boolean watchingMovie=false;
	System.out.println("initialName:"+initialName);
	System.out.println("lastName:"+lastName);
	System.out.println("combined:"+combined);
	System.out.println("assignment Completed:"+assignmentCompleted);
	System.out.println("watching Movie:"+watchingMovie);
  }
  public static void values()
  {
	  double pi=3.14159;
	  char dollarSymbol='$';
	  pi=3.14;
	  System.out.println("value of pi is "+pi);
	  System.out.println("symbol of dollar:"+dollarSymbol); 
  }
  public static void cricketTeamIndia()
	{
		System.out.println("Score list of Indian players");
		String player1="Virat Kohli";
		int score1=76;
		String s1=player1+" "+score1;
		System.out.println(s1);
		String player2="Axar Patel";
		int score2=47;
		String s2=player2+" "+score2;
		System.out.println(s2);
		String player3="Shivam Dube";
		int score3=27;
		String s3=player3+" "+score3;
		System.out.println(s3);
		String player4="Rohit Sharma";
		int score4=9;
		String s4=player4+" "+score4;
		System.out.println(s4);
		String player5="Hardik Pandya";
		int score5=5;
		String s5=player5+" "+score5;
		System.out.println(s5);
		String player6="SuryaKumar Yadav";
		int score6=3;
		String s6=player6+" "+score6;
		System.out.println(s6);
		String player7="Ravindra Jadeja";
		int score7=2;
		String s7=player7+" "+score7;
		System.out.println(s7);
		
	}
	public static void cricketTeamSouthAfrica()
	{
		String player1="Reeza Hendricks";
		int score1=4;
		String s1=player1+" "+score1;
		System.out.println(s1);
		String player2="de kock";
		int score2=39;
		String s2=player2+" "+score2;
		System.out.println(s2);
		String player3="Makram";
		int score3=4;
		String s3=player3+" "+score3;
		System.out.println(s3);
		String player4="Stubbs";
		int score4=31;
		String s4=player4+" "+score4;
		System.out.println(s4);
		String player5="Klassen";
		int score5=52;
		String s5=player5+" "+score5;
		System.out.println(s5);
		String player6="D.Miller";
		int score6=21;
		String s6=player6+" "+score6;
		System.out.println(s6);
		String player7="Jansen";
		int score7=2;
		String s7=player7+" "+score7;
		System.out.println(s7);
		String player8="Rabada";
		int score8=4;
		String s8=player8+" "+score8;
		System.out.println(s8);
		String player9="Nortje";
		int score9=1;
		String s9=player7+" "+score9;
		System.out.println(s9);

	}
	public static void main(String[] args)
    {
	 stringBoolean();
	 values();
	 cricketTeamIndia(); 
	 cricketTeamSouthAfrica();
  }
}