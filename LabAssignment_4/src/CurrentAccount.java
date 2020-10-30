/**
 * 
 * @author karan
 *
 */

/*
 * CurrentAccount class extends Account superclass by adding functionalities specific to Current Accounts i.e overdraft limit
 * and overriding withdraw method to check whether the withdrawal is overdrafted or not
 * 
 */
public class CurrentAccount extends Account {
		double overdraftLimit;
		
		//withdraw method is overriden to check for overdraft or not
		@Override
		public void withdraw(double amount)
		{
			if(amount >= this.overdraftLimit)
			{
				System.out.println("Overdrafted");
			}
			else
			{
				super.balance -= amount;
			}
			
		}
		
		//Getters, setters and constructor
		public double getOverdraftLimit()
		{
			return this.overdraftLimit;
		}
		
		public void setOverdraftLimit(double overdraftLimit)
		{
			this.overdraftLimit = overdraftLimit;
		}
		
		public CurrentAccount(double balance, Person person, double overdraftLimit)
		{
			super.setBalance(balance);
			super.setAccHolder(person);
			this.setOverdraftLimit(overdraftLimit);
		}
}
