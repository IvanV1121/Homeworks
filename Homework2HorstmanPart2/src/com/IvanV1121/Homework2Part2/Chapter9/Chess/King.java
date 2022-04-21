package com.IvanV1121.Homework2Part2.Chapter9.Chess;

import java.util.ArrayList;

public class King extends ChessFigure {

    public King(String coordinates) {
        super(coordinates);
    }

    public ArrayList<String> validMoves(){

        ArrayList<String> canMoveTo = new ArrayList<>();

        int[] coordArray;
        coordArray = new int[2];

        coordArray = setPosition(getCoordinates());

        ArrayList<Integer> xMoveArray = new ArrayList<>();
        ArrayList<Integer> yMoveArray = new ArrayList<>();

        for (int i = coordArray[0] - 1; i <= coordArray[0] + 1; i++){
            for (int j = coordArray[1] - 1; j <= coordArray[1] + 1; j++){
                if(i != coordArray[0] || j != coordArray[1]){
                    xMoveArray.add(i);
                    yMoveArray.add(j);
                }
            }
        }
        for (int i = 0; i < xMoveArray.size(); i++){
            if((xMoveArray.get(i)<0 || xMoveArray.get(i)>7) || (yMoveArray.get(i)<0 || yMoveArray.get(i)>7)){
                xMoveArray.remove(i);
                yMoveArray.remove(i);
                i--;
            }
        }


        for (int i = 0; i < xMoveArray.size(); i++){
            canMoveTo.add((numberToLetter(xMoveArray.get(i)) + yMoveArray.get(i)));
        }
        return canMoveTo;
    }

}
