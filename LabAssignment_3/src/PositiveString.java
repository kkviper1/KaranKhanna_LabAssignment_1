/**
 * 
 * @author karan
 *
 *	Desc: Checks if a given string is positive or not
 */

import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		//Declaration, Instantiation and Initialization
		Scanner sc = new Scanner(System.in);
		String input = new String();
		
		//Takes a string input from the user
		System.out.println("Enter a String");
		input = sc.next();
		
		//Calls the isPositive() method and checks if it return true or false and displays the output accordingly
		if(isPositive(input) == true)
		{
			System.out.println("The string is positive");
		}
		else
			System.out.println("The string is not positive");


	}

	
	//isPositive() method checks whether a given string is a positive string
	private static boolean isPositive(String input) {
		char[] arr = input.toCharArray(); //converts the string to a character array
		boolean result  = true;
		for(int i =0;i<arr.length-1;i++)
		{
			if((arr[i+1] - arr[i]) >= 0) //Subtracts the difference between the next character and the current character
			{								// to check whether the difference is positive or not
				result = true;
			}
			else 
			{
				result = false;
				break;
			}
		}
		return result;
	}

}
