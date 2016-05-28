package anamed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import anamed.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
