package com.IvanV1121.HomeWorkOnePartOne;

public class MyPoint {

    private double x = 0;
    private double y = 0;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY(){
        double[] CoordArray = new double[2];
        CoordArray[0] = x;
        CoordArray[1] = y;
        return CoordArray;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x0, double y0){
        double deltaX = this.x - x0;
        double deltaY = this.y - y0;
        return Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2));
    }

    public double distance(MyPoint another){
        double deltaX = this.x - another.getXY()[0];
        double deltaY = this.y - another.getXY()[1];
        return Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2));
    }

    public double distance(){
        return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
    }
}
