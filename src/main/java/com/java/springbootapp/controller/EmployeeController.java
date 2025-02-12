package com.java.springbootapp.controller;

import com.java.springbootapp.entity.Employee;
import com.java.springbootapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "hello")
    public String hello() {
        return "Hello, You are successfully deployed spring boot app in Azure Web app!";
    }

    @PostMapping(value = "addEmployee")
    public Employee addEmployee(@RequestBody com.java.springbootapp.model.Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PostMapping(value = "employeeList")
    public List<Employee> getEmployeeList() {
        return employeeService.getEmployeeList();
    }
}
