package edu.arapahoe.csc160;

public class Main {

	public static void main(String[] args) {
	
		WarriorFred doug = new WarriorFred();
		
		System.out.println("Warrior is alive:" + doug.isAlive());
		
		doug.takeDamage(5);
		
		doug.reaction();
		
		doug.takeDamage(5);
				
		doug.reaction();
		
		doug.takeDamage(15);
				
		doug.reaction();

		System.out.println("Warrior is alive:" + doug.isAlive());

	}

}
