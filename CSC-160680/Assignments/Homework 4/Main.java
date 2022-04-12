import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////
//
// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Feb 14, 2022
// Homework 4 - Programming Exercise 4.15 (page 154) Phone Pad
//
////////////////////////////////////////////////////////////////////////////////////


class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in); // user input
        System.out.println("Enter a lowercase or uppercase letter: "); // output

        String userOutput = userInput.nextLine(); // converts input to output
        char letterOutput = userOutput.charAt(0);
        int ASCII = (int) letterOutput; // find ASCII of letter

        // library of ASCII CAPITAL letters
        // tried to build an array, will ask you in class how to build a library that can recall
        int a = 65;
        int b = 66;
        int c = 67;
        int d = 68;
        int e = 69;
        int f = 70;
        int g = 71;
        int h = 72;
        int i = 73;
        int j = 74;
        int k = 75;
        int l = 76;
        int m = 77;
        int n = 78;
        int o = 79;
        int p = 80;
        int q = 81;
        int r = 82;
        int s = 83;
        int t = 84;
        int u = 85;
        int v = 86;
        int w = 87;
        int x = 88;
        int y = 89;
        int z = 90;

        // program
        if (ASCII == a || ASCII == b || ASCII == c || ASCII == a + 32 || ASCII == b + 32 || ASCII == c + 32) {
            System.out.println("2"); // a b c
        } else if (ASCII == d || ASCII == e || ASCII == f /* lowercase */ || ASCII == d + 32 || ASCII == e + 32 || ASCII == f + 32) {
            System.out.println("3"); // d e f
        } else if (ASCII == g || ASCII == h || ASCII == i /* lowercase */ || ASCII == g + 32 || ASCII == h + 32 || ASCII == i + 32) {
            System.out.println("4"); // g h i
        } else if (ASCII == j || ASCII == k || ASCII == l /* lowercase */ || ASCII == j + 32 || ASCII == k + 32 || ASCII == l + 32) {
            System.out.println("5"); // j k l
        } else if (ASCII == m || ASCII == n || ASCII == o /* lowercase */ || ASCII == m + 32 || ASCII == n + 32 || ASCII == o + 32) {
            System.out.println("6"); // m n o
        } else if (ASCII == p || ASCII == q || ASCII == r || ASCII == s /* lowercase */ || ASCII == p + 32 || ASCII == q + 32 || ASCII == r + 32 || ASCII == s + 32) {
            System.out.println("7"); // p q r s
        } else if (ASCII == t || ASCII == u || ASCII == v /* lowercase */ || ASCII == t + 32 || ASCII == u + 32 || ASCII == v + 32) {
            System.out.println("8"); // t u v
        } else if (ASCII == w || ASCII == x || ASCII == y || ASCII == z /* lowercase */ || ASCII == w + 32 || ASCII == x + 32 || ASCII == y + 32 || ASCII == z + 32) {
            System.out.println("9"); // w x y z
        } else {
            System.out.println(letterOutput + " is an invalid input");
        }

        //System.out.println(ASCII); // debugger 5000
    }
}

