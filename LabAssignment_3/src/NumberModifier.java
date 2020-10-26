/**
 * 
 * @author karan
 * 
 * 	Desc: Accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. 
 *
 */

import java.util.Scanner;


public class NumberModifier {

	public static void main(String[] args) {
		//Declaration, Instantiation and Initialization
		Scanner sc = new Scanner(System.in);
		int input;
		int output;
		
		//Takes the integer input
		System.out.println("Enter the number : ");
		input = sc.nextInt();
		
		//calls the modifyNumber() method and returns it to variable output
		output = modifyNumber(input);
		
		//prints the output
		System.out.println("The new number is : "+output);
		
		

	}

	//Method definition of modifyNumber()
	private static int modifyNumber(int input) {
		String parser = Integer.toString(input); //Converts the integer to a string 
		char[] arr = parser.toCharArray();;  //Converts the string to a character array
		StringBuffer result = new StringBuffer();
		
		for(int i=0;i<arr.length;i++)
		{
			if(i!=(arr.length-1))  //If the character isn't the digit in the units place
			{
				int n = arr[i] - arr[i+1];  /**Directly subtracts the character without needing to convert it into an
											* as both methods give the same result and not converting into integer
											* saves complexity
											*/	
				n = (Math.abs(n));			//Takes the absolute value
				result.append(n);			//The difference is appended to the StringBuffer
			}
			else	//If the character is the digit in the units place
			{
				int n = Character.getNumericValue(arr[i]);  //Character is converted to an integer and then assigned to the integer variable
				result.append(n); 	//The integer is appended to the StringBuffer
			}
		}
		
		int newNumber = Integer.parseInt(result.toString());  //StringBuffer is converted to String and then to Integer
		return newNumber;
	}

}
