import java.util.*;
import java.lang.Math;

public class Histogram{

	private static Random randNum = new Random(); 
	private static List<Integer> randomNumbers = new ArrayList<>();
	private static Hashtable<Integer, Integer> frequency = new Hashtable<>();
	private static Hashtable<Integer, Float> percentages = new Hashtable<>();
	private static Hashtable<Integer, Integer> table = new Hashtable<>();
	private static int i;
	private static int k;

	private static int sum = 0;
	private static float avg = 0.0f;
	private static float per = 0.0f;
	private static int roll = 0;
	private static int freq = 0;
	private static String ast = "*";
	private static String percentage = "*";
	private static int max = 0;
	private static float floatHeight = 0;
	private static int height = 0;
	private static int row = 0;
	private static int check;
	private static float floatCheck = 0;
	private static String sums = "Frequency of Dice Roll Sums";
	private static String percents = "Percentage Distribution of Dice Roll Sums";
	private static String histo = "Histogram Showing Uniform Distribution of Dice Roll Sums";



	protected static int dice(){
		return randNum.nextInt(6) + 1;
	}
	
	protected static int twoDSix(){
		return (dice() + dice());
	}

	// protected static List<Integer> testTwoDSix(){
	// 	for (i = 0; i < 1000; i++){
	// 		randomNumbers.add(twoDSix());
	// 		// System.out.println(randomNumberCombat());
	// 	}
	// 	// System.out.println(randomNumbers);
	// 	return randomNumbers;
	// }

	protected static void testTwoDSix(){
		for (i = 0; i < 10000; i++){
			randomNumbers.add(twoDSix());
			// System.out.println(randomNumberCombat());
		}
		// System.out.println(randomNumbers);
		// return randomNumbers;
	}

	// protected static Hashtable<Integer, Integer> frequency (List<Integer> list){
	// 	for (i = 2; i < 13; i++){
	// 		freq = Collections.frequency(list, i);
	// 		table.put(i, freq);
	// 		System.out.println("Frequency of " + i + ": " + freq);
	// 	}
	// 	return table;
	// }

	protected static void frequency (List<Integer> randomNumbers){
		System.out.println();
		System.out.println(sums.toUpperCase());
		for (i = 2; i < 13; i++){
			freq = Collections.frequency(randomNumbers, i);
			frequency.put(i, freq);
			System.out.println("Frequency of " + i + ": " + freq);
		}
		System.out.println();
		// return table;
	}

	// protected static Hashtable<Integer, Float> percentages(Hashtable<Integer, Integer> table){
	// 	for(i = 2; i < 13; i++){
	// 		freq = percentages.get(i);
	// 		per = (float)freq / 1000 * 100;
	// 		percentages.put(i, per);
	// 		percentage = String.format("%.02f", per);
	// 		System.out.println("Percentage of " + i + ": " + percentage + "%");
	// 	}
	// 	return percentages;
	// }

	protected static void percentages(Hashtable<Integer, Integer> frequency){
		System.out.println(percents.toUpperCase());
		for(i = 2; i < 13; i++){
			freq = frequency.get(i);
			per = (float)freq / 10000 * 100;
			percentages.put(i, per);
			percentage = String.format("%.02f", per);
			System.out.println("Percentage of " + i + ": " + percentage + "%");
		}
		System.out.println();
		// return percentages;
	}

	protected static void histogram(Hashtable<Integer, Integer> frequency){
		System.out.println();
		System.out.println(histo.toUpperCase());
		System.out.println();

		max = frequency.get(7);
		// height = max / 10;
		floatHeight = (float)max / 100;
		// System.out.println(floatHeight);

		height = Math.round(floatHeight);
		// height = (int)height;
		row = height;
		// int two = frequency.get(2);
		// two = two / 10;
		// System.out.println(max);
		// System.out.println(height);
		// System.out.println(row);
		// System.out.println(two);


		for (i=0; i<row; i++){
			for(k=2; k<13; k++){
				floatCheck = ((float)frequency.get(k) / 100);
				check = Math.round(floatCheck);
				if (check < height){
					System.out.printf("%-5s", "");

					// if(k<10){
					// 	System.out.printf("%-4s", "");
					// }
					// else{
					// 	System.out.printf("%-5s", "");
					// }

					// System.out.print("row: "+(row - i));
					// System.out.print(" height: "+height);
					// System.out.println();
					// height = height - 10;
					// continue;
				}
				else{
					// System.out.print("row: "+(row - i));
					// System.out.print(" height: "+height);
					System.out.printf("%-5s", ast);

					// if(k<10){
					// 	System.out.printf("%-4s", ast);
					// }
					// else{
					// 	System.out.printf("%-5s", ast);
					// }
					// System.out.println(ast);
					// height = height - 10;
				}
			}
			height = height - 1;
			System.out.println();
			// if (two < height){
			// 	System.out.print("row: "+(row - i));
			// 	System.out.print(" height: "+height);
			// 	System.out.println();
			// 	height = height - 10;
			// 	continue;
			// }
			// else{
			// 	System.out.print("row: "+(row - i));
			// 	System.out.print(" height: "+height);
			// 	System.out.println(ast);
			// 	height = height - 10;
			// }
		}

		// for (i=0; i<=row; i++){
		// 	for(k = 2; i < 13; k++){
		// 		if (frequency.get(k) < height){;
		// 			continue;
		// 		}
		// 		else{
		// 			System.out.printf("%-4s", ast);
		// 		}
		// 	}	
		// 	height = height - 10;
		// 	// System.out.println(ast);
		// }
		// System.out.println(max);
		// System.out.println();
	}

	// protected static void histogram(List<Integer> list){
	// 	for (i = 2; i < 13; i++){
	// 		freq = Collections.frequency(list, i);
	// 		System.out.println("" + i + ": " + ast.repeat((freq/5)));

	// 		// System.out.println("Frequency of " + i + ": " + Collections.frequency(list, i));
	// 	}
	// }

	protected static void average(Hashtable<Integer, Integer> frequency){
		for(i = 2; i < 13; i++){
			sum = frequency.get(i) * i + sum;
			// per = (float)freq / 10000 * 100;
			// percentages.put(i, per);
			// percentage = String.format("%.02f", per);
			// System.out.println("Percentage of " + i + ": " + percentage + "%");
		}
		avg = (float)sum / 10000;
		System.out.println("Average value: " + avg);
	}

	public static void main(String[] args){

		testTwoDSix();
		frequency(randomNumbers);
		percentages(frequency);
		histogram(frequency);




		System.out.printf("%-5d", 2);
		System.out.printf("%-5d", 3);
		System.out.printf("%-5d", 4);
		System.out.printf("%-5d", 5);
		System.out.printf("%-5d", 6);
		System.out.printf("%-5d", 7);
		System.out.printf("%-5d", 8);
		System.out.printf("%-5d", 9);
		System.out.printf("%-5d", 10);
		System.out.printf("%-5d", 11);
		System.out.printf("%-5d", 12);
		System.out.println();
		System.out.println();
		
		average(frequency);





		





	}//end main
}//end class