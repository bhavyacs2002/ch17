class Restuarent
{
	static double summerRoomPrice=3000;
	static double summerFoodPrice=450;
	static double monsoonRoomPrice=2000;
	static double monsoonFoodPrice=400;
	static double winterRoomPrice=1000;
	static double winterFoodPrice=300;
	
	public static double season(String packages,boolean addFood)
	{
		
		double sum=0;
		if (packages=="summer") 
		{
			if (addFood=true)
			{
			 sum=summerRoomPrice+summerFoodPrice;
			return sum;
		    }
		    else
			{
				sum=summerRoomPrice;
				return sum;
			}
	    }
		else if (packages=="monsoon")
		{
			if(addFood==true)
			{
			 sum=monsoonRoomPrice+monsoonFoodPrice;
			return sum;
			}
			else
			{
				return monsoonRoomPrice;
			}
		}
		else if (packages=="winter")
		{
			if(addFood==true)
			{
			 sum=winterRoomPrice+winterFoodPrice;
			return sum;
			}
			else
			{
				return winterRoomPrice;
			}
		}
	return 0;
	}

}
