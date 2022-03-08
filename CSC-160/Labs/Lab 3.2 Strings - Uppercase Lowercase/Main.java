//

// Ivan Pinnt

// CSC 160 Computer Science I, section 680

// Feb 14, 2022

// Write a program that will ask the user to enter a sentence (including spaces)

//

//import utility scanner = input
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //input
        Scanner userInput = new Scanner(System.in);

        //question
        System.out.println("Sentence?");

        //read input
        String userOutput = userInput.nextLine();

        /*the first letter only
        did not realize i did not have to make the first letter out of the string capitalized...

        String firstletter = userOutput.substring(0,1);
        firstletter = firstletter.toUpperCase();
        String otherletters = userOutput.substring(2, userOutput.length());
        otherletters = otherletters.toLowerCase();
        System.out.println(firstletter + "" + otherletters);*/

        //space
        System.out.println("");

        //uppercase
        System.out.println(userOutput.toUpperCase());

        //lowercase
        System.out.println(userOutput.toLowerCase());
    }
}