/**
 * 
 */

/**
 * @author karan
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * MyException class defines a user defined exception when the names passed are null
 *  
 * @author karan
 *
 */

class MyException extends Exception
{
	String str1;
	

	MyException(String str2)
	{
		str1=str2;
	}

	MyException()
	{
		str1 = "Names cant be null";
	}

	public String toString()
		{
			return(str1);
		}
	
	}



// Class name should be "Source",
// otherwise solution won't be accepted
public class FirstLastName {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr = input.split("\\s+");
		String firstName = arr[0];
		String lastName = arr[1];
		try{
		System.out.println(checkName(firstName, lastName));
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
		sc.close();
		}

	/**
	 * Checks if the names are null else concatinates them in one String and returns the string
	 * @param firstName
	 * @param lastName
	 * @return
	 * @throws MyException
	 */
	public static String checkName(String firstName, String lastName) throws MyException
	{
		if(firstName == null || lastName == null)
		{
			throw new MyException("Names are null");
		}
		String result = firstName+lastName;
		return result;
	}
}