/**
 * 
 *  @author : Karan Khanna
 * 
 */


/**
 * 
 * Account class contains the account number, balance and the data of thee account, it also contains methods to deposit and wthdraw the money from
 * the account
 * 
 * Account class is also a superclass for SavingsAccount and CurrentAccount classes
 *
 */
public class Account {
	long accNum;
	double balance;
	Person accHolder;
	
	//Deposits balance to the account
	public void deposit(double balance)
	{
		if(this.balance == 0d)
		{
			this.balance = balance;
		}
		else
			this.balance += balance;
	}
	
	//Withdraws the amount from the account
	public void withdraw(double amount)
	{
		if(this.balance != 0d)
		{
			this.balance = this.balance - amount;
		}
		else
			System.out.println("Account is Empty");
	}
	
	/*
	 * 
	 * Getters and Setters
	 */
	public double getBalance()
	{
		return this.balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public long getAccNum()
	{
		return this.accNum;
	}
	public void setAccNum()
	{

		this.accNum = System.currentTimeMillis();
	}
	public Person getAccHolder()
	{
		return this.accHolder;
	}
	public void setAccHolder(Person accHolder)
	{
		this.accHolder = accHolder;
	}
	
	

}
