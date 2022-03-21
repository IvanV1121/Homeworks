package com.IvanV1121.HomeWorkOnePartOne;

public class Employee {

    private int id = 1;
    private String firstName = " ";
    private String lastName = " ";
    private int salary = 2;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName+' '+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary*12;
    }

    public int raiseSalary(int percent) {
        salary += (salary/100) * percent;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id = " + id + ' '+ ", name = " + getName() + ", salary = " + salary +']';
    }
}
