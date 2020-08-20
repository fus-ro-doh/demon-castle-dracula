/**
* Overview:	a file for testing concepts
*
* @author:  Daniel W. Jaeger
* @version: 1.2
* Date:     8/17/20
**/

import java.util.Scanner;


public class Dracula extends Enemy{

	private String name;
	private String description;
	private int health;

	private String playerWinsMessage;
    private String layerLosesMessage;

    private int diceSum;
    private boolean run;

    private Scanner getInput;
    private String input;

	protected Dracula(){
		this.name = "Dracula";
		this.description = "Dracula. Drakul. The Demon King.";
		this.health = 3;
		this.diceSum = 0;
		this.getInput = new Scanner(System.in);

	}

	protected void finalConfrontation(Player player){
		System.out.println("Attack me...if you dare.\"");
		System.out.println();
		System.out.println("This is the final battle.");
		System.out.println("You must successfully attack Dracula three times in order to defeat him.");
		System.out.println();
		System.out.println("What would you like to do?");

		this.run = true;
		while(this.run){
			if (this.health <= 0){
				System.out.println("Congratulations!!!\nYou defeated the Demon King, Lord Dracula!");
				System.out.println("Thank you for playing Demon Castle Dracula.");
				System.out.println();
				System.exit(0);
			}
			System.out.println("Type \"attack\" to attack.");
			this.input = this.getInput.nextLine();
			this.input.toLowerCase();
			if (this.input.equals("attack")){
				this.diceSum = Dice.twoDSixPlusOne();
				if (this.diceSum < 7){
					System.out.println();
					player.loseHearts();
					player.loseHearts();
					System.out.println("Your attack failed, and you lost heart.");
					System.out.println("Hearts: " + player.getHearts());
					System.out.println("Dracula: " + getHealth());
					if (player.getHearts() <= 0){
						System.out.println("You died a valiant hero, but you died all the same.");
						System.out.println("The world will now enter 1000 years of Darkness.");
						System.out.println("You have failed in your quest.");
						System.exit(0);
					}
					else{
						continue;
					}
				}
				else if (this.diceSum < 10){
					System.out.println();
					player.loseHearts();
					player.loseHearts();
					System.out.println("You strike a mighty blow to Lord Dracula,\nbut you lost some heart in the process.");
					this.health = loseHealth();
					System.out.println("Hearts: " + player.getHearts());
					System.out.println("Dracula: " + getHealth());
					System.out.println();
					if (player.getHearts() <= 0){
						System.out.println("You died a valiant hero, but you died all the same.");
						System.out.println("The world will now enter 1000 years of Darkness.");
						System.out.println("You have failed in your quest.");
						System.exit(0);
					}
					else{
						continue;
					}
				}
				else{
					System.out.println();
					System.out.println("You injured The Demon King, taking no damage in the process!");
					this.health = loseHealth();
					System.out.println("Hearts: " + player.getHearts());
					System.out.println("Dracula: " + getHealth());
					System.out.println();
				}
			}
			else if (this.input.equals("q")){
					System.exit(0);
			}
		}
	}	


	protected String getplayerWinsMessage(){
		return this.playerWinsMessage;
	}

	protected String getplayerLosesMessage(){
		return this.playerWinsMessage;
	}

	protected int loseHealth(){
		return (this.health - 1);
	}

	protected int getHealth(){
		return this.health;
	}
}//end class