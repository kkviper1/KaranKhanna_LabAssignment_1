/**
 * 
 * @author karan
 *
 *	Desc: Removes duplicates in an Integer array and returns it in Descending order
 *
 */

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		//Initialization, Instantiation and Declaration
		Scanner sc = new Scanner(System.in);
		int length;
		
		//Initializing the length variable for the length of the array
		System.out.println("Enter the number of elements in the array : ");
		length = sc.nextInt();
		
		//Declaring and Instantiating the Integer array
		int[] arr = new int[length];
		
		//Initializing the array with values
		System.out.println("Enter "+length+" numbers : ");
		for(int i =0;i<length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//Calling the modifyArray() method
		int[] result = modifyArray(arr);
		
		//Prints the result in descending order
		for(int i =result.length-1;i>=0;i--)
		{
			System.out.print(result[i]+"  ");
		}
	}

	private static int[] modifyArray(int[] arr) {
		int n = arr.length;
		int[] newArray = new int[n];
		int j = 0;
		

		Arrays.sort(arr); //sort the array
		
		//Logic to remove duplicate elements
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				newArray[j] = arr[i];  //If the next element is not the same as the previous
				j++						// the element is added to the new temporary array
;					
			}
		}
		newArray[j++] = arr[n-1]; //the final element of the original array is added to the new array to avoid null values
		
		
		int[] resultArray = new int[j];  //A new array is initialized for the resultant array
		
		for(int i=0;i<j;i++)
		{
			resultArray[i] = newArray[i];  /**The values of the temporary array minus the final value
											* of the temporary array is copied to the final resultant array
											*/
		}	
		
		return resultArray;
	}
}


