package com.bharath.springdata.product.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.springdata.product.entities.Product;
import java.util.List;


public interface ProductRepository extends CrudRepository<Product, Integer> {
    
	List<Product> findByName(String name);
	
	List<Product> findByNameAndDesc(String name, String desc);
}
