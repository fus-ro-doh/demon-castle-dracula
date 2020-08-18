



public class DoomClock{

	private int counter;



	protected DoomClock(){
		this.counter = 0;

	}

	protected int increment(){
		return this.counter++;
	}

	protected int getTime(){
		// System.out.println("The Doom Clock sits at " + this.counter);
		return this.counter;
	}

}//end class