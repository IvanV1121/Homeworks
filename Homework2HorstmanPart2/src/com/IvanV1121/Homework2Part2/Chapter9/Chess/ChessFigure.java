package com.IvanV1121.Homework2Part2.Chapter9.Chess;

public class ChessFigure {

    private String coordinates;

    public ChessFigure(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public int[] setPosition(String coordinates){

        int[] coordArray;
        coordArray = new int[2];

        String firstPart;
        int secondPart;

        if(coordinates.length() == 2) {

            firstPart = String.valueOf(coordinates.charAt(0));
            firstPart = firstPart.toLowerCase();

            switch (firstPart) {
                case ("a"):
                    coordArray[0] = 0;
                    break;
                case ("b"):
                    coordArray[0] = 1;
                    break;
                case ("c"):
                    coordArray[0] = 2;
                    break;
                case ("d"):
                    coordArray[0] = 3;
                    break;
                case ("e"):
                    coordArray[0] = 4;
                    break;
                case ("f"):
                    coordArray[0] = 5;
                    break;
                case ("g"):
                    coordArray[0] = 6;
                    break;
                case ("h"):
                    coordArray[0] = 7;
                    break;
                default:
                    System.out.println("Enter valid value");
                    System.exit(-1);
            }

            secondPart = Character.getNumericValue(coordinates.charAt(1));

            if (secondPart <= 8) {
                coordArray[1] = secondPart;
            } else {
                System.out.println("Enter valid value!");
                System.exit(-1);
            }
            return coordArray;
        } else {
            System.out.println("Enter valid value!");
            System.exit(-1);
        }
        return coordArray;
    }

    public String numberToLetter(int num){
        String str;
        switch (num) {
            case (0):
                str= "a";
                return str;
            case (1):
                str= "b";
                return str;
            case (2):
                str= "c";
                return str;
            case (3):
                str= "d";
                return str;
            case (4):
                str= "e";
                return str;
            case (5):
                str= "f";
                return str;
            case (6):
                str= "g";
                return str;
            case (7):
                str= "h";
                return str;
            default:
                System.out.println("Enter valid value!");
        }
        return "";
    }
}
