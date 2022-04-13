package com.IvanV1121.Homework2Part1.Chapter2;

import java.util.Objects;

/*
Chapter 2

Exercises 5

Implement an immutable class Point that describes a point in the plane.
Provide a constructor to set it to a specific point, a no-arg constructor to
set it to the origin, and methods getX, getY, translate, and scale. The translate
method moves the point by a given amount in x- and y-direction. The
scale method scales both coordinates by a given factor. Implement these
methods so that they return new points with the results. For example,
Point p = new Point(3, 4).translate(1, 3).scale(0.5);
should set p to a point with coordinates (2, 3.5).*/


public final class Point {

    private final double x;
    private final double y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double deltaX, double deltaY){
        return new Point(x+deltaX, y+deltaY);
    }

    public Point scale(double factor){
        return new Point(x*factor, y*factor);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(x);
        result = 31 * result + Double.hashCode(y);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Point point = (Point) obj;
        return (Double.compare(point.x, x) == 0) && (Double.compare(point.y, y) == 0);
    }

    @Override
    public String toString() {
        return "("+x+"; "+y+")";
    }
}
