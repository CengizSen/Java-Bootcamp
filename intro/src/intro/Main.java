package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String internetSubeButonu="�nternet �ubesi";
		double dolarDun=8.18;
		int vade=36;
		boolean dustuMu=false;
		double dolarBugun=8.18;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun)
		{
			System.out.println("Dolar D��t�");
		}
		  else if(dolarBugun>dolarDun){
			System.out.println("Dolar Y�kseldi");
		}
		 else {
				System.out.println("Dolar Ayn� Seviyede");

		}

	
	 String kredi1="H�zl� Kredi";
	 String kredi2="Mutlu emekli Kredi";
	 String kredi3="Konut Kredi";
	 String kredi4="�ift�i Kredi";
	 String kredi5="MSB Kredi";
	 String kredi6="TSK Kredi";
	 
	  	System.out.println(kredi1);
	  	System.out.println("----");
	  	String[] krediler ={
	  			  "H�zl� Kredi",
	  			  "Mutlu emekli Kredi",
	  			  "Konut Kredi",
	  			 "�ift�i Kredi",
	  			  "MSB Kredi",
	  			  "TSK Kredi",
	  			  "Yeni Kredi"
	  			 
	  	};
	  	for(String kredi:krediler) {
	  		System.out.println(kredi);
	  	}
	
	  	
	  	
	}
	

}
