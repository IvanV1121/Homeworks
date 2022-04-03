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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Author author = (Author) obj;
        return (Character.compare(this.gender, author.gender) == 0) && (this.name.equals(author.name)) &&
                (this.email.equals(author.email));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) gender;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}
