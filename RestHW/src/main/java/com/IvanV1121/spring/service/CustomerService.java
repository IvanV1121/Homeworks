package com.IvanV1121.spring.service;

import com.IvanV1121.spring.model.Customer;
import com.IvanV1121.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    ///////////////////////////////////////////////////// CRUD  ////////////////////////////////////////////////////////
    public void delete(Integer id) throws NotFoundExceptionService {
        Customer customer = repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());
        repository.delete(customer);
    }

    public Customer updateById(Integer id, Customer newCustomer) throws NotFoundExceptionService {
        Customer customer = repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());
        if (newCustomer.getName() != null) {
            customer.setName(newCustomer.getName());
        }
        if (newCustomer.getDistrict() != null) {
            customer.setDistrict(newCustomer.getDistrict());
        }
        if (newCustomer.getSale() != 0) {
            customer.setSale(newCustomer.getSale());
        }
        return repository.save(customer);
    }

    public Customer add(Customer newCustomer) {
        return repository.save(newCustomer);
    }

    public List<Customer> getAll() {
        return repository.findAll();
    }

    public Customer getById(Integer id) throws NotFoundExceptionService {
        return repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());
    }

    public Customer rewriteById(Integer id, Customer newCustomer) throws NotFoundExceptionService {
        Customer customer = repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());

        customer.setName(newCustomer.getName());
        customer.setDistrict(newCustomer.getDistrict());
        customer.setSale(newCustomer.getSale());
        return repository.save(customer);
    }

    ///////////////////////////////////////////////////// Query  ///////////////////////////////////////////////////////
    public List<String> getDistricts() {
        return repository.findDistricts();
    }
    public List<Object[]> getByDistrict(String district) {
        return repository.findByDistrict(district);
    }
}