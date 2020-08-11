/**
* Overview:	Class that defines the Manor House. 
*
* @author:  Daniel W. Jaeger
* @version: 1.1
* Date:     8/9/20
**/

import java.util.Hashtable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class ManorHouse{
	
	private Room banquetHall;
	private Room livingQuarters;
	private Room lunarium; 
	private Room armory;
	private Room dungeon;
	private Room treasureHoard;
	private Room library;
	private Room chapel;
	private List<Room> house;
	private Hashtable<Integer, Room> table;
	private int i;

	protected ManorHouse(){
		this.banquetHall = new Room("Banquet Hall", "\nYou enter a cavernous ballroom with taxidermied animals hanging on the walls and over the fireplace. Ghostly music emanates from unseen instruments. There are long tables overflowing with delicious-smelling food. A thunderstorm rages outside");
		this.livingQuarters = new Room("Living Quarters", "\nYou enter a luxuriously appointed suite of bedrooms, antechambers, and salons filled with finely crafted furniture");
		this.lunarium = new Room("Lunarium", "\nYou enter the Lunarium, an enormous greenhouse suffused with the blood moon eclipse’s crimson glow.");
		this.armory = new Room("Armory", "\nYou enter the Armory. It is a honeycomb of stalls, hallways, and storerooms filled with an unrivaled collection of armor and weapons from every civilization that has known Dracula’s evil.");
		this.dungeon = new Room("Dungeon", "\nYou find yourself in the Dungeon. This is a dank, Escher-like morass of iron-barred torture chambers where Dracula performs his infernal experiments on living and dead alike. The entire jumble reverberates with the lamentations of its victims.");
		this.treasureHoard = new Room("Treasure Hoard", "\nYou have come upon Dracula's Treasure Hoard. Entering, you find yourself inside a gigantic vault with a glittering mountain of gold, jewels, and priceless artifacts reaching toward the ceiling.");
		this.library = new Room("Library", "\nDracula's Library. Inside, you find an unimaginably huge archive of books, scrolls, artifacts, and other documents from throughout time and space. What knowledge housed within, and at what cost is it derived?");
		this.chapel = new Room("Chapel", "\nYou enter...a chapel. A simple church of wood and stone lit by hundreds of wax candles. Can Dracula even enter this space? Are you safe here? Can God—or whatever diety this chapel exists to exalt—protect you within these hallowed walls? Somehow, you think not...");
	}//end Constructor

	protected List<Room> createList(){
		house = Arrays.asList(banquetHall, livingQuarters, lunarium, armory, dungeon, treasureHoard, library, chapel);
		return house;
	}

	protected Hashtable<Integer, Room> createHashtable(){
		table = new Hashtable<Integer, Room>();
		for(i = 0; i < house.size(); i++){
			table.put(i, house.get(i));
		}
		return table;
	}

}//end class