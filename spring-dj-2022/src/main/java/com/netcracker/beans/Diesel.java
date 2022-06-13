package com.netcracker.beans;

public class Diesel implements IEngine{

    @Override
    public void drive() {
        System.out.println("Diesel.drive");
    }
}

