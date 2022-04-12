//

// Ivan Pinnt

// CSC 160 Computer Science I, section 680

// Feb 14, 2022

// Write a program that asks the user for a five character string

//

//import utility scanner = input
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //input
        Scanner userInput = new Scanner(System.in);
        //output
        System.out.println("Five character string?");
        //read input
        String userOutput = userInput.nextLine();
        //locate characters
        char ch_0 = userOutput.charAt(0);
        char ch_1 = userOutput.charAt(1);
        char ch_2 = userOutput.charAt(2);
        char ch_3 = userOutput.charAt(3);
        char ch_4 = userOutput.charAt(4);
        //open line
        System.out.println("");
        //completed locate 1
        System.out.println(ch_0 + "" + ch_1);
        //completed locate 2
        System.out.println(ch_2 + "" + ch_3 + "" + ch_4);
    }
}