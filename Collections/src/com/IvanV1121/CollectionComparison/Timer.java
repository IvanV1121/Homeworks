package com.IvanV1121.CollectionComparison;

public class Timer {

    private long start;
    private long finish;

    public Timer() {
        this.start = 0;
        this.finish = 0;
    }

    public void startTime(){
        start = System.nanoTime();
    }

    public long timeElapsed(){
        finish = System.nanoTime();
        return finish - start;
    }

}
