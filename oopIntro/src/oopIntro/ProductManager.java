package oopIntro;

public class ProductManager {
	
	public void Add(Product product) {
		System.out.println("Ürün baþarýyla eklendi"+product.getName());
	}

	public void Delete() {
		System.out.println("Ürün baþarýyla Çýkarýldý");
	}
}
