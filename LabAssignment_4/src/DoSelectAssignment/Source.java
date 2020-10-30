/**
 * 
 * @author karan
 * 
 * Desc : Provides functionality for adding items to a library that can contain either written items like journal papers or media items like CDs
 * and videos
 * 
 */

import java.awt.print.Book;
import java.util.*;

//Driver class and menu
public class Source
{

    public static void main(String[] args) {
    	//Declaration, Instantiation and Initialization
    	Scanner sc = new Scanner(System.in);
    	int choice;
    	int i = 0;
    	int id,copies;
    	String title, genre;
    	int yearOfRelease;
    	
    	//Menu Implementation using switch case
    	while(i==0)
    	{
    		System.out.println("What do you wanna add to the library:");
    		System.out.println("1. Journal Papers");
    		System.out.println("2. CDs");
    		System.out.println("3. Videos");
    		System.out.println("4. Exit");
    		choice = sc.nextInt();
    		
    		switch (choice)
    		{
    		//Adds a Journal Paper Item
    		case 1 :
    			System.out.println("Enter ID");
    			id = sc.nextInt();
    			System.out.println("Enter Title");
    			title = sc.next();
    			System.out.println("Enter no of copies");
    			copies = sc.nextInt();
    			System.out.println("Enter the name of the author");
    			String authorName = sc.next();
    			System.out.println("Enter the name of the publisher");
    			String publicationName = sc.next();
    			System.out.println("Enter the no of pages");
    			int noOfPages = sc.nextInt();
    			System.out.println("Enter the year published");
    			int yearPublished = sc.nextInt();
    			Item journalItem = new JournalPaper(id, title, copies, authorName, publicationName, noOfPages, yearPublished);
    			System.out.println("----------Review Data Added------------");
    			System.out.println(journalItem.print());
    			break;
    		
    			//Adds a CD Item
    		case 2 :
    			System.out.println("Enter ID");
    			id = sc.nextInt();
    			System.out.println("Enter Title");
    			title = sc.next();
    			System.out.println("Enter no of copies");
    			copies = sc.nextInt();
    			System.out.println("Enter the year of release");
    			yearOfRelease = sc.nextInt();
    			System.out.println("Enter the genre");
    			genre = sc.next();
    			System.out.println("Enter the name of the artist");
    			String artist = sc.next();
    			Item cdItem = new CD(id, title, copies, yearOfRelease, genre, artist);
    			System.out.println("----------Review Data Added------------");
    			System.out.println(cdItem.print());
    			break;
    			
    			//Adds a Video Item
    		case 3 :
    			System.out.println("Enter ID");
    			id = sc.nextInt();
    			System.out.println("Enter Title");
    			title = sc.next();
    			System.out.println("Enter no of copies");
    			copies = sc.nextInt();
    			System.out.println("Enter the year of release");
    			yearOfRelease = sc.nextInt();
    			System.out.println("Enter the genre");
    			genre = sc.next();
    			System.out.println("Enter the name of the director");
    			String director = sc.next();
    			Item videoItem = new Video(id, title, copies, yearOfRelease, genre, director);
    			System.out.println("----------Review Data Added------------");
    			System.out.println(videoItem.print());
    			break;
    			
    			//Exits the program
    		case 4 :
    			i = 1;
    			break;
    			
    			//Default case 
    		default :
    			System.out.println("Wrong choice");
    			break;
    			
    		}
    	}
    }

}
