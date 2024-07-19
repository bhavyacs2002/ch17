class Cricket
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
	  int rohitSharma=9;
	  int viratkohli=76;
	  int rishabhPant=0;
	  int suryaKumarYadav=3;
	  int axarPatel=47;
	  int shivamDube=27;
	  int hardikPandya=5;
	  int ravindraJadeja=2;
	  System.out.println("Rohit Sharma scored "+rohitSharma+" runs in T20 final match");
	  System.out.println("virat kohli scored "+viratkohli+" runs in T20 final match");
	  System.out.println("Rishabh Pant scored "+rishabhPant+" runs in T20 final match");
	  System.out.println("SuryaKumar Yadav scored "+suryaKumarYadav+" runs in T20 final match");
	  System.out.println("Axar Patel scored "+axarPatel+" runs in T20 final match");
	  System.out.println("Shivam Dube scored "+shivamDube+" runs in T20 final match");
	  System.out.println("Hardik Pandya scored "+hardikPandya+" runs in T20 final match");
	  System.out.println("Ravindra Jadeja scored "+ravindraJadeja+" runs in T20 final match");
  }
   public static void cricketTeamSouthAfrica()
  {
	  int reezaHendricks=4;
	  int quintondeKock=39;
	  int aidenMarkram=4;
	  int tristanStubbs=31;
	  int heinrichKlaasen=52;
	  int davidMiller=21;
	  int marcoJansen=2;
	  int keshavMaharaj=2;
	  int kagisoRabada=4;
	  int anrichNortje=1;
	  System.out.println("Reeza Hendricks scored "+reezaHendricks+" runs in T20 final match");
	  System.out.println("Quinton de Kock scored "+quintondeKock+" runs in T20 final match");
	  System.out.println("Aiden Markram scored "+aidenMarkram+" runs in T20 final match");
	  System.out.println("Tristan Stubbs scored "+tristanStubbs+" runs in T20 final match");
	  System.out.println("Heinrich Klaasen scored "+heinrichKlaasen+" runs in T20 fianl match");
	  System.out.println("David Miller scored "+davidMiller+" runs in T20 fianl match");
	  System.out.println("Marco Jansen scored "+marcoJansen+" runs in T20 fianl match");
	  System.out.println("Keshav Maharaj scored "+keshavMaharaj+" runs in T20 fianl match");
	  System.out.println("Kagiso Rabada scored "+kagisoRabada+" runs in T20 fianl match");
	  System.out.println("Anrich Nortje scored "+anrichNortje+" runs in T20 fianl match");
  }
  public static void main(String[] args)
  {
	 stringBoolean();
	 values();
	 cricketTeamIndia(); 
	 cricketTeamSouthAfrica();
  }
}