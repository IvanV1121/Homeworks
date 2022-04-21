package com.IvanV1121.Homework2Part2.Chapter9.Chess;

import java.util.ArrayList;

public class Queen extends ChessFigure {

    public Queen(String coordinates) {
        super(coordinates);
    }

    public ArrayList<String> validMoves(){

        ArrayList<String> canMoveTo = new ArrayList<>();

        int[] coordArray;
        coordArray = new int[2];

        coordArray = setPosition(getCoordinates());

        ArrayList<Integer> xMoveArray = new ArrayList<>();
        ArrayList<Integer> yMoveArray = new ArrayList<>();

        // Rook type moves

        for (int i = 0; i <= 7; i++){
            if((i+1) != coordArray[1]) {
                xMoveArray.add(coordArray[0]);
                yMoveArray.add(i+1);
            }
        }

        for (int j = 0; j <= 7; j++){
            if(j != coordArray[0]) {
                xMoveArray.add(j);
                yMoveArray.add(coordArray[1]);
            }
        }

        for (int k = 0; k < xMoveArray.size(); k++){
            if((xMoveArray.get(k)<0 || xMoveArray.get(k)>7) || (yMoveArray.get(k)<1 || yMoveArray.get(k)>8)){
                xMoveArray.remove(k);
                yMoveArray.remove(k);
                k--;
            }
        }

        // Bishop type moves

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
