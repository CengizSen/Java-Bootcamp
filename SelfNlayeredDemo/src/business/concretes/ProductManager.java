package business.concretes;

import java.util.List;

import business.abstracts.ProductService;
import core.JLoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private JLoggerService jLoggerService;

	public ProductManager(ProductDao productDao, JLoggerService jLoggerService) {
		super();
		this.productDao = productDao;
		this.jLoggerService = jLoggerService;
	}

	
	@Override
	public void Add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("Bu Kategori Sisteme Eklenemez : " + product.getName() + " Category NO: "
					+ product.getCategoryId());
			return;
		}
		
		
		this.productDao.add(product);
		this.jLoggerService.logToSystem("Ürün Eklendi"+product.getName());

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
