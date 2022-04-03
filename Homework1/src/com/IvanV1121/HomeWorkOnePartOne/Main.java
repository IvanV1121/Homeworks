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

        System.out.println("Circle equals and hashCode");
        Circle circle1 = new Circle(1, "red");
        Circle circle2 = new Circle(1, "red");
        if (circle1.equals(circle2)) {
            System.out.println("Сircle1 and Circle2 are equivalent");
        }else {
            System.out.println("Сircle1 and Circle2 are not equivalent");
        }
        System.out.println(circle1.hashCode());
        System.out.println(circle2.hashCode());

        System.out.println("Rectangle equals and hashCode");
        Rectangle rectangle1 = new Rectangle(6, 4);
        Rectangle rectangle2 = new Rectangle(6, 4);
        if (rectangle1.equals(rectangle2)) {
            System.out.println("Rectangle1 and Rectangle2 are equivalent");
        }else {
            System.out.println("Rectangle1 and Rectangle2 are not equivalent");
        }
        System.out.println(rectangle1.hashCode());
        System.out.println(rectangle2.hashCode());

        System.out.println("Employee equals and hashCode");
        Employee employee1 = new Employee( 1 , "First", "Last", 1000);
        Employee employee2 = new Employee( 1 , "First", "Last", 1000);
        if (employee1.equals(employee2)) {
            System.out.println("The employees are equivalent");
        }else {
            System.out.println("The employees are not equivalent");
        }
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

        System.out.println("Author equals and hashCode");
        Author author1 = new Author("A", "A@email", 'm');
        Author author2 = new Author("A", "A@email", 'm');
        if (author1.equals(author2)) {
            System.out.println("The authors are equivalent");
        }else {
            System.out.println("The authors are not equivalent");
        }
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        System.out.println("Book equals and hashCode");
        Book book1 = new Book("Book1", new Author[]{A, B}, 10);
        Book book2 = new Book("Book1", new Author[]{A, B}, 10);
        if (book1.equals(book2)) {
            System.out.println("The books are equivalent");
        }else {
            System.out.println("The books are not equivalent");
        }
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println("MyTriangle equals and hashCode");
        MyPoint point1 = new MyPoint(4.1, 0);
        MyPoint point2 = new MyPoint(4.1, 0);
        MyPoint point3 = new MyPoint(-5, 5);
        MyTriangle myTriangle1 = new MyTriangle(point1,point2,point3);
        MyTriangle myTriangle2 = new MyTriangle(point1,point2,point3);
        if (myTriangle1.equals(myTriangle2)) {
            System.out.println("The triangles are equivalent");
        }else {
            System.out.println("The triangles are not equivalent");
        }
        System.out.println(myTriangle1.hashCode());
        System.out.println(myTriangle2.hashCode());

        System.out.println("MyPoint equals and hashCode");
        if (point1.equals(point2)) {
            System.out.println("The triangles are equivalent");
        }else {
            System.out.println("The triangles are not equivalent");
        }
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());



    }
}
