package com.IvanV1121.Homework2Part1.Chapter1;

import java.util.Scanner;

/*Write a program that reads a two-dimensional array of integers and determines
whether it is a magic square (that is, whether the sum of all
rows, all columns, and the diagonals is the same). Accept lines of input
that you break up into individual integers, and stop when the user enters
a blank line.*/

public class Square {

    private int side = 0;
    int[][] square;

    public Square(int side) {
        this.side = side;
        this.square = new int[side][side];
    }

    public void createSquare() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers :");
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                square[i][j] = input.nextInt();
            }
        }
    }

    public void showSquare() {
        System.out.println("This square: ");
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificationSquare() {
        int compareSum = 0;
        for (int i = 0; i < side; i++) {
            compareSum += square[i][0];
        }
        for (int j = 1; j < side; j++){
            int columnSum = 0;
            for (int i = 0; i < side; i++){
                columnSum += square[i][j];
                }
            if(columnSum != compareSum){
                return false;
            }
        }

        for (int i = 0; i < side; i++){
            int rowSum = 0;
            for (int j = 0; j < side; j++){
                rowSum += square[i][j];
            }
            if(rowSum != compareSum){
                return false;
            }
        }
        int diagSum = 0;
        for (int i = 0; i < side; i++){
            for (int j = 0; j < side; j++){
                if (i == j){
                    diagSum += square[i][j];
                }
            }
        }
        if(diagSum != compareSum){
            return false;
        }

        diagSum = 0;
        for (int i = 0; i < side; i++){
            for (int j = 0; j < side; j++){
                if ((i + j) == side - 1){
                    diagSum += square[i][j];
                }
            }
        }
        if(diagSum != compareSum){
            return false;
        }
        return true;
    }
}