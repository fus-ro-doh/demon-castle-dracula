import java.util.Random;

interface TwoDSix {
	final Random dice = new Random();

	static int dice(){
		return dice.nextInt(6) + 1;
	}

	static int TwoDSix(){
		return (dice() + dice());
	}
}