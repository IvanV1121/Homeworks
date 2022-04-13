package com.IvanV1121.Homework2Part1.Chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*Write a program that prints a lottery combination, picking six distinct
numbers between 1 and 49. To pick six distinct numbers, start with an
array list filled with 1...49. Pick a random index and remove the element.
Repeat six times. Print the result in sorted order.*/

public final class Exercise13 {

    public static List<Integer> getCombination(){
        List<Integer> numbers = new ArrayList<>(49);
        for (int i = 1; i <= 49; i++){
            numbers.add(i);
        }
        List<Integer> combination = new ArrayList<>(6);
        for (int i = 0; i < 6; i++){
            int position = (int)(Math.random()*(49-i));
            combination.add(numbers.get(position));
            numbers.remove(position);
            Collections.sort(combination);
        }
        return combination;
    }
}
