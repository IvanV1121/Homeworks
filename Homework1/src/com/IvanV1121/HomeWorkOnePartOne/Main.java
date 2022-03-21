package com.IvanV1121.HomeWorkOnePartOne;

public class Main {
    public static void main(String[] args) {

        System.out.println("Circle");

        Circle circle = new Circle(5, "green");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        System.out.println("Rectangle");

        Rectangle rectangle = new Rectangle(6, 4);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();

        System.out.println("Employee");

        Employee employee = new Employee( 1 , "First", "Last", 1000);
        System.out.println(employee);
        System.out.println("Annual salary: " + employee.getAnnualSalary());
        employee.raiseSalary(10);
        System.out.println(employee);
        System.out.println("New annual salary: " + employee.getAnnualSalary());

        System.out.println("Book");

        Author A = new Author("A", "A@email", 'm');
        Author B = new Author("B", "B@email", 'f');
        Book book = new Book("Book", new Author[]{A, B}, 500.0);
        System.out.println(book);
        System.out.println("Author names: " + book.getAuthorNames());

        System.out.println("MyPoint");

        MyPoint mypoint = new MyPoint(1, 1);
        MyPoint another = new MyPoint(6, 7);
        System.out.println(mypoint.getXY()[0]);
        System.out.println(mypoint.getXY()[1]);
        System.out.println(mypoint.distance(2,2));
        System.out.println(mypoint.distance(another));
        System.out.println(mypoint.distance());

        System.out.println("MyTriangle");

        MyPoint v1 = new MyPoint(4, 0);
        MyPoint v2 = new MyPoint(0, 4.1);
        MyPoint v3 = new MyPoint(0, 0);
        MyTriangle myTriangle = new MyTriangle(v1,v2,v3);
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());

    }
}
