/**
 * 
 *	Desc : Creates a savings or current account for any person and checks for minimum balance in the case of savings acoount
 *			or checks for overdraft limit in the case of current account
 *
 * 
 * @author karan
 *
 *
 */

//Driver Class and method
public class Source {

	public static void main(String[] args) {
			Person kathy = new Person("Kathy", 21f);
			Person smith = new Person("Smith", 25f);
			Account savings = new SavingsAccount(3000d, kathy, 1000d);
			Account current = new CurrentAccount(0d,smith, 2000d);
			current.deposit(2000);
			savings.withdraw(2000);
			System.out.println("Balance in Kathy's "+savings.getAccNum() +" account is : "+savings.getBalance());
			System.out.println("Balance in Smith's "+current.getAccNum() +" account is : "+current.getBalance());

	}

}
