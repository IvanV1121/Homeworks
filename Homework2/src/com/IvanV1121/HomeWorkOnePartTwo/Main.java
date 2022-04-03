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


        System.out.println("MyComplex equals and hashCode");
        MyComplex myComplex15 = new MyComplex(2,3);
        MyComplex myComplex16 = new MyComplex(2,3);
        if (myComplex15.equals(myComplex16)) {
            System.out.println("The complex numbers are equivalent");
        }else {
            System.out.println("The complex numbers are not equivalent");
        }
        System.out.println(myComplex15.hashCode());
        System.out.println(myComplex16.hashCode());


        System.out.println("MyPolinomial equals and hashCode");
        double[] myArray15 = {5.0, 6.0, 7.0, 8.0};
        MyPolynomial myPolynomial15 = new MyPolynomial(myArray15);
        MyPolynomial myPolynomial16 = new MyPolynomial(myArray15);
        if (myPolynomial15.equals(myPolynomial16)) {
            System.out.println("The polinomials are equivalent");
        }else {
            System.out.println("The polinomials are not equivalent");
        }

        System.out.println(myPolynomial15.hashCode());
        System.out.println(myPolynomial16.hashCode());


        System.out.println("Container equals and hashCode");
        Container container1 = new Container(-20, -20, 40, 40);
        Container container2 = new Container(-20, -20, 40, 40);
        if (container1.equals(container2)) {
            System.out.println("The containers are equivalent");
        }else {
            System.out.println("The containers are not equivalent");
        }
        System.out.println(container1.hashCode());
        System.out.println(container2.hashCode());


        System.out.println("Ball equals and hashCode");
        Ball ball1 = new Ball(2.0f, 1.0f, 5,6,7);
        Ball ball2 = new Ball(2.0f, 1.0f, 5,6,7);
        if (ball1.equals(ball2)) {
            System.out.println("The balls are equivalent");
        }else {
            System.out.println("The balls are not equivalent");
        }
        System.out.println(ball1.hashCode());
        System.out.println(ball2.hashCode());

   }
}
