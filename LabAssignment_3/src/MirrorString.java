/**
 * 
 * @author karan
 * 
 *  Desc: Mirrors the input string separated by a pipe (|) symbol
 *
 */

import java.util.*;

//Class Definition
class GetImage{
	//Method getImage reverses the string and concatenates it to the existing string separated by a | symbol
	String getImage(String str)
	{
		String result = new String();
		result = str;  //Assigns the input string to a temporary variable
		StringBuffer sb = new StringBuffer(str);   //Creates a new object of type StringBuffer
		sb.reverse(); 				//Reverses the input string
		result = result + "|" + sb;  //Concatenates it to the input string
		return result;
	}
}

public class MirrorString {

	public static void main(String[] args) {
		//Declaration, Instantiation and Initialization
		Scanner sc = new Scanner(System.in);
		String input = new String();
		String result;
		GetImage getImageObject = new GetImage();
		
		//Taking the string input
		System.out.println("Enter a String : ");
		input = sc.next();
		
		//Calling the getImage function and printing it
		result = getImageObject.getImage(input);
		System.out.println(result);
		

	}

}
