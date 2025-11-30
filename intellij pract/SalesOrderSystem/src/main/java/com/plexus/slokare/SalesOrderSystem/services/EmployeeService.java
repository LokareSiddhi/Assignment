package com.plexus.slokare.SalesOrderSystem.services;

import com.plexus.slokare.SalesOrderSystem.entities.Employee;
import com.plexus.slokare.SalesOrderSystem.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository repo;
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }
}
