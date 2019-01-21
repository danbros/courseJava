package secao03.entities;

public class Account {
	private final int N_ACCOUNT;
	private String holder;
	private double balance;

	// CONSTRUCTORS
	public Account(int account, String holder) {
		this.N_ACCOUNT = account;
		this.holder = holder;
	}
	
	//public Account(int account, String holder, double balance) {  	//Não consegui usar dois contrutores com sobrecarga
	//	this.N_ACCOUNT = account;
	//	this.holder = holder;
	//	this.balance = balance;
	//}
	
	// METHODS
	public void deposit(double deposit) {
		this.balance += deposit;
	}

	public void withdraw(double withdraw) {
		if(withdraw + 5.00 > balance)
			withdraw = balance - 5.00;
		balance -= withdraw + 5.00;
	}

	// TO STRING
	public String toString() {
		return "Account " 
				+ N_ACCOUNT 
				+ ", Holder: " 
				+ holder 
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);
	}
	
	// GET SET
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccount() {
		return N_ACCOUNT;
	}

}
