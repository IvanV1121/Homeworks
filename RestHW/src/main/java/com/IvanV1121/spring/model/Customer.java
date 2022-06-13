package com.IvanV1121.spring.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private int id;

    @Column(name = "customer_name", nullable = false)
    private String name;

    @Column(name = "customer_district", nullable = false)
    private String district;

    @Column(name = "customer_sale", nullable = false)
    private int sale;
}