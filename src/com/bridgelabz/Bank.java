package com.bridgelabz;

public class Bank {

	String branchName;
	int branchCode;
	String bankIfscCode;
	
	public Bank(String branchName, int branchCode, String bankIfscCode) {
		super();
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.bankIfscCode = bankIfscCode;
	}
    public Bank()
    {
    	
    }
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public String getBankIfscCode() {
		return bankIfscCode;
	}

	public void setBankIfscCode(String bankIfscCode) {
		this.bankIfscCode = bankIfscCode;
	}
	
	
}
