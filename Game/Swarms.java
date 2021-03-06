/**
* Overview:	Swarms class creates a collection of Minion objects, 
* stores them in a List of Minion objects, 
* and then maps a set of Integers to those Minion objects in a Hashtable.
*
* @author:  Daniel W. Jaeger
* @version: 1.2
* Date:     8/17/20
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
	private List<Minion> swarms;
	private Hashtable<Integer, Minion> table;
	private int i;
	

	protected Swarms(){
		this.spiderBabies = new Minion("Spider Babies", "\nShiny black arachnids with porcelain baby doll heads.\nTheir laughter echoes long after their death.");
		this.mechanicalScorpions = new Minion("Mechanical Scorpions", "\nClockwork scorpions with venomous stingers.\nYou hear the clattering of their metallic legs\nas they clamber down the walls and skitter towards you." );
		this.severedHands = new Minion("Severed Hands", "\nSevered hands claw their way towards you.\nScratching.\nGrasping.\nHorribly manicured.\nUntiring.");
		this.eyeballBats = new Minion("Eyeball Bats", "\nEyeball Bats.\nYou hate Eyeball Bats.\nEveryone hates Eyeball Bats.");
		this.flyingGorgonHeads = new Minion("Flying Gorgon Heads", "\nFlying Gorgon Heads swoop towards you, screeching horribly,\ntheir tinny voices piercing your ears, echoing through your skull.\nYou will not soon forget this sound.");
		this.flamingSkulls = new Minion("Flaming Skulls", "\nFlaming Skulls rolls towards you,\nleaving a firery trail in their wake,\nscreaming and biting.");
		this.eyeballBats = new Minion("Eyeball Bats", "\nFist-sized eyeballs with leathery membranes stretched over finger-like bones.\nThey radiate a cone of negative energy from their pupils that fries flesh from bone.\nThe surface of the eye is covered in a sticky,\nflammable aqueous humor that sometimes explodes.");	
	}//end Constructor

	protected List<Minion> createList(){
		this.swarms = Arrays.asList(spiderBabies, mechanicalScorpions, severedHands, eyeballBats, flyingGorgonHeads, flamingSkulls, eyeballBats);
		return this.swarms;
	}

	protected Hashtable<Integer, Minion> createHashtable(){
		this.table = new Hashtable<Integer, Minion>();
		for(i = 0; i < this.swarms.size(); i++){
			this.table.put(i, this.swarms.get(i));
		}
		return this.table;
	}

	protected Minion getSwarm(int index){
		return this.swarms.get(index);
	}
}//end class