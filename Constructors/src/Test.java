//Define a class "base1" with only parameterized constructor. Derive a class "sub1" from "base1"
//This class should have following constructors Default, one parameter, two parameter
//Now try to instantiate "sub1" using any of the above mentioned constructors

public class Test {

	public static void main(String args[])
	{
		Sub1 sub = new Sub1();
		System.out.println("---------------------------------------------------------------");
		Sub1 sub1 = new Sub1(100);
		System.out.println("---------------------------------------------------------------");
		Sub1 sub2 = new Sub1(1000,200);
		System.out.println("---------------------------------------------------------------");
		
	}
	
}
