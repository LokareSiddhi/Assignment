package com.plexus.slokare.SalesOrderSystem.controllers;

import com.plexus.slokare.SalesOrderSystem.entities.Employee;
import com.plexus.slokare.SalesOrderSystem.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService service;
    @GetMapping
    public String welcome()
    {
        return "Welcome to sales order System Application";
    }
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        Employee savedEmployee=service.addEmployee(employee);

        return savedEmployee;
    }
}
