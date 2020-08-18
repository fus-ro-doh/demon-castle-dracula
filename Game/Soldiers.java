/**
* Overview:	Soldiers class creates a collection of Minion objects, 
* stores them in a List of Minion objects, 
* and then maps a set of Integers to those Minion objects in a Hashtable.
*
* @author:  Daniel W. Jaeger
* @version: 1.1
* Date:     8/9/20
**/


import java.util.Hashtable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Soldiers{

	private Minion skeletons;
	private Minion gargoyles;
	private Minion nightBeasts;
	private Minion necroWraiths;
	private Minion fleshGolems;
	private Minion gillmen;
	private List<Minion> soldiers;
	private Hashtable<Integer, Minion> table;
	private int i;
	

	protected Soldiers(){
		this.skeletons = new Minion("Skeletons", "\nShiny black arachnids with porcelain baby doll heads. Their laughter echoes long after their death.");
		this.gargoyles = new Minion("Gargoyles", "\nClockwork scorpions with venomous stingers. You hear the clattering of their metallic legs as they clamber down the walls and skitter towards you." );
		this.nightBeasts = new Minion("Night Beasts", "\nSevered hands claw their way towards you. Scratching. Grasping. Untiring.");
		this.necroWraiths = new Minion("Necro-Wraiths", "\nEyeball Bats. You hate Eyeball Bats. Everyone hates Eyeball Bats.");
		this.fleshGolems = new Minion("Flesh Golems", "\nFlying Gorgon Heads swoop towards you, screeching horribly, their tinny voices piercing your ears, echoing through your skull. You will not soon forget this sound.");
		this.gillmen = new Minion("Gillmen", "\nFlaming Skulls rolls towards you, leaving a flaming trail in their wake, screaming and biting.");	
	}//end Constructor

	protected List<Minion> createList(){
		soldiers = Arrays.asList(skeletons, gargoyles, nightBeasts, necroWraiths, fleshGolems, gillmen);
		return soldiers;
	}

	protected Hashtable<Integer, Minion> createHashtable(){
		table = new Hashtable<Integer, Minion>();
		for(i = 0; i < soldiers.size(); i++){
			table.put(i, soldiers.get(i));
		}
		return table;
	}
}//end class