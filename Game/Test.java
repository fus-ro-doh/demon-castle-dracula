/**
* Overview:	a file for testing concepts
*
* @author:  Daniel W. Jaeger
* @version: 1.1
* Date:     8/9/20
**/

import java.util.*;

public class Test{

	private static Random randNum = new Random(); 

	private static Room livingRoom = new Room("living room", "this is a living room.");
	private static Room kitchen = new Room("kitchen", "this is a kitchen.");
	private static Room bedroom = new Room("bedroom", "this is a bedroom.");
	private static Dice dice = new Dice();

	// private static List<Room> house;
	private static ManorHouse manor = new ManorHouse();
	private static List<Room> house = manor.createList();
	private static Hashtable<Integer, Room> table = manor.createHashtable();
	private static int i;
	private static int randomRoom;
	private static List<Integer> enteredRooms = new ArrayList<>();
	private static List<Integer> randomNumbers = new ArrayList<>();
	private static Room room; 
	private static boolean run;
<<<<<<< HEAD
	private static int sum = 0;
	private static float avg = 0.0f;
	private static int roll = 0;
=======
	private static int diceRoll;

	private static DoomClock doomClock = new DoomClock();

	private static Scanner input = new Scanner(System.in);
	private static String userInput;
	private static Player player;
	
	private static Swarms swarm = new Swarms();
	private static List<Minion> minions = swarm.createList();
	private static Hashtable<Integer, Minion> minionTable = swarm.createHashtable();
	private static Minion minion;
>>>>>>> story#1


	private static int randomNumber(){
		return randNum.nextInt(8);
	}

	protected static int dice(){
		return randNum.nextInt(6) + 1;
	}

	// protected static int randomNumberCombat(){
	// 	return randNum.nextInt(11) + 2;
	// } 
	
<<<<<<< HEAD
	protected static int twoDSix(){
		return (dice() + dice());
	}

	// protected static List<Integer> testRandomNumberCombat(){
	// 	for (i = 0; i < 1000; i++){
	// 		randomNumbers.add(randomNumberCombat());
	// 		// System.out.println(randomNumberCombat());
	// 	}
	// 	System.out.println(randomNumbers);
	// 	return randomNumbers;
	// }

	protected static List<Integer> testTwoDSix(){
		for (i = 0; i < 1000; i++){
			randomNumbers.add(twoDSix());
			// System.out.println(randomNumberCombat());
		}
		System.out.println(randomNumbers);
		return randomNumbers;
	}

	protected static void averageRandomNumbers(List<Integer> list){
		list = list;
		for (i = 0; i < list.size(); i++){
			sum = sum + list.get(i);
		}

		System.out.println("Sum: " + sum);
		System.out.println("n: " + list.size());

		avg = (float)sum / list.size();
		System.out.println("Average = sum / n ");
		System.out.println("Average:  " + avg);

		containsNumber(list);
	}

	protected static void containsNumber(List<Integer> list){
		for (i = 2; i < 13; i++){
			System.out.println("Frequency of " + i + ": " + Collections.frequency(list, i));
		}
=======
	public static void combat(){
		System.out.println("Oh, no! You've encounterd some of Dracula's minions!");
		diceRoll = randNum.nextInt(minions.size());
		minion = minionTable.get(diceRoll);
		System.out.println(minion.getDescription());
		System.out.println("You must defeat them before you can move on.");
		System.out.println();
		run = true;
		while(run){
			System.out.println("Type \"attack\" to attack.");
			userInput = input.nextLine();
			userInput.toLowerCase();
			if(userInput.equals("attack")){
				diceRoll = dice.twoDSix();
				if (diceRoll < 7){
					System.out.println();
					player.loseHearts(player.getHearts());
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
				else if (diceRoll < 10){
					System.out.println();
					player.loseHearts(player.getHearts());
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
		}
	}

	public static void rest(){
		player.refillHearts();
		doomClock.increment();
>>>>>>> story#1
	}

	public static void main(String[] args){
		System.out.println();
		System.out.print("Please name your character: ");
		player = new Player(input.nextLine());
		System.out.println("Good luck, " + player.getName() + ".");
		System.out.println();
		
		combat();

		System.out.println("Would you like to rest and heal?");
		System.out.println("Type \"rest\" to rest and heal, type \"leave\" to enter next area.");
		if(input.nextLine() == "rest"){
			rest();
		}
		else if(input.nextLine() == "leave"){
		}
		else{
			System.out.println("input not recognized.");
		}

		run = true;
		diceRoll = 0;
		// time = 0;
		while(run){
			// time = doomClock.increment();
			System.out.println("The Clock sits at " + doomClock.getTime() + ".");
			if(doomClock.getTime() < 4){
				diceRoll = dice.twoDSix();
				System.out.println("You rolled " + diceRoll + ".");
				if(diceRoll < 7){
					System.out.println("You rest and recover, but the Doom Clock ticks forward twice.");
					doomClock.increment();
					doomClock.increment();
				} 
				else if(diceRoll < 10){
					System.out.println("You rest and recover, but the Doom Clock ticks forward.");
					doomClock.increment();
				}
				else{
					System.out.println("You rest and recover.");
					System.out.println("The Doom Clock doesn't move.");
					System.out.println("You count your blessings and move on.");
					System.out.println();
					continue;
				}
			
				if (doomClock.getTime() >= 4){
					System.out.println();
					System.out.println("Oh, no. Oh, God, no...");
					System.out.println("The Doom Clock ticks over to midnight.");
					System.out.println("Dracula appears. The ritual is complete.");
					System.out.println("Now we enter 1000 years of darkness.");
					System.out.println("You have failed.");
					System.out.println();
					System.out.println("Thank you for playing Demon Castle Dracula.");
					System.out.println();

					run = false;
					System.exit(0);
				}
				System.out.println("The Clock sits at " + doomClock.getTime());
				// doomClock.getTime();
				System.out.println("Take care.");
				System.out.println();
				continue;
				//doomClock.getTime();
				// System.out.println("Take care.");
				// System.out.println();
				// continue;
			}
		}//end while
		
		// System.out.println(randomNumber());

		// String name = livingRoom.getName();
		// System.out.println("name: " + name);
		// System.out.println("name: " + kitchen.getName());

		// house = Arrays.asList(livingRoom, kitchen, bedroom);
		// System.out.println("List: " + house.toString());
		// System.out.print("Items in List \"house\":");
		// for(i = 0; i < house.size(); i++){
		// 	System.out.print(" " + house.get(i).getName());
		// }

		// Map<Integer, Room> map = new HashMap<Integer, Room>();
		// map.put(0, livingRoom);
		// map.put(1, kitchen);
		// map.put(2, bedroom);
		
		// int i; 

		// for(i = 0; i < house.size(); i++){
		// 	map.put(i, house.get(i));
		// }


		// System.out.println();
		
		// for (Map.Entry<Integer, Room> me : map.entrySet()){
		// 	if (i == me.getKey()){
		// 		System.out.println(me.getValue());
		// 	}
		// }

		// System.out.println();
		// // Hashtable<Integer, Room> table = new Hashtable<Integer, Room>();
		// for(i = 0; i < house.size(); i++){
		// 	table.put(i, house.get(i));
		// }

		// // randomRoom = randomNumber();
		// // System.out.println("Random number is: " + randomRoom);
		// // Room room = table.get(randomRoom);
		// // if (room != null){
		// // 	System.out.println("Random room is: " + room.getName());
		// // }
		
		// // System.out.println();

		// run = true;
		// while(run){
		// 	randomRoom = randomNumber();
		// 	room = table.get(randomRoom);
		// 	if (enteredRooms.contains(randomRoom)){
		// 		System.out.println("You try to reenter the " + room.getName() + ", but that's not allowed.");
		// 		System.out.println("You must now enter The Tower.");
		// 		System.out.println("Goodbye!");
		// 		System.out.println();
		// 		run = false;
		// 	}
		// 	else{	
		// 		System.out.println("You enter the " + room.getName());
		// 		enteredRooms.add(randomRoom);
		// 	}
		// }
		
		// averageRandomNumbers(testRandomNumberCombat());
		averageRandomNumbers(testTwoDSix());



		// System.out.println("Random number is: " + randomRoom);
		// room = table.get(randomRoom);
		// if (room != null){
		// 	System.out.println("Random room is: " + room.getName());
		// }
		
		// System.out.println();

		// System.out.println("Map Elements");
		// System.out.println("\t" + map);
	}//end main
}//end class