package com.efzo.beats.service;

import com.efzo.beats.entity.Employee;
import com.efzo.beats.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

  public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
  }

    public List<Employee>  getAllEmployee(@RequestBody Employee employee){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }


    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }


}

