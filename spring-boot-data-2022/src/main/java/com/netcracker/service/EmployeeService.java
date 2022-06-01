package com.netcracker.service;

import com.netcracker.entity.Employee;
import com.netcracker.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee findById(int id){
        Optional<Employee> optional = employeeRepository.findById(id);
        return optional.orElse(new Employee());
    }
    public List<Employee> findByName(String name){
        return employeeRepository.findByName(name);
    }

    public List<Employee> retrieveByName(String name){
        return employeeRepository.retrieveByName(name);
    }
}
