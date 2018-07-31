package com.collection.SavingAccount;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class SavingAccountTest {

	public static void main(String args[])
	{
		List<SavingAccount> list = new ArrayList<>();
		SavingAccount savAcc = new SavingAccount(50000, 101, "Mehek", true);
		list.add(savAcc);
		
		SavingAccount savAcc1 = new SavingAccount(60000, 102, "Sylvester", false);
		list.add(savAcc1);
		
		SavingAccount savAcc2 = new SavingAccount(70000, 103, "Natalie", false);
		list.add(savAcc2);
		
		SavingAccount savAcc3 = new SavingAccount(90000, 104, "Ron", true);
		list.add(savAcc3);
		
		SavingAccount savAcc4 = new SavingAccount(30000, 105, "Ryan", true);
		list.add(savAcc4);
		
		list.stream().forEach((list1) -> System.out.println(list1));
	}
	
	
}
