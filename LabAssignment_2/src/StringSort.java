/**
 * 
 * @author karan
 *	Desc : Sorts a string array in alphabetical order
 *
 */

import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		//Declaration, Instantiation and Initialization
		int length;
		Scanner sc = new Scanner(System.in);
		
		//Initializing the length variable for the length of the array
		System.out.println("Enter the number of elements in the array : ");
		length = sc.nextInt();
		
		//Declaring and Instantiating the String array
		String[] arr = new String[length];
		
		//Initializing the array with values
		System.out.println("Enter "+length+" strings : ");
		for(int i =0;i<length;i++)
		{
			arr[i] = sc.next();
		}
		
		//Calling the sortString() method
		String[] result = sortString(arr);
		
		//Printing the result
		for(int i =0;i<length;i++)
		{
			System.out.print(result[i]+"    ");
		}

	}

	
	//Definition of the method sortString which sorts the given string
	private static String[] sortString(String[] arr) {
		int n = arr.length;
		int middle;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++) //Sorting the array in ascending Order (Bubble Sort)
			{
				if(arr[j].compareToIgnoreCase(arr[j+1])>0) /**compareToIgnoreCase compares 
															*two strings and if the output is positive 
															*the string given as argument is 
															*alphabetically lower than the main string
															*while ignoring the case
															*/
				{
					String temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//Initializing the middle value of the length of the array
		if(n%2==0)		//If the length is an even number
		{
			middle = n/2;
		}
		else 			//If the length is an odd number
			middle = (n/2)+1;
		
		//This converts the first half of the array to Upper case and the second half to lower case
		for(int i =0;i<n;i++)
		{
			if(i<middle) 	
			{
				arr[i] = arr[i].toUpperCase(); //Converts first half to uppercase
			}
			else
				arr[i] = arr[i].toLowerCase();	//Converts second half to lowercase
		}
		return arr;
	}

}
