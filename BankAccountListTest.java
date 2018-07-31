package com.collection.SavingAccount;

public class BankAccountListTest {
	
	public static void main(String args[])
	{
		//List<SavingAccount> list = new ArrayList<>(); 
		
		
		BankAccountList bankAccList = new BankAccountList();
		
	
		SavingAccount savAcc = new SavingAccount(50000, 101, null, true);
		bankAccList.addAccount(savAcc);
		
		SavingAccount savAcc1 = new SavingAccount(60000, 103, "Sylvester", false);
		bankAccList.addAccount(savAcc1);
		
		SavingAccount savAcc2 = new SavingAccount(70000, 103, "Natalie", false);
		bankAccList.addAccount(savAcc2);
		
		SavingAccount savAcc3 = new SavingAccount(90000, 104, "Ron", true);
		bankAccList.addAccount(savAcc3);
		
		SavingAccount savAcc4 = new SavingAccount(30000, 105, "Ryan", true);
		bankAccList.addAccount(savAcc4);
		
		bankAccList.treeSet.stream().forEach((list1) -> System.out.println(list1));
		
		System.out.println("#################################################");
		bankAccList.removeAccount(savAcc1);
		System.out.println("After removing one account");
		bankAccList.treeSet.stream().forEach((list1) -> System.out.println(list1));
		
//		System.out.println("#################################################");
//		bankAccList.findByIsSalaryAccount();
//		//System.out.println();
	}

}
