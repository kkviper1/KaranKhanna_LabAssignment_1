/**
 * 
 * @author karan
 *
 *	Desc : Returns the second smallest element of an integer array
 *
 */

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		
		//Declaration, Instantiation and Initialization
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		//Initializing the array with 5 values
		System.out.println("Enter 5 integers");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//Calling getSecondSamllest() method
		int secondSmallest = getSecondSmallest(arr);
		
		//Printing the result
		System.out.println("The second smallest element is : "+secondSmallest);

	}

	//getSecondSmallest() method definition 
	private static int getSecondSmallest(int[] arr) {
		for(int i=0;i<arr.length;i++)  //Sorting the array in ascending order (Bubble Sort)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
				}
			}
		}
		return arr[1]; //returning the second element of the sorted array
	}

}
