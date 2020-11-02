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
 * 
 *  MyException1 class defines a user defines exception that validates whether the age is less than 15 or not
 * @author karan
 *
 */
class MyException1 extends Exception
{
	String str1;

	MyException1()
	{
		str1 = "Age is less than 15";
	}

	@Override
	public String toString() {
		return(str1);
	}
}


// Class name should be "Source",
// otherwise solution won't be accepted
public class AgeException {
	public static void main(String args[] ) throws Exception {


		try(Scanner sc = new Scanner(System.in)) {
			int age = sc.nextInt(); 
			System.out.println(checkAge(age));
			}
		catch(MyException1 e){
			e.printStackTrace();
		}
	}

	/**
	 * checkAge validates the age given by the user and throws an exception if the age is less than 15
	 * @param age
	 * @return
	 * @throws MyException1
	 */
	public static String checkAge(int age) throws MyException1

	{
			if(age < 15)
			{
				throw new MyException1();
			}
			else
				return "valid";
	}
}