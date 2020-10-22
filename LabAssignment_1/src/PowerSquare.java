/**
 * 
 * @author karan
 *
 *	Desc: Check if a number is a power of two or not
 *
 */
import java.util.Scanner;


public class PowerSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		
		if(checkNumber(n) == true)
		{
			System.out.println("The number is a power of 2");
		}
		else
			System.out.println("The number is not a power of 2");

	}

	private static boolean checkNumber(int n) {
		boolean result = false;
		while(n!=2)
		{
			n=n/2;
			if(n%2==0)
			{
				result = true;
			}
			else
			{
				result = false;
				break;
			}
		}
		return result;
	}

}
