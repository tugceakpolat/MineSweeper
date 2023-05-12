package com.example.minesweeper;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Cell {

    Scanner input = new Scanner(System.in);
    Random random = new Random();
    String [][]board;
    int remainingCells;
    int bombCalculate;
    int bomb;
    int rows;
    int column;
    boolean hasBomb;
    String content;

    public Cell(int rows, int column){

        this.bomb = bomb;
        this.rows=rows;
        this.column = column;
        this.board = new String [rows][column];
        this.remainingCells = rows * column;
        this.bombCalculate = bombCalculate;
        this.hasBomb = false;
        this.content = "-";

    }

    public void user(){

        System.out.println("Welcome to Mine Sweper!");

        System.out.print("Please enter a rows number :");
        rows = input.nextInt();
        System.out.print("Please enter a column number :");
        column = input.nextInt();

    }

    public void Board (){

        bombCalculate = (remainingCells)/4;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){

                board[i][j] = content;
            }
        }

        while (bombCalculate > 0){
            int i = random.nextInt(rows);
            int j = random.nextInt(column);

            if (board [i][j] == content){
                board[i][j] = "*";
                bombCalculate--;
                hasBomb = false;

            }
        }
        }

        public void play(){

            System.out.print("Enter a rows : ");
            int rowsInput=input.nextInt();

            System.out.print("Enter a column : ");
            int columnInput=input.nextInt();

            if (board[rowsInput][columnInput] == "*"){
                System.out.println("Game Over!");
            }
            else{
                System.out.println("You're Safe!");
            }

        }

        public void map(){

            System.out.print(" ");

            for (int i=0; i<board.length; i++){
                for (int j=0; j<board.length; j++){
                    System.out.print(board[i][j] + " ");
                }
            }

            System.out.print("");

        }


    }








    //attributes-content String- hasBomb Boolean
    //default constructor (content = "-", hasBomb = false
    //get content methodu
    //get hasBomb
    //set content (bombaları gösterecek)
    //set hasBomb




