package com.IvanV1121.Homework2Part2.Chapter9.Chess;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Pawn(black/write)");
//        Pawn pawn = new Pawn("b2", "white");
//        ArrayList<String> pawnMove = pawn.validMoves();
//        for (String p : pawnMove)
//        {
//            System.out.print(p + ", ");
//        }
//        System.out.println();
//
//        System.out.println("Knigth");
//        Knigth knigth = new Knigth("e8");
//        ArrayList<String> knigthMove = knigth.validMoves();
//        for (String p : knigthMove)
//        {
//            System.out.print(p + ", ");
//        }
//        System.out.println();
//
//        System.out.println("King");
//        King king = new King("e4");
//        ArrayList<String> kingMove = king.validMoves();
//        for (String p : kingMove)
//        {
//            System.out.print(p + ", ");
//        }
//        System.out.println();
//
//        System.out.println("Rook");
//        Rook rook = new Rook("b2");
//        ArrayList<String> rookMove = rook.validMoves();
//        for (String p : rookMove)
//        {
//            System.out.print(p + ", ");
//        }
//        System.out.println();
//
//        System.out.println("Bishop");
//        Bishop bishop = new Bishop("e2");
//        ArrayList<String> bishopMove = bishop.validMoves();
//        for (String p : bishopMove)
//        {
//            System.out.print(p + ", ");
//        }
//        System.out.println();

        System.out.println("Queen");
        Queen queen = new Queen("a8");
        ArrayList<String> queenMove = queen.validMoves();
        for (String p : queenMove)
        {
            System.out.print(p + ", ");
        }
    }
}
