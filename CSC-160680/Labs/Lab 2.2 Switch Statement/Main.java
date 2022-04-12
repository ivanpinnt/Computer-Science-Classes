//

// Ivan Pinnt

// CSC 160 Computer Science I, section 680

// Feb 7, 2022

// Using switch statementsfrom the previous lab: nested ifs

//

//import utility scanner = input
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //new input
        Scanner userInput = new Scanner(System.in);
        //output for user
        System.out.println("Number?");
        //input number from console
        int x = userInput.nextInt();

        //switch program
        switch(x) {
            case 1:
                System.out.println("");
                /* same thing with the if program, i could not pass the tests unless i put a new line before output */
                System.out.println(x + " is Cyan.");
                break;
            case 2:
                System.out.println("");
                System.out.println(x + " is Magenta.");
                break;
            case 3:
                System.out.println("");
                System.out.println(x + " is Yellow.");
                break;
            case 4:
                System.out.println("");
                System.out.println(x + " is Black.");
                break;
            default:
                System.out.println("");
                System.out.println("That number is not valid.");
        }
    }
}