package csc.a;

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
import java.util.Scanner;

class Main
{
    public static void main(String[] args) throws IOException
    {
        // Grab file with data
        File myFile = new File("Lab8Data.txt");
        Scanner input = new Scanner(myFile);

        // data pool that will hold all data
        int[][] magicSquare = new int[4][4];
        int[] rowTotal = {0, 0, 0, 0};
        int[] colTotal = {0, 0, 0, 0};
        int diagonal1Total = 0;
        int diagonal2Total = 0;
        boolean track = true;
        int sumRow = 0;
        int sumCol = 0;
        int sumDiag2 = 0;

        // run test to see if magic square
        while (true)
        {
/*
            int stopNum = input.nextInt();
            if (stopNum == -999) {
                break;
            }
*/

            // create 4x4 matrix
            for (int row=0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    magicSquare[row][col] = input.nextInt();

                }
            }

            // read matrix #1
            for (int row=0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    System.out.print(magicSquare[row][col] + " ");
                }
                System.out.println();
            }

            // row total
            for (int row = 0; row < 4; row++) {                     // grab row
                for (int col = 0; col < 4; col++) {                 // grab column
                    rowTotal[row] += magicSquare[row][col];         // total out
                    for (int i=0; i < rowTotal.length; i++) {
                        sumRow += rowTotal[i];
                    } if (sumRow != sumCol) {
                        track = false;
                    } if (sumRow != diagonal1Total) {
                        track = false;
                    }
                }
            }

            // column total
            for (int col = 0; col < 4; col++) {                     // grab col
                for (int row = 0; row < 4; row++) {                 // grab row
                    colTotal[col] = magicSquare[row][col];          // total out
                    for (int i=0; i < colTotal.length; i++) {
                        sumCol += colTotal[i];
                        if (sumCol != sumRow) {
                            track = false;
                        } if (sumCol != diagonal1Total) {
                            track = false;
                        }
                    }
                }
            }

            // top left to bottom right
            for (int row = 0; row < 4; row++) {                     // row + 1
                diagonal1Total += magicSquare[row][row];
                if (diagonal1Total != sumCol) {
                    track = false;
                } if (diagonal1Total != sumRow) {
                    track = false;

                }
            }
/*
            // top right to bottom left
            for (int row = 3; row >= 0; row--) {                    // row - 1
                for (int col = 3; col >= 0; col--) {
                    diagonal2Total += magicSquare[row][col];
 */
            if (!track) {
                System.out.println("It is not a magic square");
            } else {
                System.out.println("It is a magic square");
            }

        }
    }
}
