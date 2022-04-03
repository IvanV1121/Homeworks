package com.IvanV1121.HomeWorkOnePartOne;

import java.util.Arrays;

public class Book {
    private String name = "Name";
    private Author[] authors;
    private double price = 1.0;
    private int qty = 0;


    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String authorsString = Arrays.toString(authors);
        return "Book[name = " + name + ", authors = " + authorsString +
                ", price = "+ price + ", qty = " + qty + ']';
    }

    public String getAuthorNames(){
        String AuthorNames = "";
        int m = authors.length;
        for (int i = 0; i < m; i++){
            AuthorNames += authors[i].getName();
            if(i < m-1){
                AuthorNames += ",";
            }
        }
        return AuthorNames;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Book book = (Book) obj;
        return (Double.compare(this.price, book.price) == 0) && (this.name.equals(book.name)) &&
               (this.qty == book.qty) && (this.getAuthorNames().equals(book.getAuthorNames()));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + qty;
        result = 31 * result + name.hashCode();
        result = 31 * result + Double.hashCode(price);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }
}
