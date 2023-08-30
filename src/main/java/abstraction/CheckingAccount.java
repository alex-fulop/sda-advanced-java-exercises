package abstraction;

public class CheckingAccount extends BankAccount {
	private double withdrawLimit;

	public CheckingAccount(String accountNumber, double balance, double withdrawLimit) {
		super(accountNumber, balance);
		this.withdrawLimit = withdrawLimit;
	}

	@Override
	public void deposit(double amount) {
		if(amount > 0) {
			super.balance += amount;
			System.out.println("Deposited into CheckingAccount: " + amount);
		}
	}

	@Override
	public void withdraw(double amount) {
		if(amount >  0 && amount <= super.balance && amount <= withdrawLimit) {
			super.balance -= amount;
			System.out.println("Withdrawn from CheckingAccount: " + amount);
		}
	}
}
