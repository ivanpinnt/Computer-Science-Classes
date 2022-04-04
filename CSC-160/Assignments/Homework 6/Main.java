package csc.a;

//
// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Mar 25, 2022
// create craps game
//


public class Main
{
    // create a roll dice foundation
    // this will be used for both die, can be rolled on COMMMMMMAND
    public static int rollDice()
    {
        int i = 0;
        i = (int)(Math.random() * 6) + 1;
        return i;
    }

    public static void main(String[] args)
    {
        // phase 1
        // both die need to be rolled to get a total number
        int dieOne = rollDice();
        int dieTwo = rollDice();
        int dieTotal = dieOne + dieTwo;

        // phase 2
        // the dieTotal now has to equal the craps numbers
        if (dieTotal == 2 || dieTotal == 3 || dieTotal == 12)
        {
            System.out.println("You rolled " + dieOne + " + " + dieTwo + " = " + dieTotal);
            System.out.println("You lose");
        }
        // phase 3
        // to win the game you must roll 7 or 11
        else if (dieTotal == 7 || dieTotal == 11)
        {
            System.out.println("You rolled " + dieOne + " + " + dieTwo + " = " + dieTotal);
            System.out.println("You win");
        }
        // phase 4
        // points established
        else if ( dieTotal == 4 || dieTotal == 5 || dieTotal == 6 || dieTotal == 8 || dieTotal == 9 || dieTotal == 10)
        {
            System.out.println("You rolled " + dieOne + " + " + dieTwo + " = " + dieTotal);
            System.out.println("point is " + dieTotal);

            // phase 5
            // rerun the same program once more!!
            while (true) {
                int dieOneAgain = rollDice();
                int dieTwoAgain = rollDice();
                int dieTotalAgain = dieOneAgain + dieTwoAgain;
                System.out.println("You rolled " + dieOneAgain + " + " + dieTwoAgain + " = " + dieTotalAgain);

                if (dieTotal == dieTotalAgain)
                {
                    System.out.println("point is " + dieTotal);
                    System.out.println("You win");
                    break;
                }
                // phase 6
                // rolled 7 failure
                if (dieTotalAgain == 7)
                {
                    System.out.println("You rolled " + dieOneAgain + " + " + dieTwoAgain + " = " + dieTotalAgain);
                    System.out.println("You lose");
                    break;
                }
            }
        }
    }
}