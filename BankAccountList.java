package com.collection.SavingAccount;


import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;


public class BankAccountList {

	Set<SavingAccount> treeSet = new TreeSet<>(); 
	

	
	 public void addAccount(SavingAccount savAcc)
	  {
		 if(savAcc.getAccHolderName() != null)
		  treeSet.add(savAcc);
		  //System.out.println(savAcc);
	  }
	
	 public void removeAccount(SavingAccount savAcc)
	  {
		
			  treeSet.remove(savAcc);
	  }
	 
	 public void findByIsSalaryAccount()
	 {
		 Predicate<SavingAccount> abc = p -> p.isSalaryAccount() == true;
		 System.out.println(abc);
	 }
	
}
