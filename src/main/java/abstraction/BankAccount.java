package abstraction;

public abstract class BankAccount {
	protected String accountNumber;
	protected double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);

	public void displayBalance() {
		System.out.println("Account number is: " + accountNumber);
		System.out.println("Current balance is: " + balance);
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
