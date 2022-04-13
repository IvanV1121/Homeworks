package com.IvanV1121.Homework2Part1.Chapter3;

public class Employee implements Measurable{

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

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Employee employee = (Employee) obj;
        return (this.id == employee.id) && (this.firstName.equals(employee.firstName)) &&
                (this.lastName.equals(employee.lastName)) && (this.salary == employee.salary);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + salary;
        return result;
    }
}


