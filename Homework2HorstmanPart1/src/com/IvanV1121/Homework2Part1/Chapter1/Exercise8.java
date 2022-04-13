package com.IvanV1121.Homework2Part1.Chapter1;

import java.util.ArrayList;

/*Write a program that reads a string and prints all of its nonempty
substrings.*/

public class Exercise8 {

    private String string;

    public Exercise8(String string) {
        this.string = string;
    }

    public ArrayList<String> subString(){
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i <= string.length(); i++){
            for (int j = i+1; j <= string.length(); j++){
                stringList.add(string.substring(i,j));
            }
        }
        return stringList;
    }
}
