import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */

/**
 * Calculates the second smallest number in an integer array and displays it
 * @author karan
 *
 */
public class SecondSmallest {

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
		 * secondSmallest() method is called which takes the integer array and returns the second smallest number in the array
		 * The second smallest number is printed out
		 */
		int resultNumber = secondSmallest(arr);
		System.out.println("The second smallest number is : "+resultNumber);
		sc.close();
		
	}

	/**
	 * 
	 * The method takes an integer array as parameters and finds the second smallest number in the array by converting it into an ArrayList
	 * and sorting the ArrayList
	 * @param arr
	 * @return resultNumber
	 */
	private static int secondSmallest(int[] arr) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		for(int i : arr)
		{
			numberList.add(i);
		}
		
		Collections.sort(numberList);
		int resultNumber = numberList.get(1);
		return resultNumber;
	}

}
