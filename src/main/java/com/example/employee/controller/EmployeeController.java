package com.example.employee.controller;


import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class EmployeeController {



    private final EmployeeService employeeService;



    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;

    }



    // Display home page
    @GetMapping("/")
    public String home(Model model) {


        model.addAttribute(
                "employees",
                employeeService.getAllEmployees()
        );


        model.addAttribute(
                "employee",
                new Employee()
        );


        return "index";

    }



    // Create Employee
    @PostMapping("/save")
    public String saveEmployee(
            @ModelAttribute Employee employee) {


        employeeService.saveEmployee(employee);


        return "redirect:/";

    }



    // Edit page
    @GetMapping("/edit/{id}")
    public String editEmployee(
            @PathVariable Long id,
            Model model) {


        Employee employee =
                employeeService.getEmployeeById(id);


        model.addAttribute(
                "employee",
                employee
        );


        return "edit";

    }



    // Update Employee
    @PostMapping("/update")
    public String updateEmployee(
            @ModelAttribute Employee employee) {


        employeeService.saveEmployee(employee);


        return "redirect:/";

    }



    // Delete Employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(
            @PathVariable Long id) {


        employeeService.deleteEmployee(id);


        return "redirect:/";

    }

}
