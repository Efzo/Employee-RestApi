package com.efzo.beats.controller;

import com.efzo.beats.entity.Employee;
import com.efzo.beats.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

        @PostMapping("/create")
        public Employee createEmployee(@RequestBody Employee employee){
            return  employeeService.createEmployee(employee);
        }

        @GetMapping("/get/{id}")
        public Employee getEmployeeById(@PathVariable Long id, Employee employee){
            return employeeService.getEmployeeById(id);
        }

        @GetMapping("/get")
        public List<Employee> getAllEmployee( Employee employee){
            return employeeService.getAllEmployee(employee);
        }

        @PutMapping("/update/{id}")
        public Employee updateEmployee( @PathVariable Long id, @RequestBody Employee employee){
            employee.setId(id);
            return employeeService.updateEmployee(employee);
        }

        @DeleteMapping("/delete/{id}")
        public void deleteEmployee(@PathVariable Long id){
            employeeService.deleteEmployee(id);
        }

}
