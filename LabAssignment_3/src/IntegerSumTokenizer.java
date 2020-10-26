/**
 * 
 * @author karan
 * 
 * 	Desc : Takes an input of String of integers and displays their sum
 *
 */

import java.util.*;


public class IntegerSumTokenizer {

	public static void main(String[] args) {
		//Declaration, Instantiation and Initialization
		String integerLine = new String();
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		//Taking the input
		System.out.println("Enter a line of integers with each integer seperated by a comma and no spaces (,) : ");
		integerLine = sc.nextLine();
		StringTokenizer st = new StringTokenizer(integerLine, ","); //Tokenizing the string by seperating each integer 
																	//with a comma
		while(st.hasMoreTokens())									//The loop run untils the StringTokenizer st object no longer has any tokens
		{
			String str = st.nextToken();  //assigns the token into a temporary string variable
			System.out.println(str);      //prints the string
			sum = sum + Integer.parseInt(str); //converts the string into an integer and adds the sum
		}
		System.out.println("The sum of the integers is : "+sum); //prints the sum
		
		

	}

}
