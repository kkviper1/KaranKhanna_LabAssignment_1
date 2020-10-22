/**
 * 
 * @author karan
 *
 *	Desc : Find the Difference between sum of squares and squares of sum of n
 *
 */

public class DifferenceOfSumOfSquare {

	static int n = 10;
	
	public static void main(String[] args) {
		int sum = calculateDifference(n);
		System.out.println("The difference is : "+sum);

	}

	private static int calculateDifference(int n) {
		int sumOfSquares = 0;
		int squareOfSums = 0;
		
		for(int i = 1;i<=n;i++)
		{
			int square = i*i;
			sumOfSquares += square;
		}
		
		int i = 1;
		while(i<=n)
		{
			squareOfSums += i;
			i++;
		}
		squareOfSums = squareOfSums*squareOfSums;
		
		int difference = sumOfSquares - squareOfSums;
		return difference;
	}

}
