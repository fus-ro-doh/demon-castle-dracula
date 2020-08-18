/**
* Overview:	Castle class creates rooms/areas/spaces contained within Dracula's Castle.
*
* @author:  Daniel W. Jaeger
* @version: 1.1
* Date:     8/9/20
**/


import java.util.Hashtable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Swarms{

	private Minion spiderBabies;
	private Minion mechanicalScorpions;
	private Minion severedHands;
	private Minion eyeballBats;
	private Minion flyingGorgonHeads;
	private Minion flamingSkulls;
	private List<Minion> minions;
	private Hashtable<Integer, Minion> table;
	private int i;
	

	protected Swarms(){
		this.spiderBabies = new Minion("Spider Babies", "\nShiny black arachnids with porcelain baby doll heads. Their laughter echoes long after their death.");
		this.mechanicalScorpions = new Minion("Mechanical Scorpions", "\nClockwork scorpions with venomous stingers. You hear the clattering of their metallic legs as they clamber down the walls and skitter towards you." );
		this.severedHands = new Minion("Severed Hands", "\nSevered hands claw their way towards you. Scratching. Grasping. Untiring.");
		this.eyeballBats = new Minion("Eyeball Bats", "\nEyeball Bats. You hate Eyeball Bats. Everyone hates Eyeball Bats.");
		this.flyingGorgonHeads = new Minion("Flying Gorgon Heads", "\nFlying Gorgon Heads swoop towards you, screeching horribly, their tinny voices piercing your ears, echoing through your skull. You will not soon forget this sound.");
		this.flamingSkulls = new Minion("Flaming Skulls", "\nFlaming Skulls rolls towards you, leaving a flaming trail in their wake, screaming and biting.");
		this.eyeballBats = new Minion("Eyeball Bats", "\nFist-sized eyeballs with leathery membranes stretched over finger-like bones. They radiate a cone of negative energy from their pupils that fries flesh from bone. The surface of the eye is covered in a sticky, flammable aqueous humor that sometimes explodes.");	
	}//end Constructor

	protected List<Swarms> createList(){
		minions = Arrays.asList(spiderBabies, mechanicalScorpions, severedHands, eyeballBats, flyingGorgonHeads, flamingSkulls, eyeballBats);
		return minions;
	}

	protected Hashtable<Integer, Swarms> createHashtable(){
		table = new Hashtable<Integer, Minion>();
		for(i = 0; i < minions.size(); i++){
			table.put(i, minions.get(i));
		}
		return table;
	}
}//end class