

import java.util.*;

public class diceRollTest{

	private static Random randNum = new Random(); 
	private static List<Integer> randomNumbers = new ArrayList<>();
	private static Hashtable<Integer, Integer> frequency = new Hashtable<>();
	private static int i;
	private static int sum = 0;
	private static float avg = 0.0f;
	private static float per = 0.0f;
	private static int roll = 0;
	private static int freq = 0;
	private static String ast = "*";
	private static String percentage = "*";



	protected static int dice(){
		return randNum.nextInt(6) + 1;
	}
	
	protected static int twoDSix(){
		return (dice() + dice());
	}

	protected static List<Integer> testTwoDSix(){
		for (i = 0; i < 1000; i++){
			randomNumbers.add(twoDSix());
			// System.out.println(randomNumberCombat());
		}
		System.out.println(randomNumbers);
		return randomNumbers;
	}

	protected static void averageRandomNumbers(List<Integer> list){
		list = list;
		for (i = 0; i < list.size(); i++){
			sum = sum + list.get(i);
		}

		System.out.println("Sum: " + sum);
		System.out.println("n: " + list.size());

		avg = (float)sum / list.size();
		System.out.println("Average = sum / n ");
		System.out.println("Average:  " + avg);

		containsNumber(list);
	}

	protected static Hashtable<Integer, Integer> containsNumber(List<Integer> list){
		for (i = 2; i < 13; i++){
			freq = Collections.frequency(list, i);
			frequency.put(i, freq);
			System.out.println("Frequency of " + i + ": " + freq);
		}
		return frequency;
	}

	protected static void percentages(Hashtable<Integer, Integer> table){
		for(i = 2; i < 13; i++){
			freq = table.get(i);
			per = (float)freq / 1000 * 100;
			percentage = String.format("%.02f", per);
			System.out.println("Percentage of " + i + ": " + percentage + "%");
		}
	}

	protected static void histogram(List<Integer> list){
		for (i = 2; i < 13; i++){
			freq = Collections.frequency(list, i);
			System.out.println("" + i + ": " + ast.repeat((freq/5)));

			// System.out.println("Frequency of " + i + ": " + Collections.frequency(list, i));
		}
	}

	public static void main(String[] args){
		averageRandomNumbers(testTwoDSix());
		System.out.println();
		percentages(frequency);
		System.out.println();
		histogram(randomNumbers);

	}//end main
}//end class