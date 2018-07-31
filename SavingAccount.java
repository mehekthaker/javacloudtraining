package com.collection.SavingAccount;

public class SavingAccount implements Comparable<SavingAccount>{
	
	private double accBalance;
	private int accId;
	private String accHolderName;
	private boolean isSalaryAccount;
	private static final float MINBAL = 10000;
	
	public SavingAccount(double accBalance, int accId, String accHolderName, boolean isSalaryAccount) {
		this.accBalance=accBalance;
		this.accId=accId;
		this.accHolderName=accHolderName;
		this.isSalaryAccount=isSalaryAccount;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accId;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (accId != other.accId)
			return false;
		return true;
	}

	//gets the value of minimum balance 
	 public static float getMinbal() { 
	 return MINBAL; 
	 } 


	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}


	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}


	public double getAccBalance() {
		return accBalance;
	}


	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}


	public int getAccId() {
		return accId;
	}


	public void setAccId(int accId) {
		this.accId = accId;
	}


	public String getAccHolderName() {
		return accHolderName;
	}


	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	
	
	public void withdraw(float amount) 
	 { 
		if(isSalaryAccount()) 
		{ 
			if((getAccBalance() - amount) >= 0) 
			{ 
				setAccBalance(getAccBalance() - amount); 
			} 
			else  
				System.out.println("Withdrawal Failed"); 
		} 
		else  
		{ 
		 if((getAccBalance() - amount) >= getMinbal()) 
		 { 
			 setAccBalance(getAccBalance() - amount); 
		 } 
		 else  
			 System.out.println("Withdrawal Failed"); 
	 	} 
	 } 


	
	public void deposit(float amount)
	{
		accBalance = accBalance + amount;
	}
	
	
	@Override
	public String toString() 
	{
		return "Savings Account [Account Balance = "+getAccBalance()+", Account Id = "+getAccId()+", Account Holder Name= "+getAccHolderName()+", isSalaried= "+isSalaryAccount()+"]";
	}


	@Override
	public int compareTo(SavingAccount savAcc) {
		
		return this.accId - savAcc.accId;
	}
	
}
