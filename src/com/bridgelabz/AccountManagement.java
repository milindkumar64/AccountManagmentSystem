package com.bridgelabz;

import java.util.Scanner;

public class AccountManagement extends Account {

	public AccountManagement(String branchName, int branchCode, String bankIfscCode, int accountNumber,
			String accountHolderName, String accountHolderDob, long accountHolderMobileNumber,
			String accountHolderEmail) {
		super(branchName, branchCode, bankIfscCode, accountNumber, accountHolderName, accountHolderDob,
				accountHolderMobileNumber, accountHolderEmail);

	}
	public  AccountManagement()
	{
		super();
	}

	 void  addAccountDetails(AccountManagement account1) {
		
		Scanner sc = new Scanner(System.in);
		//AccountManagement account1 = new AccountManagement();
		
		System.out.println("Enter Branch name ");
		String branchName = sc.nextLine();
		account1.setBranchName(branchName);
		
		System.out.println("Enter Branch IFSC code ");
		int branchCode = sc.nextInt();
		account1.setBranchCode(branchCode);

		System.out.println("Enter Branch code ");
		String bankIfscCode = sc.next();
		account1.setBankIfscCode(bankIfscCode);
		
		System.out.println("Enter Account Number ");
		int accountNumber = sc.nextInt();
		account1.setAccountNumber(accountNumber);
		
		System.out.println("Enter accountHolderName ");
		String accountHolderName = sc.next();
		account1.setAccountHolderName(accountHolderName);
		
		System.out.println("Enter accountHolderDob ");
		String accountHolderDob = sc.next();
		account1.setAccountHolderDob(accountHolderDob);
	
		System.out.println("Enter accountHolderMobileNumber ");
		int accountHolderMobileNumber = sc.nextInt();
		account1.setAccountHolderMobileNumber(accountHolderMobileNumber);
		
		System.out.println("Enter accountHolderEmail ");
		String accountHolderEmail = sc.next();
		account1.setAccountHolderEmail(accountHolderEmail);
      		
	}

	 void displayAccountDetails() {
        
		System.out.println("branchName "+branchName);
		System.out.println("branchCode "+branchCode);
		System.out.println("bankIfscCode "+bankIfscCode);
		System.out.println("accountNumber "+accountNumber);
		System.out.println("accountHolderName "+accountHolderName);
		System.out.println("accountHolderDob "+accountHolderDob);
		System.out.println("accountHolderMobileNumber "+accountHolderMobileNumber);
		System.out.println("accountHolderEmail "+accountHolderEmail);
		
	}
}
