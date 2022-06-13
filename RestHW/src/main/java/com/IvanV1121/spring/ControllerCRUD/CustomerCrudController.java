package com.IvanV1121.spring.ControllerCRUD;

import com.IvanV1121.spring.service.NotFoundExceptionService;
import com.IvanV1121.spring.model.Customer;
import com.IvanV1121.spring.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customersCrud")
@Tag(name = "Customer CRUD Controller")
public class CustomerCrudController {

    @Autowired
    private CustomerService service;

    @DeleteMapping("{id}")
    @Operation(summary = "Delete by id")
    public Map<String, Boolean> deleteCustomer(@PathVariable Integer id) throws NotFoundExceptionService {
        service.delete(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", true);
        return response;
    }

    @PatchMapping("{id}")
    @Operation(summary = "Update by id")
    public Customer updateCustomer(@PathVariable Integer id, @RequestBody Customer newCustomer) throws NotFoundExceptionService {
        return service.updateById(id, newCustomer);
    }

    @PostMapping
    @Operation(summary = "Add new")
    public Customer addCustomer(@RequestBody Customer newCustomer) {
        return service.add(newCustomer);
    }

    @GetMapping
    @Operation(summary = "Get all")
    public List<Customer> getAllCustomers() {
        return service.getAll();
    }

    @GetMapping("{id}")
    @Operation(summary = "Get by id")
    public ResponseEntity<Customer> getCustomer(@PathVariable(value = "id") Integer id) throws NotFoundExceptionService {
        return ResponseEntity.ok().body(service.getById(id));
    }

    @PutMapping("{id}")
    @Operation(summary = "Rewrite by id")
    public Customer replaceCustomer(@PathVariable(value = "id") Integer id, @RequestBody Customer newCustomer) throws NotFoundExceptionService {
        return service.rewriteById(id, newCustomer);
    }
}