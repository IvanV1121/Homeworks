package com.IvanV1121.Homework2Part2.Chapter9.Alarm;

import java.time.LocalTime;

public class ClockWithAlarm {

    private int alarmHour;
    private int alarmMinute;

    int label;

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
        int hours = getHours();
        int minutes = getMinutes();
        String date = new String();

        if(label == 1){
            if(getHours() > alarmHour){
                if (hours < 10)
                    date = "0" + hours + " hours and ";
                else
                    date = hours + " hours and ";
                if (minutes < 10)
                    date = date + "0" + minutes + " minutes. Alarm!";
                else
                    date = date + minutes + " minutes. Alarm!";
                alarmReset();
                return date;

            } else if((hours == alarmHour) && (minutes >= alarmMinute)) {
                if (hours < 10)
                    date = "0" + hours + " hours and ";
                else
                    date = hours + " hours and ";
                if (minutes < 10)
                    date = date + "0" + minutes + " minutes. Alarm!";
                else
                    date = date + minutes + " minutes. Alarm!";
                alarmReset();
                return date;

            } else {
                if (hours < 10)
                    date = "0" + hours + " hours and ";
                else
                    date = hours + " hours and ";
                if (minutes < 10)
                    date = date + "0" + minutes + " minutes.";
                else
                    date = date + minutes + " minutes. ";
                return date + "Alarm is not achieved";
            }

        } else {
            if (hours < 10)
                date = "0" + hours + " hours and ";
            else
                date = hours + " hours and ";
            if (minutes < 10)
                date = date + "0" + minutes + " minutes.";
            else
                date = date + minutes + " minutes.";
            return date;
        }
    }


    public void setAlarm(int alarmHour, int alarmMinute){
        if((alarmHour >= 0) && (alarmHour <= 24)){
            this.alarmHour = alarmHour;
        }
        if((alarmMinute >= 0) && (alarmMinute <= 59)){
            this.alarmMinute = alarmMinute;
        }
        label = 1;
    }

    public String getCurrentAlarm()
    {
        return "The alarm is set to " + alarmHour + " hours and " + alarmMinute + " minutes." ;
    }

    private String alarmReset(){
        alarmHour = 0;
        alarmMinute = 0;
        label = 0;
        return "Alarm reset done!";
    }
}


