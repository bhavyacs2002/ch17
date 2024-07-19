class CountryRunner
{
	public static void main(String[] args)
	{
	  System.out.println("Running main in CountryRunner");
	  String countryCode91=Country.countryCode(91);
	  System.out.println("country:"+countryCode91);
	  String countryCode001=Country.countryCode(001);
	  System.out.println("country:"+countryCode91);
	  String countryCode44=Country.countryCode(44);
	  System.out.println("country:"+countryCode44);
	  String countryCode971=Country.countryCode(971);
	  System.out.println("country:"+countryCode971);
	  String countryCode33=Country.countryCode(33);
	  System.out.println("country:"+countryCode971);
	  String countryCode40=Country.countryCode(40);
	  System.out.println("country:"+countryCode40);
	  
	  double priceofBook=Country.price("Book");
	  System.out.println("priceofBook:"+priceofBook);
	  double priceofPen=Country.price("Pen");
	  System.out.println("priceofPen:"+priceofPen);
	  double priceofPencil=Country.price("Pencil");
	  System.out.println("priceofPencil:"+priceofPencil);
	  double priceofScale=Country.price("scale");
	  System.out.println("priceofScale:"+priceofScale);
	  double priceofEraser=Country.price("Eraser");
	  System.out.println("priceofEraser:"+priceofEraser);
	  double priceofSharpner=Country.price("Sharpner");
	  System.out.println("priceofSharpner:"+priceofSharpner);
	  
	  String producerOfKalki=Country.movie("Kalki");
	  System.out.println("producerOfKalki:"+producerOfKalki);
	  String producerOfLoveMockTail=Country.movie("Love Mocktail");
	  System.out.println("producerOfLoveMockTail:"+producerOfLoveMockTail);
	  String producerOfMungaruMale=Country.movie("Mungaru Male");
	  System.out.println("producerOfMungaruMale:"+producerOfMungaruMale);
	  String producerOfKGF=Country.movie("KGF");
	  System.out.println("producerOfKGF:"+producerOfKGF);
	  String producerOfMahanati=Country.movie("Mahanati");
	  System.out.println("producerOfMahanati:"+producerOfMahanati);
	  String producer=Country.movie("Rajahuli");
	  System.out.println("producer:"+producer);
	}
}
	