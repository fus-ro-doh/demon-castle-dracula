/**
*
*Description: Dungeon Class used for laying out my dungeon.
*
*@author: Daniel Jaeger
*@version 11/8/17
*/


public class Dungeon{

	private Room foyer;
	private Room lounge;
	private Room study;
	private Room diningRoom;
	private Room greatHall;
	private Room library;
	private Room kitchen;
	private Room ballroom;
	private Room billiardRoom;
	private Room pantry;
	private Room masterBedroom;
	private Room conservatory; 
	private Room westSecretPassage;
	private Room eastSecretPassage;
	protected Room exitFoyer;
	protected Room exitConservatory;

	public Dungeon(){
		this.foyer = new Room("\nYou are in the Foyer of an old mansion, seemingly abandoned. \nTo the NORTH, you can see the Great Hall. \nThere are rooms to the WEST and EAST, \nand the door to the SOUTH appears to be the main entrance.");
		this.lounge = new Room("\nYou have entered the Lounge. \nThe furniture is covered in a thick layer of dust. \nThere is a wrench laying on an end table by a couch. \nThere are exits to EAST and NORTH, \nand a suspicious looking candlelabra is affixed on the wall to the WEST.");
		this.study = new Room("\nYou have entered the Study. \nThere are multiple couches, tattered and worn, \ncovered in the same thick layer of dust that has collected \non every object in every room. \nA beautiful oak desk sits in front of tall windows. \nThere are doors to the WEST and NORTH, \nand a book on a shelf to the EAST catches your eye.");
		this.diningRoom = new Room("\nYou have entered the Dining Room. \nYou can see a long dining table, set for seven, \nalthough the same thick dust lays over the plates and cutlery. \nThere are doors to NORTH, EAST, and SOUTH.");
		this.greatHall = new Room("\nYou have entered the Great Hall. \nLarge tapestries hang on the walls, and there is a \nsuit of armor standing at attention in a far corner. \nYou notice a candlestick lying on the floor. \nThere are doors to WEST, NORTH, and EAST, and the Foyer is to the SOUTH.");
		this.library = new Room("\nYou have entered the Library. \nThe walls are lined floor to ceiling with books, \ndusty old tomes, giants bound in leather. \nThe room smells the way only a room filled with decaying books can smell, \nthe result of volatile chemicals in the paper, ink, and adhesives degrading. \nThere is a fireplace that looks as if it hasn't been lit in a very long time, \nand chair that looks as if it once must have been comfortable to sit in. \nThere is a lead pipe laying on its seat. \nThere are doors to WEST, NORTH, and SOUTH.");
		this.kitchen = new Room("\nYou have entered the Kitchen. \nIt smells musty and sour. \nThere are pots and pans sitting out, \nand you can see a knife rack that is clearly missing one knife from the set. \nThere are doors to the NORTH, EAST, and SOUTH.");
		this.ballroom = new Room("\nYou have entered the Ballroom. \nChandeliers hang from the ceiling, \nand old, heavy drapes cover giant windows to the NORTH. \nIt is empty and, like the rest of the mansion, feels abandoned. \nThere are doors to the WEST and SOUTH.");
		this.billiardRoom = new Room("\nYou have entered the Billiard Room. \nThere is, unsurprisingly, a billiard table in the center of the room, \na few balls still on the table. \nUpon further inspection, you notice a thick \npiece of rope laying on the table, as well. \nThere are doors to the NORTH and SOUTH.");
		this.pantry = new Room("\nYou have entered a large Pantry. \nOn its shelves you notice canned foods, \nbottles filled with unidentifiable liquids, \nand molded breads and other perishables. \nThere is a door to the SOUTH, \nand you notice a slit of light coming from behind the shelf to the WEST. \nIt looks like you could move the shelf aside.");
		this.masterBedroom = new Room("\nYou have entered the Master Bedroom. \nA four poster bed with privacy sheets is placed against one wall. \nThe room smells musty. The whole place feels abandoned. \nYou can see what appears to be some sort of greenhouse connected to the NORTH, \nand there is a door to the SOUTH. \nThere is also bookshelf to the EAST with a \ndim shaft of light peaking from behind one corner.");
		this.conservatory = new Room("\nYou have entered the Conservatory. \nThere are dead leaves on the ground \nand barren, withered plants sitting \nin pots filled with dry, old earth. \nEverything is dead in this room. \nStill. Quiet. \nThere is a door to the SOUTH. \nYou notice a brick on the ground and wonder \nif you could break a window to escape. \nThere are windows to the NORTH, WEST, and EAST.");
		this.westSecretPassage = new Room("\nYou have entered the West Secret Passage. \nIt is dimly lit, and the air feels stale. \nIt's not wide, \nbut there is enough space for you to walk through it. \nThere are exits to the NORTH and SOUTH.");
		this.eastSecretPassage = new Room("\nYou have entered the East Secret Passage. \nIt is dimly lit, and the air feels stale. \nIt's not wide, \nbut there is enough space for you to walk through it. \nThere are exits to the NORTH and SOUTH.");
		this.exitFoyer = new Room("\nYou decide to leave the mansion. \nYou cannot even remember how you got there. \nYou turn the handle on the giant wooden door, \nimmediately feeling a sense of relief. \nAs you begin to open the door, \nyou feel a cold, steely hand grasp your shoulder. \nYou experience only a moment of panic before everything goes black.\n");
		this.exitConservatory = new Room("\nYou grab a brick and shatter a window. \nCarefully, you climb out of the Conservatory and into the night. \nAhead of you is a vast overgrown hedge maze. \nYou are still trying to decide which direction \nto head in next when the howling begins. \nYou start to run, \nbut you know you won't be fast enough. \nYou feel the first bite moments after entering the maze, \na sharp pain in the back of your leg. \nYou fall to the groud, screaming. \nIt's all over very quickly.\n");
		
		this.foyer.setExits(greatHall,study,exitFoyer,lounge);
		this.lounge.setExits(diningRoom,foyer,null,westSecretPassage);
		this.study.setExits(library,eastSecretPassage,null,foyer);
		this.diningRoom.setExits(kitchen,greatHall,lounge,null);
		this.greatHall.setExits(ballroom,library,foyer,diningRoom);
		this.library.setExits(billiardRoom,null,study,greatHall);
		this.kitchen.setExits(pantry,ballroom,diningRoom,null);
		this.ballroom.setExits(null,null,greatHall,kitchen);
		this.billiardRoom.setExits(masterBedroom,null,library,null);
		this.pantry.setExits(null,null,kitchen,westSecretPassage);
		this.masterBedroom.setExits(conservatory,eastSecretPassage,billiardRoom,null);
		this.conservatory.setExits(exitConservatory,exitConservatory,masterBedroom,exitConservatory);
		this.westSecretPassage.setExits(pantry,null,lounge,null);
		this.eastSecretPassage.setExits(masterBedroom,null,study,null);
	}

	public Room getRoom(){
		return foyer;
	}
}