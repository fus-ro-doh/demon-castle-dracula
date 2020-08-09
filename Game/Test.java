/**
* Overview:	a file for testing concepts
*
* @author:  Daniel W. Jaeger
* @version: 1.0
* Date:     8/8/20
**/

import java.util.*;

public class Test{

	private static Random randNum = new Random(); 

	private static Room livingRoom = new Room("living room", "this is a living room.");
	private static Room kitchen = new Room("kitchen", "this is a kitchen.");
	private static Room bedroom = new Room("bedroom", "this is a bedroom.");

	// private static List<Room> house;
	private static ManorHouse manor = new ManorHouse();
	private static List<Room> house = manor.createList();
	private static Hashtable<Integer, Room> table = manor.createHashtable();
	private static int i;
	private static int randomRoom;
	private static List<Integer> enteredRooms = new ArrayList<>();
	private static Room room; 
	private static boolean run;

	public static int randomNumber(){
		return randNum.nextInt(8);
	}

	


	public static void main(String[] args){

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

		System.out.println();
		// Hashtable<Integer, Room> table = new Hashtable<Integer, Room>();
		for(i = 0; i < house.size(); i++){
			table.put(i, house.get(i));
		}

		// randomRoom = randomNumber();
		// System.out.println("Random number is: " + randomRoom);
		// Room room = table.get(randomRoom);
		// if (room != null){
		// 	System.out.println("Random room is: " + room.getName());
		// }
		
		// System.out.println();

		run = true;
		while(run){
			randomRoom = randomNumber(8);
			room = table.get(randomRoom);
			if (enteredRooms.contains(randomRoom)){
				System.out.println("You try to reenter the " + room.getName() + ", but that's not allowed.");
				System.out.println("You must now enter The Tower.");
				System.out.println("Goodbye!");
				System.out.println();
				run = false;
			}
			else{	
				System.out.println("You enter the " + room.getName());
				enteredRooms.add(randomRoom);
			}
		}
		

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