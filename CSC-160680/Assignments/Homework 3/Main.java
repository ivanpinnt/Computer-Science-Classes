import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {

    //create random math
    int numOne = (int) (Math.random() * 100);
    int numTwo = (int) (Math.random() * 100);

    //create final data
    final int finalNumber = numOne + numTwo;

    //create input
    Scanner userInput = new Scanner(System.in);
    System.out.println("What is " + numOne + " + " + numTwo + " equal: ");
    int userOutput = userInput.nextInt();

    //create if clause
    if (userOutput == finalNumber) {
      System.out.println("You were correct!");
    }
    else {
      System.out.println("You failed!");
    }



  }
}