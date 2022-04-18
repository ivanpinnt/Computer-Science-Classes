package csc.currentproject;

// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Apr 17, 2022

// Warrior Objects

import java.util.Random;
public class WarriorFred {

	// LIBRARY
	private String nickName = "unknown";
	private int lifeForce = 10;
	private int damage = 0;
	// --
	String[] armory = {"Exploding Pumpkin", "Candy Corn", "Paper Bag"};

	// LIFE
	public void reSpawn() {
		lifeForce = 10;
	}
	// --
	public void takeDamage(int n) {
		damage += n;
		System.out.println(nickName + " is attacked and takes " + damage + " units of damage");
		if (damage >= 10) {
			lifeForce--;
			damage = 0;
		}
	}
	// --
	public int getDamage() {
		return damage;
	}
	// --
	public int getLifeForce() {
		return lifeForce;
	}

	// NAME
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	// --
	public String getNickName() {
		return nickName;
	}

	// REACTIONS
	public void reaction() {
		Random r = new Random();
		String[] sound = {"OW!", "Wham!", "POW!", "Boffo!!", "KaPow!", "That one hurt!"};
		System.out.println("	" + sound[r.nextInt(sound.length)]);
	}

	// GAME OVER
	public boolean isDead() {
		if (lifeForce <= 0) return true;
		else return false;
	}
	// --
	public boolean isAlive() {
		if (lifeForce > 0) return true;
		else return false;
	}

	// INFORMATION OF WARRIORS OBJECTS
	public void printCurrentStatus() {
		System.out.println(nickName + " status (health=" + getLifeForce() + ", damage=" + damage + ")");
	}
	// --
	public void printInfo()
	{
		System.out.println("Nick Name:" + getNickName());
		System.out.println("Life Force:" + getLifeForce());
		System.out.println("Damage:" + getDamage());
		// Not quite sure what to use with this?
		/*
		for(int i=0;i<armory.length;i++)
			System.out.println("Armory:" + this.armory[i]);

		 */
		System.out.println();
	}
}