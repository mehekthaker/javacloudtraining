//Tests the working of the framework by creating object instances and calling the methods
public class EntryPointMain {
	
	public static void main(String args[]) 
	{
		//BankFactory mmbankfactory = new MMBankFactory();
		//Creates an object using upcasting
		SavingsAcc mmsavingacc = new MMSavingAcc(102, "Mehek", 8000, true);
		CurrentAcc  mmcurrentacc = new MMCurrentAcc(102, "Mehek", 8000, 2000);
		
		//withdraws 5000 from current account
		mmcurrentacc.withdraw(5000);
		System.out.println(mmcurrentacc);
		
		//deposits 5000 from current account
		mmcurrentacc.deposit(500);
		System.out.println(mmcurrentacc);
		
		//withdraws 5000 from current account
		mmcurrentacc.withdraw(5000);
		System.out.println(mmcurrentacc);
		
		
		System.out.println(mmsavingacc);
		mmsavingacc.withdraw(5000);
		
		System.out.println(mmsavingacc);
		mmsavingacc.withdraw(50000);
		System.out.println(mmsavingacc); //withdrawal fails according to the conditions
		
		SavingsAcc  mmsavingacc2 = new MMSavingAcc(101, "Mehek", 8000, false);
		
		System.out.println(mmsavingacc2);
		mmsavingacc2.withdraw(4000);	//withdrawal fails according to the conditions
		
	}

}
