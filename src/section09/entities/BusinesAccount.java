package section09.entities;

public class BusinesAccount extends Account{

	private Double loanLimit;
	
	public BusinesAccount() {
		super();
	}
	
	public BusinesAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if (amount <= loanLimit) 
			balance += amount - 10.0;
	}
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
