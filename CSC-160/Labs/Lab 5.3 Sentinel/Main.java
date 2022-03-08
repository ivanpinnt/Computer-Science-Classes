//

// Ivan Pinnt

// CSC 160 Computer Science I, section 680

// Feb 14, 2022

// Using the while/sentinel approach, write a program that will read a line
// and print that line in all caps until it reaches a line containing only the word 'quit'

//

//import utility scanner = input
import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        //input
        Scanner input = new Scanner(System.in);

        //library
        boolean start = true;
        String stop = "quit";

        //loop
        while (start == true) {
            //repeated input
            String phrase = input.nextLine();

            //inputs to booleans
            boolean quitDoesNotEqualPhrase = !phrase.equals(stop);

            //boolean if statement
            if (quitDoesNotEqualPhrase == false) {
                System.out.println("quit");
                break;
            } else if (quitDoesNotEqualPhrase == true) {
                System.out.println(phrase.toUpperCase());
            }
        }
    }
}

//how booleans work with loops

//String  str1 = "Java";
//String  str2 = "Hungry";
//boolean notEqual = !str1.equals(str2);
//System.out.println( notEqual ); //true