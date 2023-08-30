package abstraction;

public class Main {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount("SAVINGS-123", 1000.0, 1.05);
		CheckingAccount checkingAccount = new CheckingAccount("CHECKING-456", 2000.0, 500.0);

		savingsAccount.deposit(600.0);
		checkingAccount.withdraw(200.0);

		savingsAccount.withdraw(800.0);
		checkingAccount.deposit(100.0);

		savingsAccount.displayBalance();
		checkingAccount.displayBalance();
	}
}
