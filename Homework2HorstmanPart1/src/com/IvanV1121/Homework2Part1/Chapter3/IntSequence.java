package com.IvanV1121.Homework2Part1.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;

/*Implement a static of method of the IntSequence class that yields a sequence
with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
sequence with six values. Extra credit if you return an instance of an
anonymous inner class.*/

public class IntSequence {

    public String yieldNumbers() {
        return " ";
    }

    public void returnConst() {
    }

    public static IntSequence of(int... values) {
        return new IntSequence() {
            int[] valuesArray = Arrays.copyOf(values, values.length);

            public String yieldNumbers() {
                String stringValues = Arrays.toString(valuesArray);
                return stringValues;
            }
        };
    }

    public static IntSequence constant(int i){
        return new IntSequence() {
            ArrayList<Integer> list = new ArrayList<>();

            public void returnConst() {
                int i=0;
                while (true)
                {
                    Integer j = 1;
                    list.add(j);
                    System.out.println(list.get(i));
                    i++;
                }
            }
        };
    }
}



