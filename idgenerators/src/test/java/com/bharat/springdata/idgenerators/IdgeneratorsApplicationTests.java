package com.bharat.springdata.idgenerators;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bharat.springdata.idgenerators.entities.Employee;
import com.bharat.springdata.idgenerators.repos.EmployeeRespository;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class IdgeneratorsApplicationTests {
	
	@Autowired
	EmployeeRespository respository;

	@Test
	@Order(1)
	void contextLoads() {
	}
	
	@Test
	@Order(2)
	public void testCreateEmployee() {
		Employee employee = new Employee();
//		employee.setId(1);
		employee.setName("bharat");
		respository.save(employee);
	}
	
	@Test
	@Order(3)
	public void testGetEmployee() {
		Employee employee = respository.findById(1L).get();
		System.out.println(">>>>>>>>>>>>> " + employee.getName());
	}

}
