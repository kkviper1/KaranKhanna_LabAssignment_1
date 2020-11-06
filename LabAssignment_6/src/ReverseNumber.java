
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */

/**
 * Takes an array of integers and reverses the number then sorts it and displays it back to the user
 * @author karan
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
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
		 * getSorted() method is called by providing the integer array as input, the array is then sorted and returned back
		 * The array is then printed
		 */
		int[] resultArray = getSorted(arr);
		System.out.println("-------------Result-----------");
		for(int i : resultArray)
		{
			System.out.print(i+" ");
		}
		sc.close();

	}

	/**
	 * Takes an array of integer and sorts it using Collections.sort and returns the sorted array back 
	 * @param arr
	 * @return resultArray
	 */
	private static int[] getSorted(int[] arr) {
		String[] stringArray = new String[arr.length];
		int[] resultArray = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			stringArray[i] = Integer.toString(arr[i]);
			StringBuilder sb = new StringBuilder();
			sb.append(stringArray[i]);
			stringArray[i] = sb.reverse().toString();
		}
		ArrayList<String> list = new ArrayList<>(Arrays.asList(stringArray));
		Collections.sort(list);
		
		for(int i =0;i<arr.length;i++)
		{
			resultArray[i] = Integer.parseInt(list.get(i));
		}
		
		return resultArray;
	}

}
