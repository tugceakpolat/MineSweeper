package com.example.minesweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int rows;
    int columns;
    String[][] board;
    String[][] mineLocation;
    int remainingCells;

    int mineCalculate;
    Scanner input = new Scanner(System.in);

    Random random = new Random();



    public MineSweeper(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new String[rows][columns];
        this.mineLocation = new String[rows][columns];
        this.remainingCells = rows * columns;
        this.mineCalculate = mineCalculate;


    }

    public void start() {

        System.out.println("Welcome to the Mine Sweeper game !");

        System.out.print("Please enter a rows number : ");
        rows = input.nextInt();
        System.out.print("Please enter a columns number : ");
        columns = input.nextInt();

        mineCalculate = (rows * columns) / 4;

        for (int i = 0; i < mineLocation.length; i++) {
            for (int j = 0; j < mineLocation[i].length; j++) {

                mineLocation[i][j] = "-";
                board[i][j] = "-";

            }
        }

        while (mineCalculate > 0){
            int i = random.nextInt(rows);
            int j = random.nextInt(columns);

            if (mineLocation[i][j].equals("-") ){
                mineLocation[i][j] = "*";
                mineCalculate--;
            }
        }
    }

    private void play(){

        boolean gameOver = false;

        while (!gameOver){
            System.out.print("Enter a rows : ");
            int selectedRows = input.nextInt();
            System.out.print("Enter a columns: ");
            int selectedColumns = input.nextInt();

            int number = 0;

            if (selectedRows < rows && selectedColumns <columns){
                if (mineLocation[selectedRows][selectedColumns].equals("-")&&board[rows][columns].equals("-")) {
                    for (int i = selectedRows-1; i < selectedRows +2; i++){
                        for (int j = selectedColumns -1; i < selectedColumns +2; i++){
                            if (i >= 0 && j >= 0 && i < rows && j < columns && mineLocation[i][j].equals("*")) {
                                number++;
                            board[selectedRows][selectedColumns] = Integer.toString(number);
                        }

                    }
                }
            }
        }
    }
        // private void printMineLocation (){

          //  System.out.println(" ");
           // for(int i=0; i < board.length; i++);

        }
    }
