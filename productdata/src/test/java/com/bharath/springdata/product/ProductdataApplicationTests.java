package com.bharath.springdata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bharath.springdata.product.entities.Product;
import com.bharath.springdata.product.repos.ProductRepository;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProductdataApplicationTests {

	@Autowired
	ProductRepository repository;

//	@Test
//	@Order(1)
//	void contextLoads() {
//	}
//
//	@Test
//	@Order(2)
//	public  void testCreate(){
//		Product product = new Product();
//		product.setId(1);
//		product.setName("IphoneX");
//		product.setDesc("Awesome");
//		product.setPrice(1000d);
//
//		repository.save(product);
//	}
//
//	@Test
//	@Order(3)
//	public void testRead(){
//		Product product = repository.findById(1).get();
//		assertNotNull(product);
//		assertEquals("IphoneX", product.getName());
//	}
//
//	@Test
//	@Order(4)
//	public void testUpdate(){
//		Product product = repository.findById(1).get();
//		System.out.println(">>>>>>>>>>>" + product.getId());
//		product.setPrice(1200d);
//		repository.save(product);
//	}
//
//	@Test
//	@Order(5)
//	public void testDelete(){
//		boolean b = repository.existsById(1);
//		System.out.println(">>>>>>>>>> " + b);
//		if(b){
//			repository.deleteById(1);
//		}else{
//			System.out.println("Id doesn't exist.");
//		}
//	}
//
//
//	@Test
//	@Order(6)
//	public void testCount(){
//		System.out.println(">>>>>>>>>> " + repository.count());
//	}
	
	@Test
	@Order(7)
	public void findByName() {
		List<Product> findByName = repository.findByName("Iwatch");
		findByName.forEach(p -> System.out.println(p.getPrice()));
	}
	
	@Test
	@Order(8)
	public void findByNameAndDesc() {
		List<Product> byNameAndDesc = repository.findByNameAndDesc("Galaxy S24", "Samsung" );
		byNameAndDesc.forEach(p -> System.out.println(p.getPrice()));
	}
	
	@Test
	@Order(9)
	public void findByPriceGreaterThan() {
		List<Product> byPriceGreaterThan = repository.findByPriceGreaterThan(200d);
		byPriceGreaterThan.forEach(p -> System.out.println(p.getName()));
	}
	
	@Test
	@Order(10)
	public void findByDescContains() {
		List<Product> byPriceGreaterThan = repository.findByDescContains("Samsung");
		byPriceGreaterThan.forEach(p -> System.out.println(p.getName()));
	}
	
	@Test
	@Order(11)
	public void findByPriceBetween() {
		List<Product> byPriceGreaterThan = repository.findByPriceBetween(200d, 300d);
		byPriceGreaterThan.forEach(p -> System.out.println(p.getName()));
	}
	
	@Test
	@Order(11)
	public void findByDescLike() {
		List<Product> byPriceGreaterThan = repository.findByDescLike("%apple%");
		byPriceGreaterThan.forEach(p -> System.out.println(p.getName()));
	}
	
	@Test
	@Order(12)
	public void findByIdsIn() {
		List<Product> byIdIn = repository.findByIdIn(Arrays.asList(1, 2, 3));
		byIdIn.forEach(p -> System.out.println(p.getName()));
	}
}
