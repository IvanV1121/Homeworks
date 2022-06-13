package com.IvanV1121.spring.ControllerQuery;

import com.IvanV1121.spring.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customersQuery")
@Tag(name = "Customer Query Controller")
public class CustomerQueryController {

    @Autowired
    private CustomerService service;

    @GetMapping("district-live")
    @Operation(summary = "All different districts where customers live")
    public List<String> getCustomersDistricts() {
        return service.getDistricts();
    }

    @GetMapping("nizhegorodsky-customers")
    @Operation(summary = "Surname and discount for all customers from the Nizhegorodsky district")
    public List<Object[]> getNizhegorodskyCustomers() {
        return service.getByDistrict("Nizhegorodsky");
    }
}