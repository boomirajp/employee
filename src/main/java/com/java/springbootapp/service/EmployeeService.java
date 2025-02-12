package com.java.springbootapp.service;

import com.java.springbootapp.entity.Employee;
import com.java.springbootapp.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(com.java.springbootapp.model.Employee employee) {
        Employee employee1 = new Employee();
        employee1.setExperience(employee.getExperience());
        employee1.setDepartment(employee.getDepartment());
        employee1.setNote(employee.getNote());
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
       return employeeRepo.save(employee1);
    }

    public List<Employee> getEmployeeList() {
        return employeeRepo.findAll().stream().toList();
    }
}
