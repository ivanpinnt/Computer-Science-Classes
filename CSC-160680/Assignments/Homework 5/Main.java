package com.company;

//

// Ivan Pinnt

// CSC 160 Computer Science I, section 680

// Mar 6, 2022

/*
  Count vowels and consonants
  A, E, I, O, U are vowels - count them in a string to print out vowels
*/

//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create input
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String nextObj = newObj.nextLine();

        // the counter to count total of catches
        int countVowel = 0;
        int countCons = 0;

        // library
        String vowels = "aeiouAEIOU";
        int i;

        // loop for vowels and consonants
        int lengthOfObj = nextObj.length();
        for( i=0; i<lengthOfObj; i++) {
            char charObj = nextObj.charAt(i);
            // finds library, but needed a >= 0 could not use == 0
            if (vowels.indexOf(charObj) >= 0)
                countVowel++;
            else if (Character.isLetter(charObj)) //checks to see if letter is upper or lower case
                countCons++;
        }
        System.out.println("The number of vowels " + countVowel);
        System.out.println("The number of consonants " + countCons);
    }
}
