package threads.bankaccount;

public class Transaction extends Thread {
	private BankAccount fromAccount;
	private BankAccount toAccount;
	private double amount;
	private BankManager manager;

	public Transaction(BankAccount fromAccount, BankAccount toAccount, double amount, BankManager manager) {
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.manager = manager;
	}

	@Override
	public void run() {
		System.out.println("Transfering $" + amount + " from Account "
				+ fromAccount.getAccountNumber() + " to Account " + toAccount.getAccountNumber());
		manager.transferMoney(this);
	}

	public BankAccount getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(BankAccount fromAccount) {
		this.fromAccount = fromAccount;
	}

	public BankAccount getToAccount() {
		return toAccount;
	}

	public void setToAccount(BankAccount toAccount) {
		this.toAccount = toAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
