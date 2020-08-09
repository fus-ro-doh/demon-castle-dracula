/**
* Overview:	The "game". This file runs the game, allowing a user to "play" Demon Castle Dracula.
*
* @author:  Daniel W. Jaeger
* @version: 1.0
* Date:     8/8/20
**/

import java.util.Scanner;
import java.util.Random;
import java.util.Hashtable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;



public class Game{

	private static Scanner getInput = new Scanner(System.in);
	private static Castle castle = new Castle();
	private static Room currentRoom = castle.getRoom();
	private static Room route;
	private static String routeChoice;
	private static String direction;
	private static boolean runGame;
	private static boolean room;
	private static int combatChoice;
	private static Random random = new Random();
	private static ManorHouse manorHouse = new ManorHouse();
	private static List<Room> manorRoomList = manorHouse.createList();
	private static Hashtable<Integer, Room> table = manorHouse.createHashtable();
	private static String roomName;
	private static int randomNumber;
	private static List<Integer> enteredRooms = new ArrayList<>();


	//declare monster variables
	// private static String monster_name;
	// private static int monster_type;
	// private static int monster_health;
	// private static int monster_attack;


	//create a method to print the movement instructions 
	public static void instructions(){
		System.out.println("");
		System.out.println("Game Instructions:");		
		System.out.println("");
		System.out.println("Navigate your way through Dracula's Castle.");
		System.out.println("Destroy the demon, if you can. ");
		System.out.println("");		
		// System.out.println("Start by choosing a route.");
		// System.out.println("Type \"cemetery\" to enter the Cemetery, or \"crypt\" to enter the Crypt.");
		// System.out.println("");
		// System.out.println("Once you've entered a room/area (after picking your route), simply follow the instructions.");
		// System.out.println("");	
		System.out.println("If at any point you can no longer continue, press q to quit.");
		System.out.println("");
		System.out.println("Good luck...");
		System.out.println("");
	} //end instructions method

	//create random monster generator method
	// public static void randomMonster()
	// {
	// 	Random randomMonster = new Random(); 
	// 	monster_type = randomMonster.nextInt(11);
	// 	if (monster_type == 1) 
	// 	{
	// 		monster_name = "Ghost";
	// 		monster_health = 75;
	// 		monster_attack = 8;
	// 		System.out.println("");
	// 		System.out.printf("You have encountered a %s!\n", monster_name);
	// 		System.out.println("");
	// 	}
	// 	if (monster_type == 2) 
	// 	{
	// 		monster_name = "Ghoul";
	// 		System.out.println("");
	// 		System.out.printf("You have encountered a %s!\n", monster_name);
	// 		System.out.println("");
	// 	}
	// 	if (monster_type == 3) 
	// 	{
	// 		monster_name = "Goblin";
	// 		monster_health = 150;
	// 		monster_attack = 15;
	// 		System.out.println("");
	// 		System.out.printf("Your have encountered a %s!\n", monster_name);
	// 		System.out.println("");
	// 	}
	// }//end monster generator method

	// public static void randomMonster2() { 
	// 	Random randomMonster2 = new Random();
	// 	monster_type = randomMonster2.nextInt(11);
	// 	if (monster_type == 1) {
	// 			monster_name = "Mr. Nobody, the Butler.";
	// 			System.out.println("");
	// 			System.out.printf("You have encountered %s\n", monster_name);
	// 			System.out.println("");
	// 			System.out.printf("\"Don't be alarmed, sir.\nI'm merely Mr. Nobody, the humble butler,\nmeaning that I'm the head of the kitchen and dining room.\nI like to keep everything...tidy.\"\n");
	// 			System.out.println("");
	// 			System.out.printf("Your confusion turns to dread as\nMr. Nobody begins to open his mouth,\nwider and wider,\nhis gaping maw displaying an impossible darkness.\nIt feels almost as if you're being sucked inside...\n");
	// 			System.out.println("");
	// 			System.out.println("Game Over. Thank you for playing.");
	// 			System.out.println("");
	// 		}
	// }	

	// //create a combat method 
	// public static int combat()
	// {
	// 	//create new scanner to caputer user input
	// 	Scanner combat = new Scanner(System.in);

 //    	//initialize variables 
 //    	//int combatChoice = 0;

 //    	//promt user to enter an integer
	// 	System.out.println("What would you like to do?");
	// 	//Print option 1: Sword Attack
	// 	System.out.println("1. Attack.");
	// 	//Print option 2: Cast Spell
	// 	System.out.println("2. Run away.");

	// 	//grab user input
	// 	combatChoice = combat.nextInt();

	// 	//if player chose option 1 (check with equality operator)
	// 	if(combatChoice == 1)
	// 		{	
	// 			System.out.printf("You defeated the %s.\n", monster_name);
	// 			System.out.println("You now proceed to the next room.");
	// 		}//end attack choice 1 
			
	// 	else if(combatChoice == 2)
	// 		{
	// 			System.out.println("");
	// 			System.out.printf("You try to run away, but the %s blocks your path.\nYou see a blur of movement, and then feel a sharp pain in your neck.\nYour vision quickly fades to black.\n", monster_name);
	// 			System.out.println("");
	// 			System.out.println("Game Over. Thank you for playing.");
	// 			System.out.println("");
	// 		}

	// 	return combatChoice;
	// }

	public static void pickRoute(){
		runGame = true;
		while(runGame){
			System.out.println(currentRoom);
			System.out.println("");
			System.out.println("Do you head into the Cemetery or descend into the Crypt?");
			System.out.println("");

			routeChoice = getInput.nextLine();
			routeChoice = routeChoice.toLowerCase();

			if (routeChoice.equals("cemetery")){
				currentRoom = currentRoom.getRouteA();
				runGame = false;
			}
			else if (routeChoice.equals("crypt")){
				currentRoom = currentRoom.getRouteB();
				runGame = false;
			}
			else if(routeChoice.equals("q")) {
				// runGame = false;
				System.exit(0);
			}
			else{
				System.out.println("Not a valid choice.");
			}
		}
	}

	public static void approach(){
		runGame = true;
		while(runGame) {
			System.out.println(currentRoom);
			System.out.println("");
			System.out.println("Are you ready to leave?");
			System.out.println("Type \"y\" or \"n\"");

			direction = getInput.nextLine();
			direction = direction.toLowerCase();
			
			if (direction.equals("y") || direction.equals("yes")) {
				currentRoom = currentRoom.getExit();
				if(currentRoom.getName() == "Manor House"){
					System.out.println(currentRoom);
					runGame = false;
				}
			}
			else if (direction.equals("n") || direction.equals("no")){
				continue;
			}
			else if(direction.equals("q")) {
				runGame = false;
			}
			else {
				System.out.println("You can't go that way.");
			}
		}

	} //end move method


	public static void manor(){
		runGame = true;
		room = true;
		while(runGame){
			randomNumber = random.nextInt(8);
			currentRoom = table.get(randomNumber);
			if (enteredRooms.contains(randomNumber)){
				System.out.println();
				System.out.println("You discovered The Tower.");
				System.out.println("You're in the endgame now");
				System.out.println();
				// runGame = false;
				System.exit(0);
			}
			else{	
				System.out.println(currentRoom);
				enteredRooms.add(randomNumber);
			}
			room = true;
			while(room){
				if (currentRoom != null){
					System.out.println("");
					System.out.println("Are you ready to leave?");
					System.out.println("Type \"y\" or \"n\"");

					direction = getInput.nextLine();
					direction = direction.toLowerCase();

					if (direction.equals("y") || direction.equals("yes")) {
						room = false;
					}
					else if (direction.equals("n") || direction.equals("no")){
						continue;
					}
					else if(direction.equals("q")) {
						runGame = false;
						break;
					}
					else {
						System.out.println("You can't go that way.");
					}
				}
			}
		}
	}

	// public static void manor(){
	// 	house = manor.createList();
	// 	for (int i = 0; i < house.size(); i++){
	// 		roomName = house.get(i).getName();
	// 		System.out.println(house);
	// 	}
	// }

	public static void main (String[] args){
		instructions();
		pickRoute();
		approach();		
		manor();
	} //end main 
} //end GameRunner class