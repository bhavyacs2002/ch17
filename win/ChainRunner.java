class ChainRunner
{ 
	public static void main(String[] args)
	{
	  int caratValue=Chain.carat();
	  System.out.println("caratValue:"+caratValue);
	  double perGramCost=Chain.costpergram();
	  System.out.println("perGramCost:"+perGramCost);
	  String typeOfGold=Chain.type();
	  System.out.println("typeOfGold:"+typeOfGold);
	  String qualityOfGold=Chain.quality();
	  System.out.println("qualityOfGold:"+qualityOfGold);
	  float quantityOfGold=Chain.quantity();
	  System.out.println("quantityOfGold:"+quantityOfGold);
	  double wastageCharges=Chain.wastage();
	  System.out.println("wastageCharges:"+wastageCharges);
	  double totalserviceCharge=Chain.serviceCharge();
	  System.out.println("totalserviceCharge:"+totalserviceCharge);
	  double totalGST=Chain.GST();
	  System.out.println("totalGST:"+totalGST);
	}
}