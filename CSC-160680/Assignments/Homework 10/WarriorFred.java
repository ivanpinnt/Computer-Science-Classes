package edu.arapahoe.csc160;

import java.util.Random;
public class WarriorFred {

	private String nickName = "unknown";
	private int lifeForce = 10;
	private int damage = 0;
	
	String[] armory = {"Exploding Pumpkin", "Candy Corn", "Paper Bag"};
	
	public void reSpawn() {
		lifeForce = 10;
	}
	
	public void takeDamage(int n) {
		damage += n;
		if (damage >= 10) {
			lifeForce--;
			damage = 0;
		}
	}
	
	public void reaction() {
		Random r = new Random();
		String[] sound = {"OW!", "Wham!", "POW!", "Boffo!!", "KaPow!", "That one hurt!"};
		System.out.println(sound[r.nextInt(sound.length)]);
	}
	
	public boolean isDead() {
		if (lifeForce <= 0) return true;
		else return false;
	}
	
	public boolean isAlive() {
		if (lifeForce > 0) return true;
		else return false;
	}
	
}