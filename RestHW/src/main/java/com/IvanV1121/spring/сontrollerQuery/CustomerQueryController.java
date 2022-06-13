package com.IvanV1121.spring.сontrollerQuery;

import com.IvanV1121.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customersQuery")
public class CustomerQueryController {

    @Autowired
    private CustomerService service;

    @GetMapping("district-live")
    public List<String> getCustomersDistricts() {
        return service.getDistricts();
    }

    @GetMapping("nizhegorodsky-customers")
    public List<Object[]> getNizhegorodskyCustomers() {
        return service.getByDistrict("Nizhegorodsky");
    }
}