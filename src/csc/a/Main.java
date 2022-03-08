package csc.a;

//

// Ivan Pinnt

// CSC 160 Computer Science I, section 680

// Mar 7, 2022

// create methods that run certain pieces like:

//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();

        System.out.println (userInput);

    }
}

//javac Main.java
//java Main - will restart the whole program
//
// java Main < Lab06Data.txt - will pipe the
// file into the Main Scanner