import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * Takes voter information from the user and displays the list of eligible voters
 * @author karan
 *
 */
public class VoterCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaration, Instantiation and Initialization
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> voter = new HashMap<>();
		int counter = 0;
		
		/**
		 * Menu code to add voter details to the HashMap
		 */
		while(counter == 0)
		{
			
			System.out.println("Enter your choice : ");
			System.out.println("1. Add voter details");
			System.out.println("2. No more details to be added");
			int choice = sc.nextInt();
			
			switch(choice) 
			{
			case 1 :
				System.out.println("Enter the voter id : ");
				int id = sc.nextInt();
				System.out.println("Enter the age of voter : ");
				int age = sc.nextInt();
				voter.put(id, age);
				break;
			case 2 :
				counter++;
				break;
			default :
				System.out.println("Wrong choice");
				break;
			}
			
			
		
	}
		
		/**
		 * A list of eligible voters is returned by calling the method votersList()
		 */
		List<Integer> voterList = votersList(voter);
		System.out.println(voterList);
		sc.close();
}

	/**
	 * 
	 * The method takes a HashMap of voter Id and their age. If the age is above 18 the names would be added to a List and returned 
	 * @param voter
	 * @return voterList
	 */
	private static List<Integer> votersList(HashMap<Integer, Integer> voter) {
		List<Integer> voterList = new ArrayList<>();
		Iterator iterator = voter.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry mapElement = (Map.Entry)iterator.next();
			int id;
			int age;
			age = (int)mapElement.getValue();
			id = (int)mapElement.getKey();
			if(age >=18)
			{
				voterList.add(id);
			}
		}
		return voterList;
	}
}