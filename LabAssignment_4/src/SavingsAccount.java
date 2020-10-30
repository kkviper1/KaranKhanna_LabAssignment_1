/**
 * 
 * @author karan
 *
 */


/*
 * 
 * SavingsAccount extends the Account superclass by adding functionalities specific to Savings Account i.e minimum balance
 * and a check for having minimum balance whenever amount is withdrawn bu overriding the withdraw method
 * 
 */
public class SavingsAccount extends Account{
	private double minimumBalance;
	
	/*
	 * Withdraws the amount from the account by first checking if the balance is minimum or not
	 * If the balance is minimum no cash is withdrawn else money is withdrawn
	 */
	
	
	@Override
	public void withdraw(double amount)			
	{
		if(super.balance >= this.minimumBalance)
		{
			super.balance = super.balance - amount;
		}
		else
			System.out.println("Can't withdraw");
	}
	
	//Getters, Setters and Constructor
	public double getMinimumBalance()
	{
		return this.minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance)
	{
		this.minimumBalance = minimumBalance;
	}
	
	public SavingsAccount(double balance, Person person, double minimumBalance)
	{
		super.setBalance(balance);
		super.setAccHolder(person);
		this.setMinimumBalance(minimumBalance);
	}

}
