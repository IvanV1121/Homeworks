package com.IvanV1121.Homework2Part2.Chapter9.Time;

import java.time.LocalTime;

public class WorldClock extends Clock{

    private int timeOffset;

    public WorldClock(int timeOffset) {
        this.timeOffset = timeOffset;
    }

    public int getHours() {
        String time = LocalTime.now().toString();
        String[] words = time.split(":");
        int hour = Integer.parseInt(words[0]);
        hour = (hour + timeOffset) % 24;
        return hour;
    }
}


