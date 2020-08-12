



public class DoomClock{

	private int counter;



	protected DoomClock(){
		counter = 0;

	}

	protected int increment(){
		return counter++;
	}

	protected int getTime(){
		// System.out.println("The Doom Clock sits at " + this.counter);
		return counter;
	}

}//end class