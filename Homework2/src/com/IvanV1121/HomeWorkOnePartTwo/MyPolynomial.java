package com.IvanV1121.HomeWorkOnePartTwo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length-1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
            if (coeffs.length > 1){
                int nullCounter = 0;
                for (int i = 0; i < coeffs.length; i++) {
                    if (coeffs[i] != 0.0) {
                        nullCounter = i;
                        break;
                    }
                }
                coeffs = Arrays.copyOfRange(coeffs, nullCounter, coeffs.length);

                for (int i = 0; i <= (coeffs.length-1); i++) {
                    if (coeffs[i] != 0) {
                        if ((i > 0) && (coeffs[i]) > 0) {
                            stringBuilder.append("+");
                        }
                        if (i == (coeffs.length - 1)) {
                            stringBuilder.append(coeffs[i]);
                        } else if (i == (coeffs.length - 2)) {
                            stringBuilder.append(coeffs[i]).append("x");
                        } else {
                            stringBuilder.append(coeffs[i]).append("x^").append(coeffs.length - i - 1);
                        }
                    }
                }
            }
            else if((coeffs.length == 1) && (coeffs[0] != 0)){
                stringBuilder.append(coeffs[0]);
            }
            else if((coeffs.length == 1) && (coeffs[0] == 0)){
                stringBuilder.append("0");
            }
        return stringBuilder.toString();
    }

    public double evaluate(double x){
        double eValue = 0;
        for (int i = 0; i <= (coeffs.length-1); i++){
            eValue += Math.pow(x, i) * coeffs[coeffs.length-1-i];
        }
        return eValue;
    }

    private double[] arrInvert(double[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            double tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }

    public MyPolynomial add(MyPolynomial right) {

        int newCoeffsMax = Math.max(this.getDegree(), right.getDegree());
        int newCoeffsMin = Math.min(this.getDegree(), right.getDegree());

        double[] addResult = new double[newCoeffsMax+1];
        arrInvert(right.coeffs);
        arrInvert(this.coeffs);

        for (int i = 0; i <= (newCoeffsMax); i++) {
            if (i < newCoeffsMin+1) {
                addResult[i] = this.coeffs[i] + right.coeffs[i];

            } else if (this.getDegree() >= right.getDegree()) {
                addResult[i] += this.coeffs[i];

            } else if (this.getDegree() <= right.getDegree()) {
                addResult[i] += right.coeffs[i];

            }
        }
        arrInvert(addResult);
        MyPolynomial addPolymomial = new MyPolynomial(addResult);
        return addPolymomial;
    }

    public MyPolynomial multiply(MyPolynomial right) {

        double[] newCoeffs = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i < newCoeffs.length; i++) {
            for (int j = 0; j <= i; j++) {
                double poly1 = 0;
                double poly2 = 0;
                if (((i - j) <= right.getDegree()) && (j <= this.getDegree())) {
                    poly1 = this.coeffs[j];
                    poly2 = right.coeffs[i - j];
                }
                newCoeffs[i] += poly1 * poly2;
            }
        }
        MyPolynomial myPolynomial = new MyPolynomial(newCoeffs);
        return myPolynomial;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        MyPolynomial polinomial  = (MyPolynomial) obj;
        return (Arrays.compare(this.coeffs, polinomial.coeffs) == 0);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Arrays.hashCode(coeffs);
        return result;
    }

}





