package com.IvanV1121.Homework2Part1.Chapter1;

import java.math.BigInteger;

/*Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
BigInteger. Compute the factorial of 1000.*/

public class Exercise6 {

    private int size;

    public Exercise6(int size) {
        this.size = size;
    }

    public BigInteger factorialCalculation(){
        if(size < 0){
            return BigInteger.valueOf(-1);
        } else {
            BigInteger result = BigInteger.valueOf(1);
            for (int i = 1; i <= size; i++){
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }
}
