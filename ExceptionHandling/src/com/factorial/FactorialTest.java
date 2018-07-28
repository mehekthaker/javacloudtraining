package com.factorial;

import java.util.Scanner;

public class FactorialTest {
	
	public static void main(String args[])
	{
		Factorial factorial = new Factorial();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number = scanner.nextInt();
		
		try 
		{
			int fact = factorial.getFactorial(number);
			System.out.println("The factorial of "+number+" is "+fact);
		}
		catch(InvalidInputException iie) 
		{
			iie.printStackTrace();
		}
		catch(FactorialException fe) 
		{
			fe.printStackTrace();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}
