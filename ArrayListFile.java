package com.collection.SavingAccount;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ArrayListFile {

	public void save(String file) throws FileNotFoundException
	{
		SavingAccount savAcc[] = new SavingAccount[6];
		PrintWriter pw = new PrintWriter(new FileOutputStream(file));
		for(SavingAccount savAcct: savAcc)
			pw.println(savAcc);
		pw.close();
	}
	
}
