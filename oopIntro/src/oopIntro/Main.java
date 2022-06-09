package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
  
		
  Product product2=new Product();
product2.setId(2);
product2.setName("Lenovo V15");
product2.setDescription("16 GB");
  product2.setUnitPrice(2000);
  product2.setDiscount(20);
  
  System.out.println(product2.getUnitPriceAfterDiscount());
  
  Product product3=new Product();
  product2.setId(3);
  product2.setName("Lenovo V15");
  product2.setDescription("16 GB");
    product2.setUnitPrice(20000);
    product2.setDiscount(10);
    System.out.println(product2.getUnitPriceAfterDiscount());
 
  

	
  Product[]products= {product2,product3};
  for (Product product : products) {
	System.out.println(product.getName());
   }
  
  
  
  
  Category category1=new Category();
  category1.setId(1);
  category1.setName("Ýçecek");
 
  
  System.out.println(category1.getName());
  
  
  
  
  
  
  
  
	}
}