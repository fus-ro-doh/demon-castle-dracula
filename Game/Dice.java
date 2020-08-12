



import java.util.Random;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Hashtable;


public class Dice{

	private static Random dice = new Random(); 
	// private static List<Integer> randomNumbers = new ArrayList<>();
	// private static Hashtable<Integer, Integer> frequency = new Hashtable<>();
	// private static int i;
	// private static int sum = 0;
	// private static float avg = 0.0f;
	// private static float per = 0.0f;
	// private static int roll = 0;
	// private static int freq = 0;
	// private static String ast = "*";
	// private static String percentage = "*";


	protected static int dice(){
		return dice.nextInt(6) + 1;
	}

	protected static int twoDSix(){
		return (dice() + dice());
	}

}//end class