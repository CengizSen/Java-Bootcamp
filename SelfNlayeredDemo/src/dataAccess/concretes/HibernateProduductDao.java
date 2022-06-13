package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class HibernateProduductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile baþarýyla eklendi: " + product.getName());

	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile baþarýyla silindi: " + product.getName());

	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile baþarýyla güncellendi: " + product.getName());

	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
