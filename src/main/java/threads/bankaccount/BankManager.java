package threads.bankaccount;

public class BankManager {
	public void transferMoney(Transaction transaction) {
		synchronized (transaction.getFromAccount()) {
			synchronized (transaction.getToAccount()) {
				if(transaction.getFromAccount().getBalance() >= transaction.getAmount()) {
					transaction.getFromAccount().withdraw(transaction.getAmount());
					transaction.getToAccount().deposit(transaction.getAmount());

					System.out.println("Transfer COMPLETED from account: " + transaction.getFromAccount().getAccountNumber());

					System.out.println("Account " + transaction.getFromAccount().getAccountNumber() +
							" has a balance of: $" + transaction.getFromAccount().getBalance());
					System.out.println("Account " + transaction.getToAccount().getAccountNumber() +
							" has a balance of: $" + transaction.getToAccount().getBalance());
				} else {
					System.out.println("Transfer failed due to insufficient funds.");
				}
			}
		}
	}
}
