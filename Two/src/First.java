
public class First {

	private int number1 = 30;
	private int number2 = 40;
	
	First()
	{
		System.out.println("Default constructor");
	}

	//setters for both the numbers
	public void setNumber1(int number1) {
		this.number1 = number1;
	}	
	public void setNumber2(int number2) {
		this.number2 = number2;
	}

//Multiply method	
	public int multiply(int number1, int number2) 
	{
		int product = number1*number2;
		System.out.println("Product is "+product);
		return product;
	}
	
//Division method
	public int divide(int number1, int number2) 
	{
		int division = number1/number2;
		System.out.println("Division is "+division);
		return division;
	}
	
	
	
}
