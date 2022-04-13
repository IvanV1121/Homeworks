package com.IvanV1121.Homework2Part1.Chapter2;

/*Implement a class Car that models a car traveling along the x-axis, consuming
gas as it moves. Provide methods to drive by a given number of
miles, to add a given number of gallons to the gas tank, and to get the
current distance from the origin and fuel level. Specify the fuel efficiency
(in miles/gallons) in the constructor. Should this be an immutable class?
Why or why not?*/

public class Car {

    private double distance = 0.0;
    private double gas = 0.0;
    private double gasEfficiency = 0.0;

    public Car(double gasEfficiency) {
        this.distance = distance;
        this.gas = gas;
        this.gasEfficiency = gasEfficiency;
    }

    public double getDistance() {
        return distance;
    }

    public double getGas() {
        return gas;
    }

    public String deltaDistance(double deltaDist){
        double deltaGas = deltaDist/gasEfficiency;
        if (gas >= deltaGas){
            gas -= deltaGas;
            distance += deltaDist;
            return ("This car driven " + distance + "miles");
        } else {
            distance += gas*gasEfficiency;
            gas = 0;
            return ("This car driven only" + distance + " miles, because it has not gas");
        }
    }

    public void newFuelLevel(double deltaGas){
        gas += deltaGas;
    }
}
