class PrimeRunner{
	public static void main(String[] args)
	{
		System.out.println("running main in CountryRunner");
		String[] state={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana",
        "HimachalPradesh","Jharkhand","Karnataka","Kerala","MadhyaPradesh","Maharashtra","Manipur","Meghalaya",
        "MizoramAizawl","Nagaland","Manipur","Odisha","Punjab","Sikkim","TamilNadu","Telangana",
		"Tripura","UttarPradesh","Uttarakhand","WestBengal"};
		Prime.states(state);
		int[] pins={587316,587124,587315,560091,560030,560007,560045,560086,560050,560070};
		Prime.pincode(pins);
		String[] minister={"JawaharLalNehru","GulzarilalNanda","Lal Bahadur Shastri","Gulzari Lal Nanda", 
		"Indira Gandhi","Morarji Desai","Charan Singh","Rajiv Gandhi","V. P. Singh",
		"Chandra Shekhar","P. V. Narasimha Rao","Atal Bihari Vajpayee","H. D. Deve Gowda",
		"Inder Kumar Gujral", "Atal Bihari Vajpayee","Manmohan Singh","Narendra Modi"};
		Prime.primeMinister(minister);
		String[] cabinet={"Shri Rajnath Singh","Shri Amit Shah	","Shri Nitin Jairam Gadkari","Smt. Nirmala Sitharaman","Shri Shivraj Singh Chouhan	",
		"Dr. Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda	","Shri Manohar Lal","Shri H. D. Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra Pradhan	",
		"Shri Jitan Ram Manjhi","Shri Rajiv Ranjan Singh alias Lalan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Kinjarapu Rammohan Naidu",
		"Shri Jual Oram	","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M. Scindia","Shri Bhupender Yadav","Shri Sarbananda Sonowal","Shri Gajendra Singh Shekhawat","Smt. Annpurna Devi",
		"Shri Kiren Rijiju","Shri Hardeep Singh Puri","Dr. Mansukh Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
		Prime.cabinetMinisters(cabinet);
		String[] parties={"Bharatiya Janata Party","Indian National Congress","National People's Party","Aam Aadmi Party","Communist Party Of India"};
		Prime.politicalParties(parties);
	}
}