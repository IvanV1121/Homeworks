package com.IvanV1121.HomeWorkOnePartTwo;

public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float)(direction * Math.cos(Math.toRadians(direction)));
        this.yDelta = (float)(-direction * Math.cos(Math.toRadians(direction)));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal(){
        xDelta = -xDelta;
    }

    public void reflectVertical(){
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        if ((xDelta >= 0)&&(yDelta)>=0) {
            return "Ball[(" + x + "," + y + "), speed = (Δ" + xDelta + ", Δ" + yDelta + ")]";
        } else if((xDelta < 0)&&(yDelta)>=0){
            return "Ball[(" + x + "," + y + "), speed = (-Δ" + Math.abs(xDelta) + ", Δ" + yDelta + ")]";
        } else if((xDelta >= 0)&&(yDelta) < 0){
            return "Ball[(" + x + "," + y + "), speed = (Δ" + xDelta + ", -Δ" + Math.abs(yDelta) + ")]";
        } else if((xDelta < 0) && (yDelta) < 0) {
            return "Ball[(" + x + "," + y + "), speed = (-Δ" + Math.abs(xDelta) + ", -Δ" + Math.abs(yDelta) + ")]";
        }
        return "Error";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Ball ball = (Ball) obj;
        return (Float.compare(this.x, ball.x) == 0) && (Float.compare(this.y, ball.y) == 0) &&
               (Float.compare(this.xDelta, ball.xDelta) == 0) && (Float.compare(this.yDelta, ball.yDelta) == 0) &&
               (this.radius == ball.radius);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Float.hashCode(x);
        result = 31 * result + Float.hashCode(y);
        result = 31 * result + Float.hashCode(xDelta);
        result = 31 * result + Float.hashCode(yDelta);
        result = 31 * result + radius;
        return result;
    }
}

