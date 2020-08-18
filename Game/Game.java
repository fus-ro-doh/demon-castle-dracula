/**
* Overview:	The "game". This file runs the game, allowing a user to "play" Demon Castle Dracula.
*
* @author:  Daniel W. Jaeger
* @version: 1.1
* Date:     8/9/20
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
	private static DoomClock clock = new DoomClock();
	private static Player player;

	private static Room currentRoom = castle.getRoom();
	private static Room route;

	private static String routeChoice;
	// private static String input;
	private static String input;

	private static boolean runGame;
	private static boolean room;
	private static boolean run;

	// private static int combatChoice;
	private static Random random = new Random();

	private static ManorHouse manorHouse = new ManorHouse();
	private static List<Room> manorRoomList = manorHouse.createList();
	private static Hashtable<Integer, Room> table = manorHouse.createHashtable();

	private static String roomName;
	private static int randomNumber;

	private static List<Integer> enteredRooms = new ArrayList<>();

	private static Dice dice = new Dice();
	private static int diceSum;

	private static Minion minion;
	private static Swarms swarms = new Swarms();
	private static List<Minion> swarmsList = swarms.createList();
	private static Hashtable<Integer, Minion> swarmsTable = swarms.createHashtable();

	//create a method to print the movement instructions 
	private static void instructions(){
		System.out.println();
		System.out.println("Game Instructions:");		
		System.out.println();
		System.out.println("Navigate your way through Dracula's Castle.");
		System.out.println("Destroy the demon, if you can. ");
		System.out.println();			
		System.out.println("If at any point you can no longer continue, press q to quit.");
		System.out.println();
		// System.out.println("Good luck...");
		// System.out.println();
	} //end instructions method

	


	// private static void combat(Minion minion1, Minion minion2){
	// 	System.out.println("You must defeat both of Dracula's minions before you can continue.");
	// 	System.out.println("Type \"attack\" when you're ready.");
	// 	System.out.println();
	// 	input = getInput.nextLine();
	// 	input = input.toLowerCase();

	// 	if (input.equals("attack")){
	// 		runGame = true;
	// 		while(runGame){
	// 			diceSum = dice.twoDSixPlusOne();
	// 			if (diceSum < 7){
	// 				player.loseHearts(player.getHearts());
	// 				continue;
	// 			}
	// 			else if (diceSum < 10){
	// 				System.out.println("You defeated the " + minion1.getName() + ", but you took damage doing so.");
	// 				System.out.println("You have " + player.getHearts() + " remaining.");
	// 				runGame = false;
	// 			}
	// 			else{
	// 				System.out.println("You defeated the " + minion1.getName() + ", and you took damage no doing!");
	// 				System.out.println("You have " + player.getHearts() + " remaining.");
	// 				runGame = false;
	// 			}
	// 		}
	// 	}
	// }

	private static void pickRoute(){
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
			else if (routeChoice.equals("throne")){
				currentRoom = castle.getThrone();
				runGame = false;
			}
			else{
				System.out.println("Not a valid choice.");
			}
		}
	}

	private static void combat(){
		// runGame = true;
		// while(runGame){
			diceSum = dice.twoDSixPlusOne();
			// if (diceSum < 7){
			// 	randomNumber = random.nextInt(swarmsList.size());
			// 	minion = swarmsList.get(randomNumber);
			// 	System.out.println(minion.getDescription());
			// 	System.out.println("You must defeat them before you can move on.");
			// 	System.out.println();

			// 	run = true;
			// 	while(run){
			// 		System.out.println("Type \"attack\" to attack.");
			// 		input = getInput.nextLine();
			// 		input.toLowerCase();
			// 		if(input.equals("attack")){
			// 			diceSum = dice.twoDSixPlusOne();
			// 			if (diceSum < 7){
			// 				System.out.println();
			// 				player.loseHearts(player.getHearts());
			// 				System.out.println("Your attack failed, and you lost heart.");
			// 				System.out.println("Hearts: " + player.getHearts());
			// 				if (player.getHearts() <= 0){
			// 					System.out.println("You died.");
			// 					System.exit(0);
			// 				}
			// 				else{
			// 					continue;
			// 				}
			// 			}
			// 			else if (diceSum < 10){
			// 				System.out.println();
			// 				player.loseHearts(player.getHearts());
			// 				System.out.println("You defeated the minions, but you lost some heart in the process.");
			// 				System.out.println("Hearts: " + player.getHearts());
			// 				System.out.println();
			// 				run = false;
			// 				if (player.getHearts() <= 0){
			// 					System.out.println("You defeated Dracula's minions, but your wounds were too great.");
			// 					System.out.println("You died a hero.");
			// 					System.out.println("Good night, sweet prince.");
			// 					System.exit(0);
			// 				}
			// 				else{
			// 					continue;
			// 				}
			// 			}
			// 			else{
			// 				System.out.println();
			// 				System.out.println("You defeated Dracula's minions! Huzzah!");
			// 				System.out.println();
			// 				run = false;
			// 			}
			// 		}
			// 	}
			// }
			if (diceSum < 10){
				randomNumber = random.nextInt(swarmsList.size());
				minion = swarmsList.get(randomNumber);
				System.out.println(minion.getDescription());
				System.out.println("You must defeat them before you can move on.");
				System.out.println();

				run = true;
				while(run){
					System.out.println("Type \"attack\" to attack.");
					input = getInput.nextLine();
					input.toLowerCase();
					if (input.equals("attack")){
						diceSum = dice.twoDSixPlusOne();
						if (diceSum < 7){
							System.out.println();
							player.loseHearts();
							System.out.println("Your attack failed, and you lost heart.");
							System.out.println("Hearts: " + player.getHearts());
							if (player.getHearts() <= 0){
								System.out.println("You died.");
								System.exit(0);
							}
							else{
								continue;
							}
						}
						else if (diceSum < 10){
							System.out.println();
							player.loseHearts();
							System.out.println("You defeated the minions, but you lost some heart in the process.");
							System.out.println("Hearts: " + player.getHearts());
							System.out.println();
							run = false;
							if (player.getHearts() <= 0){
								System.out.println("You defeated Dracula's minions, but your wounds were too great.");
								System.out.println("You died a hero.");
								System.out.println("Good night, sweet prince.");
								System.exit(0);
							}
							else{
								continue;
							}
						}
						else{
							System.out.println();
							System.out.println("You defeated Dracula's minions! Huzzah!");
							System.out.println();
							run = false;
						}
					}
					else if (input.equals("q")){
							System.exit(0);
					}
				}
			}
			else{
				System.out.println();
				System.out.println("You managed to enter this area undetected! (huzzah)");
				System.out.println();
				// runGame = false;
			}		
		// }
	}//end combat

	private static void postCombatChoice(){
		run = true;
		while(run){
			//turn this section into it's own method, perhaps?
			//need to find ways to stop repeating code (as much as possible, anyway)
			//System.out.println("Entered second while loop.");

			System.out.println("What would you like to do now?");
			System.out.println("Would you like to LEAVE or REST?");

			input = getInput.nextLine();
			input = input.toLowerCase();
			
			if (input.equals("leave")){

				// System.out.println("typed leave");
				currentRoom = currentRoom.getExit();
				
				if(currentRoom.getName() == "Manor House"){
					System.out.println(currentRoom);
					runGame = false;
					run = false;
				}
				run = false;
			}
			else if (input.equals("rest")){
				System.out.println("typed rest");
				rest();
				if (clock.getTime() >= 4){
					System.out.println();
					//make this paragraph an enum in DoomClock
					System.out.println("Oh, no. Oh, God, no...");
					System.out.println("The Doom Clock ticks over to midnight.");
					System.out.println("Dracula appears. The ritual is complete.");
					System.out.println("Now we enter 1000 years of darkness.");
					System.out.println("You have failed.");
					System.out.println();
					System.out.println("Thank you for playing Demon Castle Dracula.");
					System.out.println();

					// runGame = false;
					System.exit(0);
				}
			}
			else if (input.equals("q")) {
				// run = false
				// runGame = false;
				System.exit(0);					
			}	
			else{
				System.out.println("Sorry. Invalid input. Try again.");
				System.out.println();
			}
		}
	}

	private static void postFightChoiceManor(){
		run = true;
		while(run){
			// System.out.println("Entered second while loop.");

			System.out.println("What would you like to do now?");
			System.out.println("Would you like to LEAVE or REST?");

			input = getInput.nextLine();
			input = input.toLowerCase();
			
			if (input.equals("leave")){
				// System.out.println("typed leave");
				run = false;
			}
			else if (input.equals("rest")){
				// System.out.println("typed rest");
				rest();
				if (clock.getTime() >= 4){
					System.out.println();
					//make this an enum in DoomClock
					System.out.println("Oh, no. Oh, God, no...");
					System.out.println("The Doom Clock ticks over to midnight.");
					System.out.println("Dracula appears. The ritual is complete.");
					System.out.println("Now we enter 1000 years of darkness.");
					System.out.println("You have failed.");
					System.out.println();
					System.out.println("Thank you for playing Demon Castle Dracula.");
					System.out.println();

					// runGame = false;
					System.exit(0);
				}
			}
			else if (input.equals("q")) {
				// run = false
				// runGame = false;
				System.exit(0);					
			}	
			else{
				System.out.println("Sorry. Invalid input. Try again.");
				System.out.println();
			}
		}
	}

	private static void rest(){
		player.refillHearts();
		clock.increment();
		System.out.println("Player hearts have been reset to " + player.getHearts() + ".");
		System.out.println("You have rested and recovered, but the Doom Clock ticks forward.");
		System.out.println("The Doom Clock sits at " + clock.getTime() + ".");
	}

	private static void approach(){
		if(currentRoom.getName() == "Throne Room"){
			return;
		}
		runGame = true;
		while(runGame){
			System.out.println("Entered first while loop.");
			System.out.println(currentRoom);
			// System.out.println();

			combat();
			postCombatChoice();
			// run = true;

			// while(run){
			// 	System.out.println("Entered second while loop.");

			// 	// System.out.println("Entered while loop");
			// 	// currentRoom = currentRoom.getExit();

			// 	System.out.println("What would you like to do now?");
			// 	System.out.println("Would you like to LEAVE or REST?");

			// 	input = getInput.nextLine();
			// 	input = input.toLowerCase();
			// 	// System.out.println(input);
			// 		// run = false;

			// 	if (input.equals("leave")){
			// 		System.out.println("typed leave");
			// 		currentRoom = currentRoom.getExit();
					
			// 		if(currentRoom.getName() == "Manor House"){
			// 			System.out.println(currentRoom);
			// 			runGame = false;
			// 			run = false;
			// 		}
			// 		run = false;
			// 	}
			// 	else if (input.equals("rest")){
			// 		System.out.println("typed rest");
			// 		rest();
			// 		if (clock.getTime() >= 4){
			// 			System.out.println();
			// 			System.out.println("Oh, no. Oh, God, no...");
			// 			System.out.println("The Doom Clock ticks over to midnight.");
			// 			System.out.println("Dracula appears. The ritual is complete.");
			// 			System.out.println("Now we enter 1000 years of darkness.");
			// 			System.out.println("You have failed.");
			// 			System.out.println();
			// 			System.out.println("Thank you for playing Demon Castle Dracula.");
			// 			System.out.println();

			// 			// runGame = false;
			// 			System.exit(0);
			// 		}
			// 	}
			// 	else if (input.equals("q")) {
			// 		// run = false
			// 		// runGame = false;
			// 		System.exit(0);					
			// 	}	
			// 	else{
			// 		System.out.println("Sorry. Invalid input. Try again.");
			// 		System.out.println();
			// 	}
			// }
		}
	} //end move method

	private static void manor(){
		if(currentRoom.getName() == "Throne Room"){
			return;
		}
		runGame = true;
		// room = true;
		while(runGame){
			randomNumber = random.nextInt(8);
			currentRoom = table.get(randomNumber);
			if (enteredRooms.contains(randomNumber)){
				currentRoom = castle.getTower();
				System.out.println();
				System.out.println("You discovered The Tower.");
				System.out.println("You're in the endgame now.");
				System.out.println();
				runGame = false;
				break;
				// System.exit(0);
			}
			else{	
				System.out.println(currentRoom);
				enteredRooms.add(randomNumber);
				combat();
				postFightChoiceManor();

			}
			// room = true;
			// while(room){
			// 	if (currentRoom != null){
			// 		System.out.println("");
			// 		System.out.println("Are you ready to leave?");
			// 		System.out.println("Type \"y\" or \"n\"");

			// 		input = getInput.nextLine();
			// 		input = input.toLowerCase();

			// 		if (input.equals("y") || input.equals("yes")) {
			// 			room = false;
			// 		}
			// 		else if (input.equals("n") || input.equals("no")){
			// 			continue;
			// 		}
			// 		else if(input.equals("q")) {
			// 			System.exit(0);
			// 			runGame = false;
			// 			break;
			// 		}
			// 		else {
			// 			System.out.println("You can't go that way.");
			// 		}
			// 	}
			// }
		}
	}

	private static void ascent(){
		runGame = true;
		while(runGame) {
			System.out.println(currentRoom);
			if (currentRoom.getName() != "Throne Room"){
				combat();
				postCombatChoice();
				System.out.println("");
			}
			else{
				Dracula dracula = new Dracula();
				dracula.finalConfrontation(player);
			}
			
			// System.out.println("Are you ready to leave?");
			// System.out.println("Type \"y\" or \"n\"");

			// input = getInput.nextLine();
			// input = input.toLowerCase();
			
			// if (input.equals("y") || input.equals("yes")) {
			// 	currentRoom = currentRoom.getExit();
			// 	if(currentRoom.getName() == "Manor House"){
			// 		System.out.println(currentRoom);
			// 		runGame = false;
			// 	}
			// }
			// else if (input.equals("n") || input.equals("no")){
			// 	continue;
			// }
			// else if(input.equals("q")) {
			// 	runGame = false;
			// }
			// else {
			// 	System.out.println("You can't go that way.");
			// }
		}
	} 

	public static void main (String[] args){
		System.out.println();
		System.out.print("Please name your character: ");
		player = new Player(getInput.nextLine());
		System.out.println("Good luck, " + player.getName() + ".");
		System.out.println();
		instructions();
		pickRoute();
		approach();		
		manor();
		ascent();
	} //end main 
} //end GameRunner class