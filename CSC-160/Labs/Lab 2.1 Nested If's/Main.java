//

// Ivan Pinnt

// CSC 160 Computer Science I, section 680

// Feb 2, 2022

// Write a program that will ask the user for a number between 1 and 4 inclusive

//

//import utility scanner = input
import java.util.Scanner;

//start program
class Main
{
    public static void main(String[] args)
    {

        //create input
        Scanner input = new Scanner(System.in);
        //print out str
        System.out.println("Number?");
        //input int
        int x = input.nextInt();
        //if int is color
        if(x == 1) {
            System.out.println("");
            /* could not figure how to pass, only thing was a new line every test. */
            System.out.println(x + " is Cyan.");
        } else if(x == 2) {
            System.out.println("");
            System.out.println(x + " is Magenta.");
        } else if(x == 3) {
            System.out.println("");
            System.out.println(x + " is Yellow.");
        } else if(x == 4) {
            System.out.println("");
            System.out.println(x + " is Black.");
        } else if(x > 5 || x < 0) {
            System.out.println("That number is not valid.");
        }
    }
}