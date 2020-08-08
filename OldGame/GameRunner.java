/**
*
*Description: a program to run the dungeon game.
*
*@author: Daniel Jaeger
*@version 11/8/17
*/

import java.util.Scanner;
import java.util.Random;


public class GameRunner{

	private static Scanner getInput = new Scanner(System.in);
	private static Dungeon dungeon = new Dungeon();
	private static Room currentRoom = dungeon.getRoom();
	private static String direction;
	private static boolean runGame;
	private static int combatChoice;

	//declare monster variables
	private static String monster_name;
	private static int monster_type;
	private static int monster_health;
	private static int monster_attack;


	//create a method to print the movement instructions 
	public static void instructions(){
		System.out.println("");
		System.out.println("Game Instructions:");		
		System.out.println("");
		System.out.println("Press n to move North.");
		System.out.println("Press s to move South.");
		System.out.println("Press e to move East.");
		System.out.println("Press w to move West.");
		System.out.println("Press q to quit.");
		System.out.println("");
	} //end instructions method

	//create random monster generator method
	public static void randomMonster()
	{
		Random randomMonster = new Random(); 
		monster_type = randomMonster.nextInt(11);
		if (monster_type == 1) 
		{
			monster_name = "Ghost";
			monster_health = 75;
			monster_attack = 8;
			System.out.println("");
			System.out.printf("You have encountered a %s!\n", monster_name);
			System.out.println("");
		}
		if (monster_type == 2) 
		{
			monster_name = "Ghoul";
			System.out.println("");
			System.out.printf("You have encountered a %s!\n", monster_name);
			System.out.println("");
		}
		if (monster_type == 3) 
		{
			monster_name = "Goblin";
			monster_health = 150;
			monster_attack = 15;
			System.out.println("");
			System.out.printf("Your have encountered a %s!\n", monster_name);
			System.out.println("");
		}
	}//end monster generator method

	public static void randomMonster2() { 
		Random randomMonster2 = new Random();
		monster_type = randomMonster2.nextInt(11);
		if (monster_type == 1) {
				monster_name = "Mr. Nobody, the Butler.";
				System.out.println("");
				System.out.printf("You have encountered %s\n", monster_name);
				System.out.println("");
				System.out.printf("\"Don't be alarmed, sir.\nI'm merely Mr. Nobody, the humble butler,\nmeaning that I'm the head of the kitchen and dining room.\nI like to keep everything...tidy.\"\n");
				System.out.println("");
				System.out.printf("Your confusion turns to dread as\nMr. Nobody begins to open his mouth,\nwider and wider,\nhis gaping maw displaying an impossible darkness.\nIt feels almost as if you're being sucked inside...\n");
				System.out.println("");
				System.out.println("Game Over. Thank you for playing.");
				System.out.println("");
			}
	}	

	//create a combat method 
	public static int combat()
	{
		//create new scanner to caputer user input
		Scanner combat = new Scanner(System.in);

    	//initialize variables 
    	//int combatChoice = 0;

    	//promt user to enter an integer
		System.out.println("What would you like to do?");
		//Print option 1: Sword Attack
		System.out.println("1. Attack.");
		//Print option 2: Cast Spell
		System.out.println("2. Run away.");

		//grab user input
		combatChoice = combat.nextInt();

		//if player chose option 1 (check with equality operator)
		if(combatChoice == 1)
			{	
				System.out.printf("You defeated the %s.\n", monster_name);
				System.out.println("You now proceed to the next room.");
			}//end attack choice 1 
			
		else if(combatChoice == 2)
			{
				System.out.println("");
				System.out.printf("You try to run away, but the %s blocks your path.\nYou see a blur of movement, and then feel a sharp pain in your neck.\nYour vision quickly fades to black.\n", monster_name);
				System.out.println("");
				System.out.println("Game Over. Thank you for playing.");
				System.out.println("");
			}

		return combatChoice;
	}

	public static void move() {
		boolean runGame = true;
		while(runGame) {
			System.out.println(currentRoom);
			System.out.println("");
			System.out.println("Which way would you like to go?");

			direction = getInput.nextLine();
			direction = direction.toLowerCase();
			
			if ((direction.equals("n")) && (currentRoom.getRoomToNorth() != null)) {
				currentRoom = currentRoom.getRoomToNorth();
				
				if(currentRoom == dungeon.exitConservatory) {
					System.out.println(dungeon.exitConservatory);
					runGame = false;
				}
				else if(currentRoom != dungeon.exitConservatory) {
					randomMonster();
						if (monster_type == 1 || monster_type == 2 || monster_type == 3) {
						combat();
							if(combatChoice == 2){
							runGame = false;
							}		
						}
						else {	
						randomMonster2();
							if(monster_type == 1){
							runGame = false;
						}
						}		
				}
			}

			else if((direction.equals("e")) && (currentRoom.getRoomToEast() != null)) {
				currentRoom = currentRoom.getRoomToEast();
				
				if(currentRoom == dungeon.exitConservatory) {
					System.out.println(dungeon.exitConservatory);
					runGame = false;
				}
				else if(currentRoom != dungeon.exitConservatory) {
					randomMonster();
						if (monster_type == 1 || monster_type == 2 || monster_type == 3) {
							combat();
								if(combatChoice == 2){
								runGame = false;
							}
						}
						else {	
							randomMonster2();
								if (monster_type == 1)
								runGame = false;
						}		
				}
			}

			else if((direction.equals("s")) && (currentRoom.getRoomToSouth() != null)) {
				currentRoom = currentRoom.getRoomToSouth();
				
				if(currentRoom == dungeon.exitFoyer) {
					System.out.println(dungeon.exitFoyer);
					runGame = false;
				}
				else if(currentRoom != dungeon.exitFoyer) {
					randomMonster();
						if (monster_type == 1 || monster_type == 2 || monster_type == 3) {
						combat();
							if(combatChoice == 2){
							runGame = false;
						}
						}
						else {	
						randomMonster2();
							if (monster_type == 1)
							runGame = false;
						}		
				}
			}

			else if((direction.equals("w")) && (currentRoom.getRoomToWest() != null)) {
				currentRoom = currentRoom.getRoomToWest();

				if(currentRoom == dungeon.exitConservatory) {
					System.out.println(dungeon.exitConservatory);
					runGame = false;
				}
				else if(currentRoom != dungeon.exitConservatory) {
					randomMonster();
						if (monster_type == 1 || monster_type == 2 || monster_type == 3) {
						combat();
							if(combatChoice == 2){
							runGame = false;
						}
						}
						else {	
						randomMonster2();
							if (monster_type == 1)
							runGame = false;
						}		
				}
			}

			else if(direction.equals("q")) {
				runGame = false;
			}

			else {
				System.out.println("You can't go that way.");
			}
		}

	} //end move method

	public static void main (String[] args){
		instructions();
		move();		
	} //end main 
} //end GameRunner class