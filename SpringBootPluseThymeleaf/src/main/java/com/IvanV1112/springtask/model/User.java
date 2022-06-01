package com.IvanV1112.springtask.model;

public class User {

    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private String email;
    private String workplace;
    private double salary;
    public User() {
    }
    public User(String name, String surname, String patronymic, int age, String email, String workplace, double salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.email = email;
        this.workplace = workplace;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder()
                .append(" ").append(name)
                .append(" ").append(surname)
                .append(" ").append(patronymic)
                .append(" ").append(age)
                .append(" ").append(email)
                .append(" ").append(workplace)
                .append(" ").append(salary);
        return stringBuilder.toString();
    }

}