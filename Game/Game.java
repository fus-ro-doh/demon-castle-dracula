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
	private static Room currentRoom = castle.getRoom();
	private static Room route;
	private static String routeChoice;
	private static String direction;
	private static boolean runGame;
	private static boolean room;
	// private static int combatChoice;
	private static Random random = new Random();
	private static ManorHouse manorHouse = new ManorHouse();
	private static List<Room> manorRoomList = manorHouse.createList();
	private static Hashtable<Integer, Room> table = manorHouse.createHashtable();
	private static String roomName;
	private static int randomNumber;
	private static List<Integer> enteredRooms = new ArrayList<>();


	//create a method to print the movement instructions 
	private static void instructions(){
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
			else{
				System.out.println("Not a valid choice.");
			}
		}
	}

	private static void approach(){
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

	private static void manor(){
		runGame = true;
		room = true;
		while(runGame){
			randomNumber = random.nextInt(8);
			currentRoom = table.get(randomNumber);
			if (enteredRooms.contains(randomNumber)){
				currentRoom = castle.getTower();
				System.out.println();
				System.out.println("You discovered The Tower.");
				System.out.println("You're in the endgame now");
				System.out.println();
				runGame = false;
				break;
				// System.exit(0);
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

	private static void ascent(){
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
	} 

	public static void main (String[] args){
		instructions();
		pickRoute();
		approach();		
		manor();
		ascent();
	} //end main 
} //end GameRunner class