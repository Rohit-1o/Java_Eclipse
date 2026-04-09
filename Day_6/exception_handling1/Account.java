package exception_handling1;

public class Account {
	private int accounts;
	private String name;
	private float balance;
	
	public Account() {
		
	}

	public Account(int accounts, String name, float valance) {
		super();
		this.accounts = accounts;
		this.name = name;
		this.balance = valance;
	}

	public int getAccounts() {
		return accounts;
	}

	public void setAccounts(int accounts) {
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setValance(float balance) {
		this.balance = balance;
	}
	
	
	
	public void deposit (float amount) {
		balance += amount;
	}
	public void withdraw(float amount) throws InsufficientBalanceException {
		//InsufficientBalanceException if balance is insufficient
		if (balance < amount) {
			String error = "Unable to withdraw due to insufficient balance";
			InsufficientBalanceException ix = new InsufficientBalanceException(error, balance);
			throw ix;	
		}
		balance -= amount;
	}

	@Override
	public String toString() {
		return "Account [accounts=" + accounts + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
