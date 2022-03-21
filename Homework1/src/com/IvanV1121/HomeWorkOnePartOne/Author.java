package com.IvanV1121.HomeWorkOnePartOne;

public class Author {

    private String name  = "Name";
    private String email = "Email";
    private char gender  = 'f';

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[name: " + name + ' ' + ", email: " + email + ' ' + "gender: " + gender + ']';
    }
}
