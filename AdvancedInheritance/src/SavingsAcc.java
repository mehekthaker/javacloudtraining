//inherits class BankAcc and has an abstract method withdraw()
public abstract class SavingsAcc extends BankAcc{

	private boolean isSalaried;
	private static final float MINBAL = 10000;
	
	SavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal);
		this.setSalaried(isSalaried);
	}
	
	@Override
	public abstract void withdraw(float amount);
	
//getter and setter for isSalaried
	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

//gets the value of minimum balance
	public static float getMinbal() {
		return MINBAL;
	}
	
//displays the output	
	@Override
	public String toString()
	{
		return "SavingsAcc [isSalaried= " + isSalaried() + ", toString()= " + super.toString() + "]";
	}
	
}
