//inherits class BankAcc and has a parameterized constructor with a credit limit
public abstract class CurrentAcc extends BankAcc{

	private final float creditLimit = 10000f;

//Parameterized constructor of CurrentAcc
	CurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal);
		
	}

//displays the output	
	@Override
	public String toString()
	{
		return "creditLimit [ " + getCreditLimit() + ", toString()=" + super.toString() + "]";
	}
	
//gets the creditLimit value
	public float getCreditLimit()
	{
		return creditLimit;
	}
	
}
