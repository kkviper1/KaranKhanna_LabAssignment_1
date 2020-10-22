/**
 * 
 * @author karan
 *	Desc : Calculate the sum of first n natural numbers that are divisble by 3 or 5
 *
 */
public class SumCalculate {
	
	static int n = 50;

	public static void main(String[] args) {
		int sum = calculateSum(n);
		System.out.println("The sum of the numbers are : "+sum);

	}

	private static int calculateSum(int n) {
		int sumOfNumbers = 0;
		
		for(int i = 3;i<=n;i++)
		{
			if( i%3 == 0 || i%5 == 0)
			{
				sumOfNumbers += i;
			}
		}
		
			return sumOfNumbers;
	}

}
