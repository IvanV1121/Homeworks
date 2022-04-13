package com.IvanV1121.Homework2Part1.Chapter1;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercise_2_AngleConversion");
        System.out.println("Enter the integer angle: ");
        int angle = scanner.nextInt();
        Exercise2 exercise2 = new Exercise2(angle);
        System.out.println("Normaliztion with %: " + exercise2.angleConversion1());
        System.out.println("Normaliztion with floorMod: "+ exercise2.angleConversion2());

        System.out.println("Exercise_6_Factorial");
        System.out.println("Enter the factorial size: ");
        int size = scanner.nextInt();
        Exercise6 exercise6 = new Exercise6(size);
        System.out.println(exercise6.factorialCalculation());

        System.out.println("Exercise_8_Substrings");
        System.out.println("Enter the string: ");
        String string = scanner.nextLine();
        Exercise8 exercise8 = new Exercise8(string);
        System.out.println(exercise8.subString());

        System.out.println("Exercise_13_Combination");
        System.out.println("Combination: " + Exercise13.getCombination());

        System.out.println("Exercise_14_MagicSquare");

        /* Square example
        7 12 1 14
        2 13 8 11
        16 3 10 5
        9 6 15 4
        */

        System.out.println("Enter the side of square: ");
        int side = scanner.nextInt();
        Square square = new Square(side);
        square.createSquare();
        square.showSquare();
        System.out.println(square.verificationSquare());
    }
}
