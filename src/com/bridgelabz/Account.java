package com.bridgelabz;

public class Account extends Bank {
	
	int accountNumber;
	String accountHolderName,accountHolderDob;
    long accountHolderMobileNumber;
    String accountHolderEmail;
	public Account(String branchName, int branchCode, String bankIfscCode, int accountNumber, String accountHolderName,
			String accountHolderDob, long accountHolderMobileNumber, String accountHolderEmail) {
		super(branchName, branchCode, bankIfscCode);
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountHolderDob = accountHolderDob;
		this.accountHolderMobileNumber = accountHolderMobileNumber;
		this.accountHolderEmail = accountHolderEmail;
	}
	public Account()
	{
		super();
	}
		
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderDob() {
		return accountHolderDob;
	}
	public void setAccountHolderDob(String accountHolderDob) {
		this.accountHolderDob = accountHolderDob;
	}
	public long getAccountHolderMobileNumber() {
		return accountHolderMobileNumber;
	}
	public void setAccountHolderMobileNumber(long accountHolderMobileNumber) {
		this.accountHolderMobileNumber = accountHolderMobileNumber;
	}
	public String getAccountHolderEmail() {
		return accountHolderEmail;
	}
	public void setAccountHolderEmail(String accountHolderEmail) {
		this.accountHolderEmail = accountHolderEmail;
	}
    
	
    
    

}
