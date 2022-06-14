package com.IvanV1121.spring.repository;

import com.IvanV1121.spring.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "select distinct customer_district from customer", nativeQuery = true)
    List<String> findDistricts();

    @Query(value = "select customer_name, customer_sale from customer where customer_district = :district", nativeQuery = true)
    List<Object[]> findByDistrict(String district);
}