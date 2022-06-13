package com.netcracker.beans;

public class Car {

    private IEngine engine;
    private String vin;

//    public Car(IEngine engine, String vin) {
//        this.engine = engine;
//        this.vin = vin;
//    }

    public IEngine getEngine() {
        return engine;
    }

    public String getVin() {
        return vin;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
