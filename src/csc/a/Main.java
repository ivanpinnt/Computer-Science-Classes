package csc.a;

//
// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Apr 3, 2022

// Pg. 311 Ch. 8 Ex. 11:
//
// Nine heads and tails game.
//
// Coin will be using a 3x3 matrix with values of
// 0=heads and 1=tails.
//
// It can also be produced by binary numbers I.E. (100000100)
//
// 512 Total possibilities

import java.util.Scanner;

class Main
{
    // create the binary method to convert decimal and numbers to binary
    public static String toBinary(int i)
    {
        // use StringBuilder since it is interchangeable
        StringBuilder build = new StringBuilder();

        // use a while loop to get to 0 'H'
        while (i != 0) {
            // test if i can move with >> (left shift and right shift)
            //System.out.println(i);
            build.append(i & 1);

            // right shift operator, sifting i by 1 right using >>
            // tested number sout; for mathematics, very confused on how it works
            i = i >> 1;
        }

        // binary 8
        while (build.length() < 9) {

            // either it is 0 or 1
            build.insert(0, "0");
        }

        // forgot to return int, and move to str for main
        return build.toString();
    }

    // create the program with the 2D array
    public static void main(String[] args)
    {
        // create 2D array
        int[][] library = new int[3][3];

        // create scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511: ");

        // move input to int and binary
        int userNum = input.nextInt();
        String userBinary = toBinary(userNum);

        // use 1 & 0 in binary strings
        int binaryLib = 0;
        // check length of 2D array
        for (int a=0; a < library.length; a++) {

            // check length of a in 2D array 'library' for binary
            for (int b=0; b < library[a].length; b++) {

                // if side is at binaryLibrary, set side to 0, or else set side to 1
                int side = userBinary.charAt(binaryLib++);
                if (side == '0') {
                    side = 0;
                } else {
                    side = 1;
                }

                // add side to 2D library
                library[a][b] = side;
            }
        }

        // check length of 2D array but this time for 'H' and 'T'
        for (int[] ints : library) {

            // use loop to search char with pre-built library
            for (int anInt : ints) {

                // search and change char value for 'H' and 'T'
                char userChar = (char) anInt;
                if (userChar == 0) {
                    userChar = 'H';
                } else {
                    userChar = 'T';
                }

                // print out characters
                System.out.print(userChar + " ");
            }
            System.out.println();
        }

    }
}