/**
 * 
 * Converts a HashMap given by the user into a List and its output is provided back to the user
 * 
 * @author karan
 *
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ConvertList {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaration, Instantiation and Initialization
		Scanner sc = new Scanner(System.in);
		int n = 0;
		HashMap <Integer, Integer> hashMap = new HashMap<>();
		
		/**
		 * Getting input from the user to add the values to the HashMap
		 * Keys for the HashMap are auto-generated as indices 
		 */
		System.out.println("Enter the number of elements to be added to the map : ");
		n = sc.nextInt();
		for(int i = 0;i<n;i++)
		{
			System.out.println("Enter element "+i+" : ");
			int value = sc.nextInt();
			hashMap.put(i, value);
		}
		
		/**
		 * convertedList() method converts the HashMap to list andis called and the value is returned to an ArrayList and it's output is given to the user
		 */
		ArrayList<Integer> convertedList = getValues(hashMap);
		System.out.println(convertedList);
		sc.close();
	}

	/**
	 * 
	 * Takes a HashMap as the parameter and converts into a sorted list and returns it 
	 * @param hashMap
	 * @return outputList
	 */
	private static ArrayList<Integer> getValues(HashMap<Integer, Integer> hashMap) {
		Collection<Integer> values = hashMap.values();
		ArrayList<Integer> outputList = new ArrayList<Integer>(values);
		Collections.sort(outputList);
		return outputList;
	}

}
