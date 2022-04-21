package com.IvanV1121.Homework2Part2.Chapter3;

public class Battery {

    private double capacity = 0;
    private double fullCapacity = 0;

    public Battery(double capacity) {
        this.capacity = capacity;
        this.fullCapacity = capacity;
    }

    public void drain(double amount){
        this.capacity  = this.capacity  - amount;
    }

    public void charge(){
        this.capacity = this.fullCapacity;
    }

    public double getRemainingCapacity(){
        return capacity;
    }

    @Override
    public String toString() {
        return "Battery with full capacity "+ this.fullCapacity +
              "A/h, and current capacity: " + this.capacity + " A/h.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass().equals(obj.getClass())) {
            Battery battery = (Battery)obj;
            return Double.compare(this.capacity, battery.capacity) == 0 &&
                   Double.compare(this.fullCapacity, battery.fullCapacity) == 0;

        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(this.capacity);
        result = 31 * result + Double.hashCode(this.fullCapacity);
        return result;
    }

}
