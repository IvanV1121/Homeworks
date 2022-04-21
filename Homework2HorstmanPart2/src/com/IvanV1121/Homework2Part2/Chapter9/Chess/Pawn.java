package com.IvanV1121.Homework2Part2.Chapter9.Chess;

import java.util.ArrayList;

public class Pawn extends ChessFigure {

    private String color;

    public Pawn(String coordinates, String color) {
        super(coordinates);
        this.color = color;
    }

    public ArrayList<String> validMoves(){

        ArrayList<String> canMoveTo = new ArrayList<>();

        String x = "" + getCoordinates().charAt(0);
        int y = Character.getNumericValue(getCoordinates().charAt(1));

        if (color.equals("white")){
            if(y == 1){
                canMoveTo.add("The white pawn can't be here!");
            } else if(y == 2){
                int firstYPosition  = y+1;
                int secondYPosition = y+2;
                canMoveTo.add(x+firstYPosition);
                canMoveTo.add(x+secondYPosition);
            } else if(y == 8){
                canMoveTo.add("The white pawn turns into a queen!");
            } else {
                int firstYPosition  = y+1;
                canMoveTo.add(x+firstYPosition);
            }
        }
        if (color.equals("black")) {
            if (y == 8) {
                canMoveTo.add("The black pawn can't be here!");
            } else if (y == 7) {
                int firstYPosition = y - 2;
                int secondYPosition = y - 1;
                canMoveTo.add(x + firstYPosition);
                canMoveTo.add(x + secondYPosition);
            } else if (y == 1) {
                canMoveTo.add("The pawn turns into a queen!");
            } else {
                int firstYPosition = y - 1;
                canMoveTo.add(x + firstYPosition);
            }
        }
        return canMoveTo;
    }
}
