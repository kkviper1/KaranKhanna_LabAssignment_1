/**
 * 
 * @author Karan Khanna
 *	Desc : Find the nth digit of the fibonacci series
 */
public class Fibonacci {
	
	static int n = 10;
	
	public static void main(String[] args) {
		System.out.println("The 10th term of the Fibonacci series displayed Non-Recursively : ");
		nonRecursiveFibonacci(n);
		System.out.println("The 10th term of the Fibonacci series displayed Recursively : ");
		recursiveFibonacci(1,1,1);

	}

	private static void recursiveFibonacci(int firstNumber, int SecondNumber, int n) {
		int temporaryNumber = SecondNumber;
		int count = n;
		SecondNumber += firstNumber;
		firstNumber = temporaryNumber;
		if(count == Fibonacci.n)
			System.out.println(firstNumber);
		else 
		{
			count++;
			recursiveFibonacci(firstNumber, SecondNumber, count);
		}
	}

	private static void nonRecursiveFibonacci(int n) {
		int firstNumber = 1;
		int secondNumber = 1;
		int temporaryNumber = 0;
		for(int i =0;i<n;i++)
		{
			
			
			temporaryNumber = secondNumber;
			secondNumber += firstNumber;
			firstNumber = temporaryNumber;
		
		}
		System.out.println(firstNumber);
		
		
	}

}
