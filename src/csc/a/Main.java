//package csc.a;

/////////////////////////////////////////////////////////////////////////////////////
// Dylan Conley
// CSC 160 Computer Science I, section 680
// March 30/April 3 , 2022
// This program will read a file and output a cube formation of numbers in a 4x4 matrix, and decide whether or not it is a magic square.
/////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {


        Scanner inputCube = new Scanner(new File("Lab8Data.txt"));


        while(true) {
            int d, c;
            int sumRow, sumColumn, sumDiag = 0, sum = 0;
            boolean checkRow = true;
            boolean checkColumn = true;
            boolean checkDiag = true;
            int[][] square = new int[4][4];

            //Creates the array.
            for (d = 0; d < 4; d++) {
                for (c = 0; c < 4; c++) {
                    square[d][c] = inputCube.nextInt();
                }
            }

            // Displays the array.
            for (d = 0; d < 4; d++) {
                for (c = 0; c < 4; c++) {
                    if (square[0][0] == -999) {
                        break;
                    }
                    System.out.print(square[d][c] + " ");
                }
                System.out.println();
            }


            //Math of first row sum, creating the neccesary sum to equal to with other rows, columns, and diagonals for Magic Square.
            for (c = 0; c < 4; c++) {
                sum += square[0][c];
            }

            //Now, math of row 2 and 3, to test against row 1. They must all equal the same.
            for (d = 1; d < 4; d++) {
                sumRow = 0;
                for (c = 0; c < 4; c++) {
                    sumRow += square[d][c];
                }
                if (sumRow != sum) {
                    checkRow = false;
                    break;
                }
            }

            //Math for columns
            for (c = 0; c < 4; c++) {
                sumColumn = 0;
                for (d = 0; d < 4; d++) {
                    sumColumn += square[d][c];
                }
                if (sumColumn != sum) {
                    checkColumn = false;
                    break;
                }
            }

            //Math for both diagonals, one at a time since they are opposite directions.
            for (d = 0; d < 4; d++) {
                for (c = 0; c < 4; c++) {
                    if (d == c) {
                        sumDiag += square[d][c];
                    }
                    if (sumDiag != sum) {
                        checkDiag = false;
                    }
                }
            }

            // check diagonal sums
            sumDiag = 0;
            for (d = 0; d < 4; d++) {
                for (c = 0; c < 4; c++) {
                    if ((d+c) == 3) {
                        sumDiag += square[d][c];
                    }
                    if (sumDiag != sum) {
                        checkDiag = false;
                    }
                }
            }

            // finish magic square
            System.out.println(checkRow);
            System.out.println(checkColumn);
            System.out.println(checkDiag);
            if (checkRow && checkColumn && checkDiag)
                System.out.println("IS a magic square\n");
            else
                System.out.println("NOT a magic square\n");
        }
    }
}