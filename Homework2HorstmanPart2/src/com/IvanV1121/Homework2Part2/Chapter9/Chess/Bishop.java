package com.IvanV1121.Homework2Part2.Chapter9.Chess;

import java.util.ArrayList;

public class Bishop extends ChessFigure {

    public Bishop(String coordinates) {
        super(coordinates);
    }

    public ArrayList<String> validMoves(){

        ArrayList<String> canMoveTo = new ArrayList<>();

        int[] coordArray;
        coordArray = new int[2];

        coordArray = setPosition(getCoordinates());

        ArrayList<Integer> xMoveArray = new ArrayList<>();
        ArrayList<Integer> yMoveArray = new ArrayList<>();

        int i, j;

        int coordsX = coordArray[0];
        int coordsY = coordArray[1];

        for (i = 1, j = 1; coordsY < 8 && coordsX < 7; i++, j++ ){
            coordsX = coordArray[0] + i;
            coordsY = coordArray[1] + j;
            xMoveArray.add(coordsX);
            yMoveArray.add(coordsY);
        }

        coordsX = coordArray[0];
        coordsY = coordArray[1];

        for (i = 1, j = 1; coordsY > 1 && coordsX > 0; i++, j++ ){
            coordsX = coordArray[0] - i;
            coordsY = coordArray[1] - j;
            xMoveArray.add(coordsX);
            yMoveArray.add(coordsY);
        }

        coordsX = coordArray[0];
        coordsY = coordArray[1];

        for (i = 1, j = 1; coordsY > 1 && coordsX < 7; i++, j++ ){
            coordsX = coordArray[0] + i;
            coordsY = coordArray[1] - j;
            xMoveArray.add(coordsX);
            yMoveArray.add(coordsY);
        }

        coordsX = coordArray[0];
        coordsY = coordArray[1];

        for (i = 1, j = 1; coordsY < 8 && coordsX > 0; i++, j++ ){
            coordsX = coordArray[0] - i;
            coordsY = coordArray[1] + j;
            xMoveArray.add(coordsX);
            yMoveArray.add(coordsY);
        }

        for (int k = 0; k < xMoveArray.size(); k++){
            canMoveTo.add((numberToLetter(xMoveArray.get(k)) + yMoveArray.get(k)));
        }
        return canMoveTo;
    }

}
