/** 
 * 
 * 
 * 	@author : Karan Khanna
 * 	Desc : Program to display messages according to the color of the traffic light
 * 
 * 
 */

import java.util.Scanner;

import constants.TrafficMessage;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Choose a Traffic Light color (1,2,3) : ");
		System.out.println("1. Red");
		System.out.println("2. Yellow");
		System.out.println("3. Green");
		int choice = sc.nextInt();
		processChoice(choice);

	}

	private static void processChoice(int choice) {
		if(choice == 1)
			System.out.println(TrafficMessage.RED);
		
		if(choice == 2)
			System.out.println(TrafficMessage.YELLOW);
		
		if(choice == 3)
			System.out.println(TrafficMessage.GREEN);
	}

}
