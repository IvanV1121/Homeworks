package com.IvanV1121.HomeWorkOnePartOne;

import java.util.Objects;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = Objects.requireNonNull(v1);
        this.v2 = Objects.requireNonNull(v2);
        this.v3 = Objects.requireNonNull(v3);
    }

    @Override
    public String toString() {
        return "MyTriangle[v1 = ("+ v1.getX() + v1.getY() +"),v1 = ("+ v2.getX() + v2.getY() +
                "),v1 = (" + v3.getX() + v3.getY() +")]";
    }

    public double getPerimeter(){
        return v1.distance(v2)+
               v2.distance(v3)+
               v3.distance(v1);
    }

    public String getType(){
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);

        double Eps1 = (d1+d1)*0.001;
        double Eps2 = (d2+d3)*0.001;
        double Eps3 = (d3+d1)*0.001;

        if((Math.abs(d1 - d2)<=Eps1) && (Math.abs(d2 - d3)<=Eps2)){
            return "Equilateral";
        }else if((Math.abs(d1 - d2)<=Eps1) || (Math.abs(d2 - d3)<=Eps2) || (Math.abs(d3 - d1)<=Eps3)){
            return "Isosceles";
        }else{
            return "Scalene";
        }
    }
}
