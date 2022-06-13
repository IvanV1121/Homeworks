package com.IvanV1121.spring.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private int id;

    @Column(name = "book_title", nullable = false)
    private String title;

    @Column(name = "book_price", nullable = false)
    private int price;

    @Column(name = "book_storage", nullable = false)
    private String storage;

    @Column(name = "book_quantity", nullable = false)
    private int quantity;
}