package com.IvanV1121.HomeWorkOnePartTwo;

public class Container {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collides(Ball ball) {
        return ((ball.getX() - ball.getRadius() >= x1) &&
                (ball.getX() + ball.getRadius() <= x2) &&
                (ball.getY() - ball.getRadius() >= y1) &&
                (ball.getY() + ball.getRadius() <= y2));
    }

    @Override
    public String toString() {
        return "Container [("+ x1 + "," + y1 + "),("+ x2 + "," + y2 +")]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Container container = (Container) obj;
        return (this.x1 == container.x1) && (this.x2 == container.x2) &&
               (this.y1 == container.y1) && (this.y2 == container.y2);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x1;
        result = 31 * result + x2;
        result = 31 * result + y1;
        result = 31 * result + y2;
        return result;
    }
}
