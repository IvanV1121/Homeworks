package com.IvanV1121.Homework2Part2.Chapter9.Time;

import java.time.LocalTime;

public class Clock {

    public int getHours(){

        String time = LocalTime.now().toString();
        String[] words = time.split(":");
        int hour = Integer.parseInt(words[0]);
        return hour;
    }
    public int getMinutes(){
        String time = LocalTime.now().toString();
        String[] words = time.split(":");
        int minute = Integer.parseInt(words[1]);
        return minute;
    }

    public String getTime(){

        int hour = getHours();
        int minutes = getMinutes();
        String date = new String();

        if (hour < 10)
            date = "0" + hour + " hours and ";
        else
            date = hour + " hours and ";

        if (minutes < 10)
            date = date + "0" + minutes + " minutes ";
        else
            date = date + minutes + " minutes ";

        return date;
    }
}


