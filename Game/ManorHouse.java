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
		this.banquetHall = new Room("Banquet Hall", "\nYou enter a cavernous ballroom with taxidermied animals\nhanging on the walls and over the fireplace.\nGhostly music emanates from unseen instruments. \nThere are long tables overflowing with delicious-smelling food.\nA thunderstorm rages outside.");
		this.livingQuarters = new Room("Living Quarters", "\nYou enter a luxuriously appointed suite of bedrooms,\nantechambers, and salons filled with finely crafted furniture");
		this.lunarium = new Room("Lunarium", "\nYou enter the Lunarium,\nan enormous greenhouse suffused with\nthe Blood Moon Eclipse’s crimson glow.");
		this.armory = new Room("Armory", "\nYou enter the Armory.\nIt is a honeycomb of stalls, hallways, and storerooms\nfilled with an unrivaled collection of armor and weapons\nfrom every civilization that has known Dracula’s evil.");
		this.dungeon = new Room("Dungeon", "\nYou find yourself in the Dungeon.\nThis is a dank, Escher-like morass\nof iron-barred torture chambers where Dracula\nperforms his infernal experiments on living and dead alike.\nThe entire jumble reverberates with the lamentations of its victims.");
		this.treasureHoard = new Room("Treasure Hoard", "\nYou have come upon Dracula's Treasure Hoard.\nEntering, you find yourself inside a gigantic vault\nwith a glittering mountain of gold, jewels,\nand priceless artifacts reaching toward the ceiling.");
		this.library = new Room("Library", "\nDracula's Library.\nInside, you find an unimaginably huge archive\nof books, scrolls, artifacts, and other documents\nfrom throughout time and space.\nWhat knowledge housed within,\nand at what cost is it derived?");
		this.chapel = new Room("Chapel", "\nYou enter...a chapel?\nA simple church of wood and stone\nlit by hundreds of wax candles.\nCan Dracula even enter this space?\nAre you safe here?\nCan God—or whatever diety this chapel exists to exalt—\nprotect you within these hallowed walls?\nSomehow, you think not...");
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