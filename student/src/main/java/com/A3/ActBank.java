package com.A3;

public class ActBank {
	public int accountId;
	public String accountHolderName;
	public String accountType;
	public int accountBalance;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String string) {
		this.accountHolderName = string;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long l) {
		this.accountBalance = (int) l;
	}
	
	  public void showBankAccountDetails(){
	        System.out.println("Account Id : " + accountId);
	        System.out.println("Account Holder Name : " + accountHolderName);
	        System.out.println("AccountType : " + accountType);
	        System.out.println("AccountBalance : " + accountBalance);

	    }	
}


