package com.IvanV1121.Homework2Part2.Chapter8;

public class Combolock {

    private int secret1;
    private int secret2;
    private int secret3;

    private final String sideRotatePattern = "lrl";
    private String sideRotateControl = "";

    private int currentPosition = 0;
    private int moveCounter = 0;
    private int[] move;

    public Combolock(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        move = new int[3];
    }

    public void reset(){
        currentPosition = 0;
        moveCounter = 0;
    }

    public void turnLeft(int ticks){
        currentPosition = currentPosition + ticks;

        if (currentPosition < 0){
            currentPosition += 40;
        } else if (currentPosition >= 40){
            currentPosition -= 40;
        }
        move[moveCounter] = currentPosition;
        sideRotateControl += "l";
        moveCounter++;

        if (moveCounter == 3){
            System.out.println(open());
        }
    }

    public void turnRight(int ticks){
        currentPosition = currentPosition - ticks;

        if (currentPosition < 0){
            currentPosition += 40;
        } else if (currentPosition >= 40){
            currentPosition -= 40;
        }
        move[moveCounter] = currentPosition;
        sideRotateControl += "r";
        moveCounter++;

        if (moveCounter == 3){
            System.out.println(open());
        }
    }

    public boolean open(){
        return (this.secret1 == move[0]) &&
               (this.secret2 == move[1]) &&
               (this.secret3 == move[2]) &&
               (sideRotatePattern.equals(sideRotateControl));
    }
}
