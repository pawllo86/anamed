package anamed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anamed.entity.Product;
import anamed.repository.ProductRepository;

@Service
@Transactional(readOnly = true)
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	@Transactional(readOnly = false)
	public void save(Product product) {
		repository.save(product);
	}

	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

}
