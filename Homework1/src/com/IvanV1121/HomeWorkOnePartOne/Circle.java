package com.IvanV1121.HomeWorkOnePartOne;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){return Math.PI * Math.pow(radius, 2);}

    @Override
    public String toString() {
        return "Circle [ radius =" + radius + ", color =" + color +'\''+ ']';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Circle circle = (Circle) obj;
        return (Double.compare(this.radius, circle.radius) == 0) && (this.color.equals(circle.color));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(radius);
        result = 31 * result + color.hashCode();
        return result;
    }
}
