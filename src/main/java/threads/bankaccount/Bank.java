package threads.bankaccount;

public class Bank {
	public static void main(String[] args) throws InterruptedException {
		BankManager bankManager = new BankManager();

		BankAccount account1 = new BankAccount(1000, 1);
		BankAccount account2 = new BankAccount(1500, 2);
		BankAccount account3 = new BankAccount(2000, 3);

		Transaction transaction1 = new Transaction(account1, account2, 200, bankManager);
		Transaction transaction2 = new Transaction(account2, account3, 300, bankManager);
		Transaction transaction3 = new Transaction(account3, account1, 400, bankManager);

		/*
		*   t1:  account 1: 800, account 2: 1700
		*   t2:  account 2: 1400, account 3: 2300
		*   t3:  account 3: 1900, account 1: 1200
		*
		*   Result: account 1: 1200, account 2: 1400, account 3: 1900
		* */

		transaction1.start();
		transaction1.join();
		transaction2.start();
		transaction2.join();
		transaction3.start();
	}
}
