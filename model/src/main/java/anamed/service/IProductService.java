package anamed.service;

import java.util.List;

import anamed.entity.Product;

public interface IProductService {

	void save(Product product);

	List<Product> findAll();

}
