/**
 * 
 * @author karan
 *
 *	Desc: Program to display the sum of the cube of the digits of a number
 *
 *
 */
public class CubeSum {

	public static void main(String[] args) {
		int result = sumCube(1234);
		System.out.println("The result is : "+result);

	}

	private static int sumCube(int num) {
		int temporaryNumber = num;
		int count = 0;
		int singleDigit;
		int sum = 0;
		
		while(temporaryNumber !=0)
		{
			temporaryNumber = temporaryNumber/10;
			count++;
		}
		
		for(int i =1;i<=count;i++)
		{
			singleDigit = num%10;
			num = num/10;
			sum = sum + (singleDigit*singleDigit*singleDigit);
		}
		return sum;
	}

}
