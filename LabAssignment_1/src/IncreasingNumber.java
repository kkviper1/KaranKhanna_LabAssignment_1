/**
 * 
 * @author karan
 *
 *	Desc : Find if a digit is increasing or not
 *
 */

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		
		System.out.println("Enter a number : ");
		number = sc.nextInt();
		if(checkNumber(number) == true)
		{
			System.out.println("Yes the number is increasing");
		}
		else
			System.out.println("The number is not increasing");
		
	}

	private static boolean checkNumber(int number) {
		int temporaryNumber = number;
		int lastDigit = number%10;
		boolean result = false;
		
		while(temporaryNumber !=0)
		{
			temporaryNumber = temporaryNumber/10;
			if(temporaryNumber%10 < lastDigit)
			{
				result = true;
			}
			else
			{
				result = false;
				break;
			}
			lastDigit = temporaryNumber;
		}
		
		return result;
	}

}
