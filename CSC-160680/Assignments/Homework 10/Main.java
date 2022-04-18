package csc.currentproject;

// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Apr 17, 2022

// Warrior Objects

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// LIBRARY
		int round = 1;
		Random ran = new Random();
		int damage = 0;

		// SETUP
		System.out.println("*** Battle! ***   All warriors start with 10 units of health for 10 rounds");
		WarriorFred Archer = new WarriorFred();
		WarriorFred Mage = new WarriorFred();
		WarriorFred Healer = new WarriorFred();
		WarriorFred Tank = new WarriorFred();
		WarriorFred Rogue = new WarriorFred();
		WarriorFred[] warrior = {Archer, Mage, Healer, Tank, Rogue};
		System.out.println("");

		// SET NAME
		warrior[0].setNickName("Archer");
		warrior[1].setNickName("Mage");
		warrior[2].setNickName("Healer");
		warrior[3].setNickName("Tank");
		warrior[4].setNickName("Rogue");

		// GAME BUILDER
		for(int i = 0; i < 10; i ++) {
			System.out.println("Round " + i);
			for(int x = 0; x < 5; x++) {
				warrior[x].printCurrentStatus();
				warrior[x].takeDamage(ran.nextInt(10) + 1);
				warrior[x].reaction();
			}
		}

		// END GAME
		System.out.println("How did the Warriors fare?");
		for(int i = 0; i < 5; i++) {
			warrior[i].printCurrentStatus();
		}
	}
}
