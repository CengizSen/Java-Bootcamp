package oopIntro;





public class Product {
	       private int  id;
	       private String name;
	       private String description;
	       private double unitPrice;
	       private double discount;
	    
			
			public Product() {
				
			}
			public Product(int id, String name, String description, double unitPrice,double discount,double unitPriceAfterDiscount) {
				super();
				this.id = id;
				this.name = name;
				this.description = description;
				this.unitPrice = unitPrice;
				this.discount=discount;
				
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public double getUnitPrice() {
				return unitPrice;
			}
			public void setUnitPrice(double unitPrice) {
				this.unitPrice = unitPrice;
			}
			public double getDiscount() {
				return discount;
			}
			public void setDiscount(double discount) {
				this.discount = discount;
			}
			public double getUnitPriceAfterDiscount() {
				return this.unitPrice-(this.unitPrice*this.discount/100);
			}
			
	

		

	


}
