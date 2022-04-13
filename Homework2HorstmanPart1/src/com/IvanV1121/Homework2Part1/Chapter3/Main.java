package com.IvanV1121.Homework2Part1.Chapter3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise1");
        System.out.println("Exercise2");

        Employee employee1 = new Employee(1, "First1", "Last1", 1);
        Employee employee2 = new Employee(10, "First2", "Last2", 10);
        Employee employee3 = new Employee(100, "First3", "Last3", 100);
        Employee employee4 = new Employee(1000, "First4", "Last4", 10000);
        Employee employee5 = new Employee(100, "First5", "Last5", 1000);

        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4, employee5};
        System.out.println("Average salary : " + Measurable.averageSalary(employees));
        System.out.println("Employee with largest salary : " + Measurable.largestSalary(employees));


        System.out.println("Exercise3");

        /*What are all the supertypes of String? Of Scanner? Of ImageOutputStream? Note
        that each type is its own supertype. A class or interface without declared
        supertype has supertype Object

        Класс String реализует интерфейсы Serializable, CharSequence, Comparable<String>, Constable, ConstantDesc;
        Класс Scanner реализует интерфейсы Closeable, AutoCloseable, Iterator<String>;
        Интерфейс ImageOutputStream расширяет следующие классы FileCacheImageOutputStream,
        FileImageOutputStream, ImageOutputStreamImpl, MemoryCacheImageOutputStream.
        */

        System.out.println("Exercise4");

        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        System.out.print(sequence.yieldNumbers());
        System.out.println();

        System.out.println("Exercise5");
        IntSequence sequence1 = IntSequence.constant(1);
        sequence1.returnConst();
    };
}

