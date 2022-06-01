package com.netcracker.model;

import javax.validation.constraints.*;

public class UserData {

    @NotBlank(message = "")
    @Pattern(regexp =  "^([a-zA-Z]*)$", message = "")
    private String name;
    @NotBlank(message = "")
    @Pattern(regexp =  "^([a-zA-Z]*)$", message = "")
    private String surname;
    @NotBlank(message = "")
    @Pattern(regexp =  "^([a-zA-Z]*)$", message = "")
    private String patronymic;
    @Min(0)
    @Max(130)
    private int age;
    @DecimalMin(value = "0.1")
    private Double salary;
    @NotBlank(message = "")
    @Email
    private String email;
    @NotBlank(message = "")
    @Pattern(regexp =  "^([a-zA-Z]*)$", message = "")
    private String workplace;


    public UserData() {
    }

    public UserData(String name, String surname, String patronymic, int age, Double salary, String email, String workplace) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.salary = salary;
        this.email = email;
        this.workplace = workplace;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", workplace='" + workplace + '\'' +
                '}';
    }
}
