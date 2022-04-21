package com.IvanV1121.Homework2Part2.Chapter3;

public class Sheet {

    private double width = 841;
    private double height = 1189;

    public Sheet() {

    }

    public double getWidth() {
        return width;


    }

    public double getHeight() {
        return height;
    }

    public static String nameOfSheet(Sheet obj){
        Sheet aSheet = new Sheet();
        double TypeOfShit =   Math.round((aSheet.width * aSheet.height)/(obj.getWidth() * obj.getHeight()));
        int format = (int)(Math.log((int)TypeOfShit) / Math.log(2));
        return "This sheet with width = " + obj.getWidth()  +
                          "and height = " + obj.getHeight() +
                               " is an A" + format + " sheet";
    }

    public static Sheet cutInHalf(Sheet obj) {
        Sheet sheet = new Sheet();
        double h  = obj.width;
        double w  = obj.height/2;
        if (h < w){
            sheet.width  = Math.floor(w);
            sheet.height = Math.floor(h);
        } else {
            sheet.width  = Math.floor(w);
            sheet.height = Math.floor(h);
        }
        return sheet;
    }
}
