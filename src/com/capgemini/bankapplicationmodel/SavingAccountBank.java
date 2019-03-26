package com.capgemini.bankapplicationmodel;

public class SavingAccountBank extends AccountBank {
	private boolean salaryAccount;
	public static final double MINIMUM_BALANCE=1000;
	
	public SavingAccountBank() {
	
	}

	public SavingAccountBank(long accountId, String accountHolderName, double accountBalance ,boolean salaryAccount) {
		super(accountId, accountHolderName, "SAVING", accountBalance);
		this.salaryAccount=salaryAccount;
	}
	
	public boolean isSalaryAccount() {
		return  salaryAccount;
	}
	
	public void setSalaryAccount() {
		this.salaryAccount=salaryAccount;
	}

	@Override
	public double withdraw(double amount) {
		
		if(salaryAccount) {
			return super.withdraw(amount);
		}
		else {
			if(getAccountBalance() - amount >= MINIMUM_BALANCE)
				setAccountBalance(getAccountBalance() - amount); 
			else
				System.out.println("you don't have sufficient fund.");
			return getAccountBalance();
		}
	}
	
	
}
