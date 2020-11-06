import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * Counts the number of occurence of each character in an array
 * @author karan
 *
 */
public class CharacterCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaration, Instantiation and Initialization
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		//Asking the user for the number of elements to be given as input
		System.out.println("Enter the number of characters to be given as input : ");
		n = sc.nextInt();
		
		//Instantiating the character array
		char[] arr = new char[n];
		
		//Taking the input of the character array from the user
		for(int i =0 ;i <n ;i++)
		{
			System.out.println("Enter the character : ");
			arr[i] = sc.next().charAt(0);
		}
		
		/**
		 *  countChars() method is called which counts the number of occurrence of a character in the array and returns the result as a map
		 *  The map is then printed out to the user
		 */
		Map<Character, Integer> map = countChars(arr);
		System.out.println(map);
		sc.close();

	}

	/**
	 * 
	 * Takes a character array and find the number of occurrences for each character
	 * The result is returned as a map with the characters being the key and the number of occurrence as its value
	 * @param arr
	 * @return map
	 */
	private static Map<Character, Integer> countChars(char[] arr) {
		int count = 0;
		char duplicate = 0;
		Map<Character, Integer> map = new HashMap<>();
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++)
		{
			if(duplicate == arr[i])
				continue;
			else
				duplicate = arr[i];
			count = 1;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
					count++;
			}
			map.put(arr[i], count);
		}
		return map;
	}

}
