/**
 * 
 * 
 * @author karan
 * 
 * 	Desc : Counts the number of lines, words and letters in a text file and displays it
 *
 */


import java.io.*;


public class TextCount {

	public static void main(String[] args) throws FileNotFoundException {
		//Declaration , Initialization and Instantiation 
		BufferedReader fr = new BufferedReader(new FileReader("file.txt")); //Reads the file
		int lineCount = 0, wordCount = 0, charCount = 0;
		
		try {										
			String currentLine = fr.readLine(); //Reads the first line of the text file and returns it to a String
			while(currentLine != null) //Loop runs until the last line
			{
				lineCount++;  //Increments everytime the loop runs
				
				String[] words = currentLine.split(" "); //Splits the line into seperate words and saves it into a String array
				wordCount +=  words.length; //counts the length of the array i.e the number of words in the line and adds it to the count
				
				for(String str : words) //iterates over each word in the line
				{
					charCount += str.length(); //counts the length of the string i.e the number of letters and adds it to the count
				}
				currentLine = fr.readLine(); //reads the next line
			}
			
			//Prints the result
			System.out.println("The number of lines in the text file are : "+lineCount);
			System.out.println("The number of words in the text file are : "+wordCount);
			System.out.println("The number of characters in the text file are : "+charCount);
			
		} catch (IOException e) {
			System.out.println("The file is empty");  //Exception handling in case the file is empty
			e.printStackTrace();
		}
		
		
		

	}

}
