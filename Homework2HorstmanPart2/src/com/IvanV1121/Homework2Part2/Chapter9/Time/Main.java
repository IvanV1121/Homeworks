package com.IvanV1121.Homework2Part2.Chapter9.Time;

public class Main {

    public static void main(String[] args) {

        System.out.println("Текущее время: ");
        Clock clock = new Clock();
        System.out.println(clock.getTime());

        System.out.println("Создание объекта со сдвинутым временем: ");
        WorldClock worldClock = new WorldClock(3);
        worldClock.getHours();
        System.out.println(worldClock.getTime());

        }
    }



