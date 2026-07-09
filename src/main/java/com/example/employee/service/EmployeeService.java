package com.example.employee.service;


import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {


    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;

    }



    // Read all employees
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();

    }



    // Save employee
    public void saveEmployee(Employee employee) {

        employeeRepository.save(employee);

    }



    // Find employee by id
    public Employee getEmployeeById(Long id) {

        return employeeRepository.findById(id)
                .orElse(null);

    }



    // Delete employee
    public void deleteEmployee(Long id) {

        employeeRepository.deleteById(id);

    }

}
