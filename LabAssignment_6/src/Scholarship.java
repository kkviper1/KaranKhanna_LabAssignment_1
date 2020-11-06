import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * Calculates the eligibility of each student's scholarship according to their marks
 * @author karan
 *
 */
public class Scholarship {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaration, Instantiation and Initialization
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Double> studentMarks = new HashMap<>();
		int counter = 0;
		
		/**
		 * Menu code to add student details to the HashMap
		 */
		while(counter == 0)
		{
			
			System.out.println("Enter your choice : ");
			System.out.println("1. Add student details");
			System.out.println("2. No more details to be added");
			int choice = sc.nextInt();
			
			switch(choice) 
			{
			case 1 :
				System.out.println("Enter the registration number of the student : ");
				int regNo = sc.nextInt();
				System.out.println("Enter the marks of the student : ");
				double marks = sc.nextDouble();
				studentMarks.put(regNo, marks);
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
		 * getStudents() method is called which provides a HashMap of the student's information (registration number and marks) as the parameter
		 * and a HashMap of the students registration number and their appropriate medal is returned
		 * This HashMap is then printed
		 */
		HashMap<Integer, String> studentResults = getStudents(studentMarks);
		System.out.println(studentResults);
		sc.close();

	}

	/**
	 * The method takes a hashmap of the student's registration number and their marks and calculates what scholarship medal should the student receive
	 * The result is given as a hashmap and returned
	 * 
	 * @param studentMarks
	 * @return result
	 */
	private static HashMap<Integer, String> getStudents(HashMap<Integer, Double> studentMarks) {
		HashMap<Integer, String> result = new HashMap<>();
		Iterator iterator = studentMarks.entrySet().iterator();

		while(iterator.hasNext())
		{
			Map.Entry mapElement = (Map.Entry)iterator.next(); 
			String medal;
			double marks = (double)mapElement.getValue();
			int regNo = (int)mapElement.getKey();
			if(marks >= 90)
			{
				medal = "Gold";
			}
			else if(marks >=80)
			{
				medal = "Silver";
			}
			else if(marks >=70)
			{
				medal = "Bronze";
			}
			else
				medal = "No Medal";
			
			result.put(regNo, medal);
		}
		return result;
	}

}
