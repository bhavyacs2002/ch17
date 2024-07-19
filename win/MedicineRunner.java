class MedicineRunner{
	public static void main(String[] info)
	{
		System.out.println("starts information in InformationRunner");
		if(info.length==4)
		{
		String name=info[0];
		String manfactureDate= info[1];
		String price= info[2];
		String quantity= info[3];	
	
		int convertedmanfactureDate=Integer.parseInt(manfactureDate);
		float convertedprice=Float.parseFloat(price);
		float convertedquantity=Float.parseFloat(quantity);
		

		Medicine.medicineInfo(name,convertedmanfactureDate,convertedprice,convertedquantity);
		}
		System.out.println("ends info in MedicineRunner");
		
	}
}