package com.IvanV1121.Homework2Part2.Chapter9.WorkedExample;

public class SalariedEmployee extends Employee{

    private double annualSalary;

    public SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    public double weeklyPay(int hoursWorked)
    {
        final int WEEKS_PER_YEAR = 52;
        return annualSalary / WEEKS_PER_YEAR;
    }

}
