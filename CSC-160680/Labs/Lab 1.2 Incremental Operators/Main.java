//

// Ivan Pinnt

// CSC 160 Computer Science I, section 680

// Jan 30, 2022

// next integer after enetered integer

//

//import utility scanner = input
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //input object
        Scanner userInput = new Scanner(System.in);

        //output string
        System.out.println("Integer?");

        //integer input number
        int userNumber = userInput.nextInt();

        //output user input
        System.out.println("The integer you entered is " + userNumber + ".");

        //input integer mathematics
        int userNumberPlusOne = ++userNumber;

        //out put mathematics
        System.out.println("The next integer is " + userNumberPlusOne + ".");

    }
}