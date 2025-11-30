package com.plexus.slokare.SalesOrderSystem.repositories;

import com.plexus.slokare.SalesOrderSystem.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
