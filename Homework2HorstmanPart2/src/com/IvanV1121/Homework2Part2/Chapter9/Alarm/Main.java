package com.IvanV1121.Homework2Part2.Chapter9.Alarm;

public class Main {

    public static void main(String[] args) {

        System.out.println("Создание объекта Будильник.");
        ClockWithAlarm clockWithAlarm = new ClockWithAlarm();
        System.out.println(clockWithAlarm.getTime());
        System.out.println("Установка будильника на время, которое больше текущего");
        clockWithAlarm.setAlarm(1, 40);
        System.out.println(clockWithAlarm.getCurrentAlarm());
        System.out.println(clockWithAlarm.getTime());
        System.out.println("Установка будильника на время, которое меньше текущего.");
        clockWithAlarm.setAlarm(1, 00);
        System.out.println(clockWithAlarm.getTime());
        System.out.println("Будильник сброшен.");
        System.out.println(clockWithAlarm.getCurrentAlarm());
        System.out.println("Создание объекта со сдвинутым временем.");
        WorldClock worldClock = new WorldClock(3);
        worldClock.getHours();
        System.out.println(worldClock.getTime());
        System.out.println("Установка будильника на время, которое больше текущего, для объекта со сдвинутым временем.");
        worldClock.setAlarm(4, 50);
        System.out.println(worldClock.getTime());
    }
}



