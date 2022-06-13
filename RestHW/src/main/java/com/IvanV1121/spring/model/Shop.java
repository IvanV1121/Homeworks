package com.IvanV1121.spring.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "shop")
@Data
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id", nullable = false)
    private int id;

    @Column(name = "shop_name", nullable = false)
    private String name;

    @Column(name = "shop_location", nullable = false)
    private String location;

    @Column(name = "shop_commission", nullable = false)
    private int commission;
}