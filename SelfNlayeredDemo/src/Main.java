import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.JLoggerManagerAdapter;
import dataAccess.concretes.DatabaseProductDao;
import dataAccess.concretes.HibernateProduductDao;
import entities.concretes.Product;
import jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductService productService = new ProductManager(new DatabaseProductDao(), new JLoggerManagerAdapter());
		Product product = new Product();
		product.setCategoryId(1);
		product.setId(25);
		product.setName("Laptop");
		product.setUnitPrice(25000);
		product.setUnitsInStock(5);

		Product product1 = new Product(2, 255, "Fýrýn", 5000, 15);

		productService.Add(product);
		productService.Add(product1);

	}
}
