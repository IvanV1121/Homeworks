package com.IvanV1121.Homework2Part1.Chapter1;

/*Write a program that reads an integer angle (which may be positive or
negative) and normalizes it to a value between 0 and 359 degrees. Try
it first with the % operator, then with floorMod.*/

public class Exercise2 {

    private int angle;

    public Exercise2(int angle) {
        this.angle = angle;

    }
    public int angleConversion1() {
        return (angle >= 0 ? angle % 360 : (angle % 360) + 360);
    }
    public int angleConversion2(){
        return Math.floorMod(angle, 360);
    }
}
