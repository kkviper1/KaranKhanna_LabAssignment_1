
/**
 * 
 * @author karan
 * 
 * 	Desc : Manages a Car Parking System
 *
 */

import java.util.Scanner;

class Car {
	public String carName;
	public String registrationNo;

	Car(String carName, String registrationNo) {
		this.carName = carName;
		this.registrationNo = registrationNo;
	}
}

public class CarPark {

	public static void main(String[] args) {
		//Declaration, Instantiation and Initialization 
		int n = 0;
		Scanner sc = new Scanner(System.in);
		Car parking[][] = new Car[5][];
		parking[0] = new Car[100];
		parking[1] = new Car[70];
		parking[2] = new Car[50];
		parking[3] = new Car[20];
		parking[4] = new Car[10];
		
		//Code block for menu
		while (n == 0) {
			System.out.println("Enter your choice : ");
			System.out.println("1. Park Car");
			System.out.println("2. Get Car");
			System.out.println("3. Find Empty Parking");
			System.out.println("4. Exit");
			String choice = sc.next();

			switch (choice) {
			case "1":
				parkCar(parking); //Calls parkCar() method
				break;
			case "2":
				getCar(parking);	//Calls getkCar() method
				break;
			case "3":
				emptyParking(parking);	//Calls emptyParking() method
				break;
			case "4":
				n = 1;
				break;
			default:
				break;

			}
		}
	}

	//Method displays the first empty parking spot it finds
	private static void emptyParking(Car[][] parking) {

		//labeled loop as outerloop to easily break from the loop
		outerloop: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < parking[i].length; j++) {
				if (parking[i][j] == null) {
					System.out.println("The Empty Parking spot is at level " + (i + 1) + 
							" position " + (j + 1)); //displays the parking spot
					break outerloop;
				} else
					System.out.println("No Empty Parking"); //if there are no empty parking spots
			}
		}

	}

	
	//Method traverses through the arrays to find the specific car
	private static void getCar(Car[][] parking) {
		Scanner sc = new Scanner(System.in);
		String registrationNo;
		int level = 0, no = 0;

		System.out.println("Enter the Registration Number of the car : ");
		registrationNo = sc.next();

		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < parking[i].length; j++) {
				if (parking[i][j] != null) {  //if the car parking is not empty
					Car obj = parking[i][j];
					String rn = obj.registrationNo;
					if (registrationNo.equalsIgnoreCase(rn)) { //if the registration number of the car matches
						level = i + 1;
						no = j + 1;
						parking[i][j] = null; 	//Empties the parking 
					}
				}
			}
		}
		
		//displays the result
		if (level != 0 && no != 0)  //if the car was found 
			System.out.println("The car is parked at level " + level + " and position " + no);
		else //if the car wasn't found
			System.out.println("Your car wasn't found");
	}

	//Method takes car details from the user and parks it in the first available parking space
	private static void parkCar(Car[][] parking) {
		Scanner sc = new Scanner(System.in);
		String name;
		String number;

		System.out.println("Enter Owner Name : ");
		name = sc.next();
		System.out.println("Enter the Registration No : ");
		number = sc.next();
		Car car = new Car(name, number);  //Creates an object of Car class

		//Labeled the loop as outerloop to easily break from the loop
		outerloop: for (int i = 0; i < 5; i++) {  
			for (int j = 0; j < parking[i].length; j++) {
				if (parking[i][j] == null) { //if the parking is empty
					parking[i][j] = car;  //assigns the car to the parking space
					System.out.println("Car parked at level " + (i + 1) + " position " + (j + 1));  //confirms and displays the parking spot
					break outerloop;
				}
				else
					System.out.println("No Empty Parking");  //If there are no empty parking spots
			}
		}

	}

}
