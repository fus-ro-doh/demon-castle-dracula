/**
* Overview:	Castle class creates rooms/areas/spaces contained within Dracula's Castle.
*
* @author:  Daniel W. Jaeger
* @version: 1.1
* Date:     8/9/20
**/


public class Castle{

	private Room gate;
	private Room cemetery;
	private Room moat;
	private Room courtyard;
	private Room foyer;
	private Room manorHouse;
	private Room crypt;
	private Room catacombs;
	private Room caves;
	private Room pit;
	private Room banquetHall;
	private Room livingQuarters;
	private Room lunarium; 
	private Room armory;
	private Room dungeon;
	private Room treasureHoard;
	private Room library;
	private Room chapel;
	private Room tower;
	private Room bridge;
	private Room throneRoom;

	protected Castle(){
		this.gate = new Room("Gate", "\nAs you reach the edge of the haunted forest, the trees part\nand Demon Castle Dracula comes towering into view.\nIt is an imposing mass of obsidian spires jutting\ninto the crimson sky like broken, blackened staves.\nA high stone wall with screaming faces carved into it\nextends in either direction, as far as the eye can see.\nThe only ingress to the estate grounds appears to be\nthe heavy iron gate in front of you, beyond which you can see\nthe vast cemetery that seemingly covers\nthe estate grounds from here to the castle proper.\n\nThe sun is setting.\nYou can hear the howls of the Night Beasts\nas they close in behind you.\n\nWhat do you do?");
		this.cemetery = new Room("Cemetery", "\nBefore you lies a sprawling necropolis of\ngravestones, mausolea, and marble statuary.\nAs the sky darkens, a choking, glowing miasma wafts up\nfrom the ground and swirls around you, blocking your vision.");
		this.moat = new Room("Moat", "\nThe front entrance to Demon Castle Dracula is defended\nby a broad moat filled with steaming, bubbling blood.\nYou can see a drawbridge built into the castle side\nof the curtain wall, but it is currently up.\nStrange creatures stir atop the curtain wall\nand underneath the surface of the blood moat.");
		this.courtyard = new Room("Courtyard", "\nYou enter an expansive cobblestone courtyard\nenclosed by the high curtain wall.\nA forest of Dracula’s victim—villagers, soldiers,\nand servants impaled on twenty-foot spikes—fills the area.\nThe weather here is unnaturally cold,\nand light snow falls from the sky, blanketing everything.\nAt the far end of the courtyard,\nyou can see the entrance to the manor house.");
		this.foyer = new Room("Foyer", "\nYou enter a grand, pentagonal chamber with doors\nin every direction and a pentagram floor inlay.\nTwin staircases curve majestically\nup to the second and third floors.\nBaroque portraits cover the walls,\nand an enormous golden candelabra hangs from the ceiling.");
		this.manorHouse = new Room("Manor House", "\nYou have entered the Manor House,\nbut you can immediately tell that something isn't right.\nRooms in the Manor House rearrange themselves of their own accord.\nWhether through sorcery, mechanical engineering,\nor some combination of both, you cannot say.\nWhen you exit one room,\nit is impossible to know what room you will arrive in.\nRegardless, you must make your way to The Tower,\nand the only way to do that is to explore the Manor.\n\nFor now, explore this first room.");
		this.crypt = new Room("Crypt", "\nEntering the crypts, you find an unholy sanctum\ndedicated to Count Dracula’s ancestors.\nThe carvings along the walls retell the Țepeș family’s\nwartime exploits and brutal rise to power.\nAt the far end of the crypt\nyou see a ten-foot-long sarcophagus.");
		this.catacombs = new Room("Catacombs", "\nYou descend the hidden staircase deep into the earth,\nwhere you find a seemingly endless labyrinth of bones,\nits winding tunnels lit by sapphire ghost-flames.\nThe echoes of all those interred here reverberate throughout,\nnearly driving you mad.");
		this.caves = new Room("Caves", "\nYou enter a cave system running underneath Demon Castle Dracula.\nRumor has it that the caves beneath the castle are older\nthan the land itself, and home to creatures older still.\nThe glassy expanse of stagnant, pitch-black bogwater\nis marred only by the stalagmites that pierce it from below\nand the incessant drip of ichor from the stalactites above.\nThe water is shallow enough for wading\n—in some places—but the footing is unsure.\nSomething swims underneath,\nand when you look at your reflection in the water,\nthe face that stares back is not your own.");
		this.pit = new Room("Pit", "\nAt the center of the underground lake,\nyou find a towering mound of muck reaching nearly to the cavern ceiling.\nAs you approach, a stream of filth belches\nfrom the ceiling through a hole above the mound,\nadding to its height.");
		this.tower = new Room("Tower", "\nAfter your disorienting journey through the Manor House,\nyou finally come upon the entrance to the Tower\nthat serves as the castle’s alchemical engine.\n\nGazing up, you see a technological hellscape:\nlevel after level of churning gears and cranking chains,\nof Crushing Walls and ape-like Hunchbacks,\nthe infernal machinery built into the walls.\n\nYou must make your way through the clockwork nightmare\nin order to reach Dracula.");
		this.bridge = new Room("Bridge", "\nAs you reach the apex of the tower and step out onto its terrace,\nyou spy the Throne Room off in the distance.\nOnly a crumbling Bridge filled with a gauntlet of evil Minions\nstands between you and your fateful showdown with Dracula.\nA storm rages above,\nsending lightning, wind, and rain onto the bridge.");
		this.throneRoom = new Room("Throne Room", "\nYou finally reach Dracula’s Throne Room,\na stately chamber of stone, silk, and shadow\nwith impossibly high ceilings.\n\nBehind a grand, high-backed chair\nfashioned from demon horns and black iron,\na stained glass window perfectly frames\nthe Blood Moon Eclipse.\n\nIts crimson light slashes across the room\nto reveal Count Dracula brandishing the Nox Aeterna.\nHis laughter echoes throughout the chamber, chilling you to the marrow.\n\n\"Hahahahaha. Fool. You are too late.\nThe ritual is complete.\n\nYou should be proud to have come this far,\nbut now.\nYou.\nWill.\nDIE...FOR YOUR INSOLENCE!");

		this.gate.setRoutes(cemetery, crypt);
		this.cemetery.setExit(moat);
		this.moat.setExit(courtyard);
		this.courtyard.setExit(foyer);
		this.foyer.setExit(manorHouse);
		this.crypt.setExit(catacombs);
		this.catacombs.setExit(caves);
		this.caves.setExit(pit);
		this.pit.setExit(manorHouse);
		this.tower.setExit(bridge);
		this.bridge.setExit(throneRoom);		
	}

	protected Room getRoom(){
		return gate;
	}

	protected Room getTower(){
		return tower; 
	}

	protected Room getThrone(){
		return throneRoom; 
	}
}//end class