package csc.currentproject;

// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// May 2, 2022

// 30 or Bust!
// A dice game with two players, first to 30 wins.
// If player goes above 30 the score for that player is reset to 0.

import java.util.Scanner;

public class Main
{
	////////////////////////////////////////////////////////////////////////////////////////
	// OBJECTS
	////////////////////////////////////////////////////////////////////////////////////////
	public static String RESET = "\u001B[0m";
	public static String R = "\u001B[31m";
	public static String G = "\u001B[32m";

	static void Menu()
	{
		System.out.print("("+G+"1"+RESET+") Keep die 1 | ("+G+"2"+RESET+") Keep die 2 | ("+G+"3"+RESET+") Keep the total: ");
	}

	static void Line()
	{
		System.out.println("---------------------------------------------");
	}

	static void boldLine()
	{
		System.out.println("********************************************");
	}

	////////////////////////////////////////////////////////////////////////////////////////
	// GAME
	////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////////////////////////
		// INTRODUCTION
		////////////////////////////////////////////////////////////////////////////////////////
		Player player1 = new Player();
		Player player2 = new Player();
		Dice die = new Dice();
		int p1Score = 0;
		int p2Score = 0;

		// INSTRUCTIONS
		System.out.println(
				"Dice Game: 30 or Bust! \n"+
				"Each player has two dice. The players take turns rolling their dice. When a player rolls both dice, the \n"+
				"player may keep the total of both dice or the face value of either die to add to that players total. A \n"+
				"player MUST select either the face value of one of the dice, or the total value of both dice. If a player's\n"+
				"score goes over 30, then that player's score is reset to zero and play continues until one player obtains a \n"+
				"score of exactly 30. The first player to score exactly 30 is the Winner."
				);
		Line();

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter name of first player: ");
		String name = sc.nextLine();
		player1.setUserName(name);
		player1.setP1Score(0);

		// PLAYER 2
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Please enter name of second player: ");
		String name2 = sc2.nextLine();
		player2.setUserName(name2);
		player2.setP2Score(0);

		// PRINT NAMES & SCORE
		System.out.println("Welcome players " +R+ player1.getUserName() +RESET+ " and " +R+ player2.getUserName() +RESET+ " to 30 or Bust!");
		System.out.println("Let the games begin!");

		////////////////////////////////////////////////////////////////////////////////////////
		// DICE ROLL
		////////////////////////////////////////////////////////////////////////////////////////
		while (true)
		{
			////////////////////////////////////////////////////////////////////////////////////////
			// CHECK
			////////////////////////////////////////////////////////////////////////////////////////
			if (player1.getP1Score() > 30)
			{
				System.out.println("Your total: " + player1.getP1Score() + ", your score is now reset to 0!");
				player1.resetP1();
			}
			else if (player2.getP2Score() > 30)
			{
				System.out.println("Your total: " + player2.getP2Score() + ", your score is now reset to 0!");
				player2.resetP2();
			}
			if (player1.getP1Score() == 30) {break;}
			else if (player2.getP2Score() == 30) {break;}

			//******************************************************************
			// PLAYER 1
			//******************************************************************
			boldLine();
			System.out.println("Player " +R+ player1.getUserName() +RESET+ ", it is your turn!");
			System.out.println("Your score: " + player1.getP1Score());
			Line();
			int dice1 = die.rollDice();
			int dice2 = die.rollDice();
			int totalDice = dice1 + dice2;
			System.out.println("("+G+"1"+RESET+")Die 1: " + dice1 + " | ("+G+"2"+RESET+")Die 2: " + dice2 + " | ("+G+"3"+RESET+")Total: " +totalDice);
			Line();
			Scanner sc3 = new Scanner(System.in);
			Menu();
			int choice = sc3.nextInt();
			while (true)
			{
				if (choice == 1) {
					player1.setP1Score(dice1);
					break;
				} else if (choice == 2) {
					player1.setP1Score(dice2);
					break;
				} else if (choice == 3) {
					player1.setP1Score(totalDice);
					break;
				}
				else
				{
					System.out.println("You did not choose the right number, your added score is 0.");
					break;
				}
			}
			if(player1.getP1Score() < 30)
			{
				System.out.println("Your total: " + player1.getP1Score());
			}

			////////////////////////////////////////////////////////////////////////////////////////
			// CHECK
			////////////////////////////////////////////////////////////////////////////////////////
			if (player1.getP1Score() > 30)
			{
				System.out.println("Your total: " + player1.getP1Score() + ", your score is now reset to 0!");
				player1.resetP1();
			}
			else if (player2.getP2Score() > 30)
			{
				System.out.println("Your total: " + player2.getP2Score() + ", your score is now reset to 0!");
				player2.resetP2();
			}
			if (player1.getP1Score() == 30) {break;}
			else if (player2.getP2Score() == 30) {break;}

			//******************************************************************
			// PLAYER 2
			//******************************************************************
			boldLine();
			if(player1.getP1Score() != 30)
			{
				System.out.println("Player " +R+ player2.getUserName() +RESET+ ", it is your turn!");
			}
			System.out.println("Your score: " + player2.getP2Score());
			Line();
			int dice3 = die.rollDice();
			int dice4 = die.rollDice();
			int totalDice2 = dice3 + dice4;
			System.out.println("("+G+"1"+RESET+")Die 1: " + dice3 + " | ("+G+"2"+RESET+")Die 2: " + dice4 + " | ("+G+"3"+RESET+")Total: " +totalDice2);
			Line();
			Scanner sc4 = new Scanner(System.in);
			Menu();
			int choice2 = sc4.nextInt();
			while (true)
			{
				if (choice2 == 1)
				{
					player2.setP2Score(dice3);
					break;
				} else if (choice2 == 2)
				{
					player2.setP2Score(dice4);
					break;
				} else if (choice2 == 3)
				{
					player2.setP2Score(totalDice2);
					break;
				}
				else
				{
					System.out.println("You did not choose the right number, your added score is 0.");
					break;
				}
			}
			if(player2.getP2Score() < 30)
			{
				System.out.println("Your total: " + player2.getP2Score());
			}


			////////////////////////////////////////////////////////////////////////////////////////
			// CHECK
			////////////////////////////////////////////////////////////////////////////////////////
			if (player1.getP1Score() > 30)
			{
				System.out.println("Your total: " + player1.getP1Score() + ", your score is now reset to 0!");
				player1.resetP1();
			}
			else if (player2.getP2Score() > 30)
			{
				System.out.println("Your total: " + player2.getP2Score() + ", your score is now reset to 0!");
				player2.resetP2();
			}
			if (player1.getP1Score() == 30) {break;}
			else if (player2.getP2Score() == 30) {break;}
		}

		////////////////////////////////////////////////////////////////////////////////////////
		// GAME FINISH
		////////////////////////////////////////////////////////////////////////////////////////
		if (player1.getP1Score() == 30)
		{
			System.out.println("Your total: 30! Congratulations " +R+ player1.getUserName() +RESET+ ", you WIN!! ");
		}
		else if (player2.getP2Score() == 30)
		{
			System.out.println("Your total: 30! Congratulations " +R+ player2.getUserName() +RESET+ ", you WIN!! ");
		}
	}
}