package com.bridgelabz;

import java.util.Scanner;

public class TicTocTac {
    public static char[] gameBoard = new char[10];
    public static Scanner scanner = new Scanner(System.in);
    public static char userTurn;
    public static char computerTurn;
    public static char user = '1';

    public static void declareArray() {
        System.out.println("welcome to tic tac toe game");
        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[i] = ' ';
        }
    }

    public static char user(Scanner scanner) {
        System.out.println("enter your choice X or 0 only");
        return scanner.next().toUpperCase().charAt(0);
    }

    public static void showBoard() {
        System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
        System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
        System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
    }

    public static void main(String[] args) {
        declareArray();
        user(scanner);
        showBoard();
    }

}
