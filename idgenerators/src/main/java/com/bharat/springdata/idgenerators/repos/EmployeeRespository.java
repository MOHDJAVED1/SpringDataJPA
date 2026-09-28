package com.bharat.springdata.idgenerators.repos;

import org.springframework.data.repository.CrudRepository;
import com.bharat.springdata.idgenerators.entities.Employee;

public interface EmployeeRespository extends CrudRepository<Employee, Long> {

}
