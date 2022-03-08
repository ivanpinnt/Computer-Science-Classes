package csc;

//

// Ivan Pinnt

// CSC 160 Computer Science I, section 680

// Feb 14, 2022

// Homework 4 - Programming Exercise 4.15 (page 154) Phone Pad

//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //input and output
        Scanner userInput = new Scanner(System.in); // user input
        System.out.println("Enter a lowercase or uppercase letter: "); // output

        // converts input to output
        // find ASCII of letter
        String userOutput = userInput.nextLine();
        char letterOutput = userOutput.charAt(0);
        int ASCII = (int) letterOutput;

        // if the number is greater on ascii scale
        //minus 32 to all numbers greater
        if (ASCII < 96) {
            ASCII -= 32;
        }

        int numberPad = 2;

        //a - c = 65 - 67
        if (ASCII < 68) {
            System.out.println(numberPad);
        }

        //

    }
}

