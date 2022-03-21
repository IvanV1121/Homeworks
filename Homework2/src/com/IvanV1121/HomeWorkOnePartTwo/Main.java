package com.IvanV1121.HomeWorkOnePartTwo;

public class Main {
    public static void main(String[] args) {

        System.out.println("=============Complex==================");

        MyComplex myComplex = new MyComplex(2,3);

        System.out.println("Equals");
        MyComplex myComplex1 = new MyComplex(2,3);
        System.out.println(myComplex1.equals(myComplex));

        System.out.println("Add");
        MyComplex myComplex2 = new MyComplex(2,3);
        MyComplex myComplex3 = new MyComplex(5,4);
        System.out.println(myComplex2.add(myComplex3));
        System.out.println(myComplex2);
        System.out.println(myComplex3);

        System.out.println("AddNew");
        MyComplex myComplex4 = new MyComplex(2,3);
        MyComplex myComplex5 = new MyComplex(5,4);
        System.out.println(myComplex4.addNew(myComplex5));
        System.out.println(myComplex4);
        System.out.println(myComplex5);

        System.out.println("Subtract");
        MyComplex myComplex6 = new MyComplex(2,3);
        MyComplex myComplex7 = new MyComplex(5,4);
        System.out.println(myComplex6.subtract(myComplex7));
        System.out.println(myComplex6);
        System.out.println(myComplex7);

        System.out.println("SubtractNew");
        MyComplex myComplex8 = new MyComplex(2,3);
        MyComplex myComplex9 = new MyComplex(5,4);
        System.out.println(myComplex8.subtractNew(myComplex9));
        System.out.println(myComplex8);
        System.out.println(myComplex9);

        System.out.println("Divid");
        MyComplex myComplex10 = new MyComplex(2,3);
        MyComplex myComplex11 = new MyComplex(5,4);
        System.out.println(myComplex10.divide(myComplex11));
        System.out.println(myComplex10);
        System.out.println(myComplex11);

        System.out.println("DividNew");
        MyComplex myComplex12 = new MyComplex(2,3);
        MyComplex myComplex13 = new MyComplex(5,4);
        System.out.println(myComplex12.divideNew(myComplex13));
        System.out.println(myComplex12);
        System.out.println(myComplex13);

        System.out.println("Conjugation");
        MyComplex myComplex14 = new MyComplex(2,3);
        System.out.println(myComplex14.conjugate());
        System.out.println(myComplex14);

        System.out.println("===============MyPolynomial================");

        double[] myArray0 = {10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0};
        MyPolynomial myPolynomial0 = new MyPolynomial(myArray0);
        System.out.println(myPolynomial0);

        double[] myArray1 = {10.0, -9.0, 8.0, -7.0, 6.0, -5.0, 4.0, -3.0, 2.0, -1.0};
        MyPolynomial myPolynomial1 = new MyPolynomial(myArray1);
        System.out.println(myPolynomial1);

        double[] myArray2 = {-3.0, -2.0, -1.0};
        MyPolynomial myPolynomial2 = new MyPolynomial(myArray2);
        System.out.println(myPolynomial2);

        double[] myArray3 = {3.0, -2.0};
        MyPolynomial myPolynomial3 = new MyPolynomial(myArray3);
        System.out.println(myPolynomial3);

        double[] myArray4 = {3.0};
        MyPolynomial myPolynomial4 = new MyPolynomial(myArray4);
        System.out.println(myPolynomial4);

        double[] myArray5 = {0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0};
        MyPolynomial myPolynomial5 = new MyPolynomial(myArray5);
        System.out.println(myPolynomial5);

        double[] myArray6 = {0.0, 1.0, 0.0, 1.0, 0.0, 1.0};
        MyPolynomial myPolynomial6 = new MyPolynomial(myArray6);
        System.out.println(myPolynomial6);

        double[] myArray7 = {5.0, 3.0, 5.0, 6.0};
        double[] myArray8 = {5.0, 3.0, 5.0, 6.0};
        MyPolynomial myPolynomial7 = new MyPolynomial(myArray7);
        MyPolynomial myPolynomial8 = new MyPolynomial(myArray8);
        System.out.println(myPolynomial7.add(myPolynomial8));

        double[] myArray9 = {5.0, 0.0, 5.0, 6.0};
        double[] myArray10 = {0.0, 0.0, 10.0, 0.0, 10.0, 0.0};
        MyPolynomial myPolynomial9 = new MyPolynomial(myArray9);
        MyPolynomial myPolynomial10 = new MyPolynomial(myArray10);
        System.out.println(myPolynomial9.add(myPolynomial10));

        double[] myArray11 = {0.0};
        double[] myArray12 = {0.0, 0.0, 5.0, 10.0};
        MyPolynomial myPolynomial11 = new MyPolynomial(myArray11);
        MyPolynomial myPolynomial12 = new MyPolynomial(myArray12);
        System.out.println(myPolynomial11.add(myPolynomial12));

        double[] myArray13 = {2.0, 3.0, 5.0, 10.0};
        double[] myArray14 = {0.0, 0.0, 5.0, 10.0};
        MyPolynomial myPolynomial13 = new MyPolynomial(myArray13);
        MyPolynomial myPolynomial14 = new MyPolynomial(myArray14);
        System.out.println(myPolynomial13.multiply(myPolynomial14));

        System.out.println("===============Ball================");

        Container container = new Container(-20, -20, 40, 40);
        System.out.println(container);
        Ball ball = new Ball(10.0f,10.0f, 1, 10, 10);
        System.out.println(ball);
        System.out.println(container.collides(ball));
        ball.move();
        System.out.println(ball);
        System.out.println(container.collides(ball));
        ball.move();
        System.out.println(ball);
        System.out.println(container.collides(ball));

   }
}
