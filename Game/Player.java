/**
* Overview:	a file for testing concepts
*
* @author:  Daniel W. Jaeger
* @version: 1.2
* Date:     8/17/20
**/



public class Player extends Character{

	private int hearts;
	private int attackBuff;


	protected Player(String name){
		this.name = name;
		attackBuff = 1;
		hearts = 8;
	}

	// protected String getName(){
	// 	return this.name;
	// }

	protected int getAttackBuff(){
		return this.attackBuff;
	}

	protected int getHearts(){
		return this.hearts;
	}

	protected void loseHearts(){
		this.hearts = (hearts - 1);
		// return (this.hearts - 1);
	}

	protected void refillHearts(){
		this.hearts = 8;
	}
}//end class

