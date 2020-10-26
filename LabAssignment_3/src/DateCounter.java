/**
 * 
 * 
 * @author karan
 *
 *	Desc : Tells the difference between the current date and the given date from the user
 *
 *	
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.*;

public class DateCounter {

	public static void main(String[] args) {
		//Declaration, Instantiation and Initialization
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date(); 
	    String formattedDate = formatter.format(date); //Formats the current date in dd/MM/yyyy format
	    Scanner sc = new Scanner(System.in);
	    String inputDate = new String();
	    String regex = "[0-3][0-9][/][0-1][0-9][/][0-9][0-9][0-9][0-9]"; //Regex to validate the date format from the user
	    Pattern p = Pattern.compile(regex);
	    
	    //Takes the date input from the user
	    System.out.println("Enter the date in the format dd/MM/yyyy");
	    inputDate = sc.next();
	    
	    //Validates the string to check whether the date format is correct or not
	    Matcher m = p.matcher(inputDate);
	    if(m.matches() == false) 
	    {
	    	System.out.println("The date is wrong");
	    }
	    else
	    	System.out.println(calculateDate(inputDate , formattedDate)); //if the date format is correct, calculateDate() method is called 

	}

	
	//calculateDate() method takes the current date and the given date and calculates the difference in days, months and years and returns it to the user
	private static String calculateDate(String inputDate, String formattedDate) {
		String[] givenDate = inputDate.split("/");  //Splits both the dates into respective String arrays
		String[] currentDate = formattedDate.split("/");
		int yearDifference = 0;
		int monthDifference = 0;
		int dayDifference = 0;
		
		yearDifference = Math.abs(Integer.parseInt(currentDate[2]) - Integer.parseInt(givenDate[2])); //Calculates the difference in years
		monthDifference = Math.abs(Integer.parseInt(currentDate[1]) - Integer.parseInt(givenDate[1])); //Calculates the difference in months
		dayDifference = Math.abs(Integer.parseInt(currentDate[0]) - Integer.parseInt(givenDate[0])); //Calculates the difference in days
		
		//Saves the results to a string and returns it
		String result = "The difference in the year is "+yearDifference+"\n"
				+"The difference in the month is "+monthDifference+"\n"
				+"The difference in the day is "+dayDifference;
		
		return result;
	}

}
