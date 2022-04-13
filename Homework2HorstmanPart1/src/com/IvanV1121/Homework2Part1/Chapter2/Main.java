package com.IvanV1121.Homework2Part1.Chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Exercise_5_Point");

        Point point1 = new Point(1, 2);
        Point point2 = point1.translate(3, 4);
        Point point3 = point2.scale(2);
        System.out.println("Point1: " + point1);
        System.out.println("Translate method result with deltaX=3, deltaY=4)");
        System.out.println("Point2: " + point2);
        System.out.println("Scale method result with factor 2)");
        System.out.println("Point3: " + point3);

        System.out.println("Exercise_9_Car");

        Car car = new Car(10);
        System.out.println("Initial gas level: " + car.getGas());
        System.out.println("Initial distance: " + car.getDistance());
        car.newFuelLevel(100.0);
        System.out.println("New gas level: " + car.getGas());
        System.out.println(car.deltaDistance(100));
        System.out.println("New distance: " + car.getDistance());
        System.out.println("New gas level: " + car.getGas());
        System.out.println(car.deltaDistance(950));
        System.out.println("New distance: " + car.getDistance());
        System.out.println("New gas level: " + car.getGas());

    }
}





