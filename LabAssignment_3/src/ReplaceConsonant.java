/**
 * 
 * @author karan
 * 
 * 	Desc: Replaces the consonants with the next alphabet in a word
 *
 */


import java.util.Scanner;


public class ReplaceConsonant {

	public static void main(String[] args) {
		//Declaration, Instantiation and Initialization
		Scanner sc = new Scanner(System.in);
		String input = new String();
		String result = new String();
		
		//Taking the string input
		System.out.println("Enter the String");
		input = sc.next();
		
		//Calling the alterString method and printing the result
		result = alterString(input);
		System.out.println("The output is : "+result);

	}

	
	//alterString method takes a String and replaces all the consonants with the next alphabet
	private static String alterString(String input) {
		char [] arr = input.toCharArray(); //Converts the string into a character array
		int i = 0;
		
		for(char ch : arr)
		{
			if(isConsonant(ch) == true) //checks if the letter is a consonant using the isConsonant() method
			{
				ch = (char) (ch + 1);  //if the condition is true the character is incremented hence giving us the next alphabet
				arr[i] = ch;  //the character is then replaced in the array
			}
			i++;
		}
		String result = new String(arr); //The char array is then converted back to String
		return result;
	}

	
	//isConsonant method checks whether a character is a consonant or not
	private static boolean isConsonant(char ch) {
		boolean result = false;
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') //checks if the character is a vowel
			result = false;
		else
			result = true;
		return result;
	}

}
