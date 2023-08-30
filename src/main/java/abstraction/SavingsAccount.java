package abstraction;

public class SavingsAccount extends BankAccount{
	private double interestRate;

	SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	@Override
	public void deposit(double amount) {
		if(amount > 0) {
			super.balance += amount;
			System.out.println("Deposited: " + amount);
			super.balance *= interestRate;
		}
	}

	@Override
	public void withdraw(double amount) {
		if(amount > 0 && amount <= super.balance) {
			super.balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		}
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
