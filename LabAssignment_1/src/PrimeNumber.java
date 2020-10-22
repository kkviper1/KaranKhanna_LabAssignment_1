/**
 * 
 * @author karan
 *	Desc : Find all the prime numbers upto the given integer
 *
 */

import java.util.Scanner;

public class PrimeNumber {

	static int limit;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer : ");
		limit = sc.nextInt();
		findPrime(limit);

	}

	private static void findPrime(int limit) {
		int primeValue = 0;
		
		for(int i = 1;i<=limit;i++)
		{
			int counter = 0;
			for(int j = i;j>=1;j--)
			{
				if(i%j==0)
				{	
					counter = counter + 1;
				}
				
			}
			primeValue = i;
			if(counter == 2)
				System.out.print(primeValue + " ");
		}
		
	}

}
