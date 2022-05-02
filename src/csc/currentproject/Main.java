package csc.currentproject;

// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Apr 18, 2022

// 30 or Bust!
// A dice game with two players

import java.util.Random;
import java.util.Scanner;

public class Main
{




	////////////////////////////////////////////////////////////////////////////////////////
	// OBJECTS
	////////////////////////////////////////////////////////////////////////////////////////
	void Menu(){
		System.out.println("Do you wish to (1) Keep die 1, (2) Keep die 2, (3) Keep the total? (Respond with 1 or 2 or 3): ");
	}

	void selectMenu(int selection){
		if(selection == 1){

		}
	}

	////////////////////////////////////////////////////////////////////////////////////////
	// GAME
	////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args)
	{
		// SET-UP
		player player1 = new player();
		player player2 = new player();
		player[] players = {player1, player2};
		dice die = new dice();
		int p1Score = 0;
		int p2Score = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, what is the name of the first player? ");
		String name = sc.nextLine();
		player1.setUserName(name);
		player1.setScore(0);

		// PLAYER 2
		Scanner sc2 = new Scanner(System.in);
		System.out.println("What is the name of the second player? ");
		String name2 = sc2.nextLine();
		player2.setUserName(name2);
		player2.setScore(0);

		// PRINT NAMES & SCORE
		System.out.println("Welcome players " + player1.getUserName() + " and " + player2.getUserName());
		System.out.println("Here we go!");

	}
}