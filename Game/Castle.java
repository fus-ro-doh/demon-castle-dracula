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
		this.gate = new Room("Gate", "\nAs you reach the edge of the haunted forest, the trees part and Demon Castle Dracula comes towering into view. It is an imposing mass of obsidian spires jutting into the crimson sky like broken, blackened staves. A high stone wall with screaming faces carved into it extends in either direction, as far as the eye can see. The only ingress to the estate grounds appears to be the heavy iron gate in front of you, beyond which you can see the vast cemetery that seemingly covers the estate grounds from here to the castle proper.\n\nThe sun is setting. You can hear the howls of the Night Beasts as they close in behind you.\n\nWhat do you do?");
		this.cemetery = new Room("Cemetery", "\nBefore you lies a sprawling necropolis of gravestones, mausolea, and marble statuary. As the sky darkens, a choking, glowing miasma wafts up from the ground and swirls around you, blocking your vision.");
		this.moat = new Room("Moat", "\nThe front entrance to Demon Castle Dracula is defended by a broad moat filled with steaming, bubbling blood. You can see a drawbridge built into the castle side of the curtain wall, but it is currently up. Strange creatures stir atop the curtain wall and underneath the surface of the blood moat.");
		this.courtyard = new Room("Courtyard", "\nYou enter an expansive cobblestone courtyard enclosed by the high curtain wall. A forest of Dracula’s victims—villagers, soldiers, and servants impaled on twenty-foot spikes—fills the area. The weather here is unnaturally cold, and light snow falls from the sky, blanketing everything. At the far end of the courtyard, you can see the entrance to the manor house.");
		this.foyer = new Room("Foyer", "\nYou enter a grand, pentagonal chamber with doors in every direction and a pentagram floor inlay. Twin staircases curve majestically up to the second and third floors. Baroque portraits cover the walls, and an enormous golden candelabra hangs from the ceiling.");
		this.manorHouse = new Room("Manor House", "\nYou have entered the Manor House, but you can immediately tell that something isn't right. Rooms in the Manor House rearrange themselves of their own accord. Whether through sorcery, mechanical engineering, or some combination of both, you cannot say. When you exit one room, it is impossible to know what room you will arrive in. Regardless, you must make your way to The Tower, and the only way to do that is to explore the manor. For now, explore this first room.");
		this.crypt = new Room("Crypt", "\nEntering the crypts, you find an unholy sanctum dedicated to Count Dracula’s ancestors. The carvings along the walls retell the Țepeș family’s wartime exploits and brutal rise to power. At the far end of the crypt you see a ten-foot-long sarcophagus.");
		this.catacombs = new Room("Catacombs", "\nYou descend the hidden staircase deep into the earth, where you find a seemingly endless labyrinth of bones, its winding tunnels lit by sapphire ghost-flames. The echoes of all those interred here echo throughout, nearly driving you mad.");
		this.caves = new Room("Caves", "\nYou enter a cave system running underneath Demon Castle Dracula. Rumor has it that the caves beneath the castle are older than the land itself, and home to creatures older still. The glassy expanse of stagnant, pitch-black bogwater is marred only by the stalagmites that pierce it from below and the incessant drip of ichor from the stalactites above. The water is shallow enough for wading—in some places—but the footing is unsure. Something swims underneath, and when you look at your reflection in the water, the face that stares back is not your own.");
		this.pit = new Room("Pit", "\nAt the center of the underground lake, you find a towering mound of muck reaching nearly to the cavern ceiling. As you approach, a stream of filth belches from the ceiling through a hole above the mound, adding to its height.");
		this.tower = new Room("Tower", "\nAfter your disorienting journey through the manor house, you finally come upon the entrance to the tower that serves as the castle’s alchemical engine. Gazing up, you see a technological hellscape: level after level of churning gears and cranking chains, of Crushing Walls and ape-like Hunchbacks the infernal machinery built into the walls. You must make your way through the clockwork nightmare in order to reach Dracula.");
		this.bridge = new Room("Bridge", "\nAs you reach the apex of the tower and step out onto its terrace, you spy the Throne Room off in the distance. Only a crumbling Bridge filled with a gauntlet of evil Minions stands between you and your fateful showdown with Dracula. A storm rages above, sending lightning, wind, and rain onto the bridge.");
		this.throneRoom = new Room("Throne Room", "\nYou finally reach Dracula’s Throne Room, a stately chamber of stone, silk, and shadow with impossibly high ceilings. Behind a grand, high-backed chair fashioned from demon horns and black iron, a stained glass window perfectly frames the blood moon eclipse. Its crimson light slashes across the room to reveal Count Dracula brandishing the Nox Aeterna. His laughter echoes throughout the chamber, chilling you to the marrow.\n\n\"Hahahahaha. Fool. You are too late. The ritual is complete. You should be proud to have come this far, but now. You. Will. DIE...FOR YOUR INSOLENCE!");

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
}//end class