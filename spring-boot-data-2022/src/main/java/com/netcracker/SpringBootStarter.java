package com.netcracker;

import com.netcracker.entity.Employee;
import com.netcracker.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStarter implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootStarter.class);

    @Autowired
    private EmployeeService employeeService;


    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarter.class, args);
    }

    @Override
    public void run(String... args){

        LOGGER.info("save new employee");
        employeeService.save(new Employee("Ivan", "Junior Software Enginier", 15.7));

        LOGGER.info("find all");
        employeeService.findAll().forEach(item -> LOGGER.info(item.toString()));

        LOGGER.info("find by id = 2: " + employeeService.findById(2));

        LOGGER.info("find by name");
        employeeService.findByName("Gleb").forEach(item ->LOGGER.info(item.toString()));

        LOGGER.info("retrieve by name");
        employeeService.retrieveByName("Gleb").forEach(item ->LOGGER.info(item.toString()));

    }
}
