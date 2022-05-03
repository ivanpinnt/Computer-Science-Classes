package csc.currentproject;

import java.util.Random;

// DICE ROLL
public class Dice
{
    ////////////////////////////////////////////////////////////////////////////////////////
    // DICE ROLL
    ////////////////////////////////////////////////////////////////////////////////////////
    // Total sides of die
    private final static int totalSides = 6;

    // Method of rolling random numbers, from the die
    int rollDice()
    {
        int finalRoll;
        Random random = new Random();
        finalRoll = random.nextInt(totalSides) + 1;
        return finalRoll;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    // DICE STORAGE ( MAY USE )
    ////////////////////////////////////////////////////////////////////////////////////////
    // SET
    int die1, die2;
    void setDie1(int dice) {die1 += dice;}
    void setDie2(int dice) {die2 += dice;}
    // GRAB
    int getDie1(){return die1;}
    int getDie2(){return die2;}

}