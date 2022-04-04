package csc.a;

//
// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Mar 26, 2022
// string sorter, from "cba" to "abc"
//

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    // phase 1
    // create the string sorter method
    public static String sort(String string)
    {
        // convert input into char array
        char temporary[] = string.toCharArray();

        // use util.Arrays to sort the temp
        Arrays.sort(temporary);

        // return the new temp
        return new String(temporary);
    }

    // phase 2
    // call out the sorter on input
    public static void main(String[] args)
    {
        // String input = "ACBacb";
        Scanner inputUser = new Scanner(System.in);
        String input = inputUser.nextLine();
        String output = sort(input);

        System.out.println("Your input was " + input);
        System.out.println("Sorter displays " + output);
    }
}