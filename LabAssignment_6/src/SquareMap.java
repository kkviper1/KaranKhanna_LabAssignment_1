import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * Calculates and displays the squares of all the numbers given in an array as a HashMap
 * @author karan
 *
 */
public class SquareMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaration, Instantiation and Initialization
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		//Asking the user for the number of elements to be given as input
		System.out.println("Enter the number of integers to be given as input : ");
		n = sc.nextInt();
		
		//Instantiating the integer array
		int[] arr = new int[n];
		
		//Taking the input of the integer array from the user
		for(int i =0; i<n;i++)
		{
			System.out.println("Enter the integer : ");
			arr[i] = sc.nextInt();
		}
		
		/**
		 * method getSquares() is called which takes an integer array as input and calculates the squares and returns a map of the numbers and its squares
		 * the returned map is then printed out
		 */
		Map<Integer, Integer> map = getSquares(arr);
		System.out.println(map);
		sc.close();

	}

	/**
	 * 
	 * Takes an integer array as input and finds the square of each number. The result is then added to a Map with the number as the key and its square
	 * as its value. The map is returned.
	 * @param arr
	 * @return map
	 */
	private static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0;i<arr.length;i++)
		{
			map.put(arr[i], (arr[i]*arr[i]));
		}
		return map;
	}

}
