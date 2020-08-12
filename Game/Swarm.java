/**
* Overview:	Castle class creates rooms/areas/spaces contained within Dracula's Castle.
*
* @author:  Daniel W. Jaeger
* @version: 1.1
* Date:     8/9/20
**/


public class Swarm{

	private Minion spiderBabies;
	private Minion eyeballBats;
	

	protected Swarm(){
		this.spiderBabies = new Minion("Spider Babies", "\nShiny black arachnids with porcelain baby doll heads. Their laughter echoes long after their death.");
		this.eyeballBats = new Minion("Eyeball Bats", "\nFist-sized eyeballs with leathery membranes stretched over finger-like bones. They radiate a cone of negative energy from their pupils that fries flesh from bone. The surface of the eye is covered in a sticky, flammable aqueous humor that sometimes explodes.");
			
	}

	protected Minion getSpiderBabies(){
		return spiderBabies;
	}

	protected Minion getEyeballBats(){
		return eyeballBats;
	}
}//end class