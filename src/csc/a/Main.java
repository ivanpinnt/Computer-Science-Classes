//package csc.a;

// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Apr 2, 2022
//
// Given an array in Lab 8.0, with the data in a 4x4 column
// make a magic square that grabs data diagonally, by row, and column

// load 16 numbers in 2x2 array, use index of arrays
// to grab num to sum

// 1  2  3  4
// 5  6  7  8
// 9 10 11 12
//13 14 15 16

// rowTotal = [10, 26, 42, ..]
// col total = [28, ..]

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) throws IOException
    {
        // Grab file with data
        File myFile = new File("Lab8Data.txt");
        Scanner input = new Scanner(myFile);

        boolean rowOkay = true;
        boolean colOkay = true;
        boolean diagOkay = true;

        // run test to see if magic square
        while (true)
        {
            // reset -- magic square
            int[][] magicSquare = new int[4][4];
            // reset -- data pool that will hold all data
            int[] rowTotal = {0, 0, 0, 0};
            int[] colTotal = {0, 0, 0, 0};
            int[] firstRow = {};
            int diagonalTotal = 0;
            int diagonalRevTotal = 0;
            int sumRow = 0;
            int sumCol = 0;

            // create 4x4 matrix
            for (int row=0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    magicSquare[row][col] = input.nextInt();
                }
            }

            // read matrix
            for (int row=0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    if (magicSquare[0][0] == -999) {
                        break;
                    }
                    System.out.print(magicSquare[row][col] + " ");
                }
                System.out.println();
            }

            // row total
            for (int row = 0; row < 4; row++) {                     // grab row
                for (int col = 0; col < 4; col++) {                 // grab column
                    rowTotal[row] += magicSquare[row][col];         // total out
                }
            }

            // column total
            for (int col = 0; col < 4; col++) {                     // grab col
                for (int row = 0; row < 4; row++) {                 // grab row
                    colTotal[col] += magicSquare[row][col];          // total out
                }
            }

            // top left to bottom right
            for (int row = 0; row < 4; row++) {                     // row + 1
                diagonalTotal += magicSquare[row][row];
            }

            // top right to bottom left
            int cols = 3;
            for (int row = 0; row < 4; row++) {                    // row - 1
                diagonalRevTotal += magicSquare[row][cols];
                cols -= 1;
            }

            // check rows
            for (int x = 0; x < 4; x++) {
                if (rowTotal[x] != rowTotal[0]) {
                    rowOkay = false;
                    break;
                }
            }

            // check columns
            for (int x = 0; x < 4; x++) {
                if (colTotal[x] != colTotal[0]) {
                    colOkay = false;
                    break;
                }
            }

            // check the diagonals
            if (diagonalTotal != diagonalRevTotal) {
                diagOkay = false;
            }

            if (rowOkay && colOkay && diagOkay) {
                if ((rowTotal[0] == colTotal[0]) && (colTotal[0] == diagonalTotal)) {
                    System.out.println("It is a magic square");
                } else {
                    System.out.println("It is not a magic square");
                }
            }

            System.out.println("row = " + sumRow);
            System.out.println("col = " + sumCol);
            System.out.println("diag = " + diagonalTotal);
            System.out.println("Revdiag = " + diagonalRevTotal);

        }
    }
}