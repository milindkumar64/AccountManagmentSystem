package com.bridgelabz;

public class AccountManagementMain extends Account {
	
	public AccountManagementMain(String branchName, int branchCode, String bankIfscCode, int accountNumber,
			String accountHolderName, String accountHolderDob, long accountHolderMobileNumber,
			String accountHolderEmail) {
		super(branchName, branchCode, bankIfscCode, accountNumber, accountHolderName, accountHolderDob,
				accountHolderMobileNumber, accountHolderEmail);
	}

	public static void main(String[] args) {
		
		AccountManagement account1 = new AccountManagement();
       
		account1.addAccountDetails(account1);
		account1.displayAccountDetails();    
	}
}
