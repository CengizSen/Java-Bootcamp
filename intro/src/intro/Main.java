package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String internetSubeButonu="Ýnternet Þubesi";
		double dolarDun=8.18;
		int vade=36;
		boolean dustuMu=false;
		double dolarBugun=8.18;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun)
		{
			System.out.println("Dolar Düþtü");
		}
		  else if(dolarBugun>dolarDun){
			System.out.println("Dolar Yükseldi");
		}
		 else {
				System.out.println("Dolar Ayný Seviyede");

		}

	
	 String kredi1="Hýzlý Kredi";
	 String kredi2="Mutlu emekli Kredi";
	 String kredi3="Konut Kredi";
	 String kredi4="Çiftçi Kredi";
	 String kredi5="MSB Kredi";
	 String kredi6="TSK Kredi";
	 
	  	System.out.println(kredi1);
	  	System.out.println("----");
	  	String[] krediler ={
	  			  "Hýzlý Kredi",
	  			  "Mutlu emekli Kredi",
	  			  "Konut Kredi",
	  			 "Çiftçi Kredi",
	  			  "MSB Kredi",
	  			  "TSK Kredi",
	  			  "Yeni Kredi"
	  			 
	  	};
	  	for(String kredi:krediler) {
	  		System.out.println(kredi);
	  	}
	
	  	
	  	
	}
	

}
