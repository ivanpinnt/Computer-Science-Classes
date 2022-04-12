//

// Ivan Pinnt

// CSC 160 Computer Science I, section 680

// Jan 24, 2022

// simple input and output program

//

//import utility scanner = input
import java.util.Scanner;

//program start

class Main {
    public static void main(String[] args) {

        //input variable
        Scanner userInput = new Scanner(System.in);

        //output for string input
        System.out.println("Name?");

        //string input
        String userFirstName = userInput.nextLine();

        //output for integer input
        System.out.println("How many classes?");

        //integer input
        int userClasses = userInput.nextInt();

        //OUTPUT
        System.out.println("Your name is " + userFirstName + " and you are in " + userClasses + " classes.");
    }
}