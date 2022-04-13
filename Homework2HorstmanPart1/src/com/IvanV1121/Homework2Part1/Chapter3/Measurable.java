package com.IvanV1121.Homework2Part1.Chapter3;

/*Provide an interface Measurable with a method double getMeasure() that measures
an object in some way. Make Employee implement Measurable. Provide
a method double average(Measurable[] objects) that computes the average
measure. Use it to compute the average salary of an array of employees.*/

public interface Measurable {

    double getMeasure();

    String getFullName();

    static double averageSalary(Measurable[] objects) {
        double sumSalary = 0;
        if ((objects != null) && (objects.length != 0)) {
            for (Measurable object : objects) {
                sumSalary += object.getMeasure();
            }
        }
        return sumSalary / objects.length;
    }


/*Continue with the preceding exercise and provide a method Measurable
largest(Measurable[] objects). Use it to find the name of the employee with
the largest salary. Why do you need a cast?*/

    static String largestSalary(Measurable[] objects) {
        double maxSalary = 0;
        String fullName = "";
        if ((objects != null) && (objects.length != 0)) {
            for (Measurable object : objects) {
                if(object.getMeasure() > maxSalary){
                    maxSalary = object.getMeasure();
                    fullName = object.getFullName();
                }
            }
        }
        return fullName;
    }
}

/*

Cast в Java используется для приведения типов и включает два случая.

В первом случае Cast является расширяющим, а такое приведение типов называется также неявным.
Фактически это позволяет делать ссылку на дочерний объект с типом родителя.
Например, Measurable measurable = new Employee() - это upcast преобразование.

Во втором случае преобразование является сужающим. Оно небезопасно.
Осуществить такое преобразование можно только тогда, когда объект measurable является объектом типа Employee, то есть
Employee employee = (Employee) measurable - это downcast.
Если условие не выполяется, то возникает исключение.

*/


