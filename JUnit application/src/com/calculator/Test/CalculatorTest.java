package com.calculator.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.junit.*;
public class CalculatorTest {

//Test conditions for addition	
//TC1	
	@Test
	public void testAddTwoPositive() {
		Maths math = new Maths();
		int ans = math.add(2, 2);
		Assert.assertEquals(4, ans);	
	}
	
//TC2	
	@Test
	public void testAddTwoNegative() {
		Maths math = new Maths();
		int ans = math.add(-2, -2);
		Assert.assertEquals(-4, ans);	
	}
	
//TC3	
	@Test
	public void testAddTwoZeroes() {
		Maths math = new Maths();
		int ans = math.add(0, 0);
		Assert.assertEquals(0, ans);	
	}
	
//TC4	
	@Test
	public void testAddOneZeroesAndOnePositive() {
		Maths math = new Maths();
		int ans = math.add(0, 2);
		Assert.assertEquals(2, ans);	
	}
	
//TC5	
	@Test
	public void testAddOneZeroesAndOneNegative() {
		Maths math = new Maths();
		int ans = math.add(0, -2);
		Assert.assertEquals(-2, ans);	
	}
	
//TC6	
	@Test
	public void testAddOneNegativeAndOneGreaterPositive() {
		Maths math = new Maths();
		int ans = math.add(-2, 8);
		Assert.assertEquals(6, ans);	
	}

//Test conditions for subtraction
//TC7	
	@Test
	public void testSubtractTwoPositives() {
		Maths math = new Maths();
		int ans = math.subtract(2, 2);
		Assert.assertEquals(0, ans);		
	}
	
//TC8	
	@Test
	public void testSubtractTwoNegatives() {
		Maths math = new Maths();
		int ans = math.subtract(-2, -2);
		Assert.assertEquals(0, ans);		
	}
	
//TC9	
	@Test
	public void testSubtractFirstNegativeAndSecondPositive() {
		Maths math = new Maths();
		int ans = math.subtract(-2, 8);
		Assert.assertEquals(-10, ans);		
	}
	
//TC10	
	@Test
	public void testSubtractFirstPositiveAndSecondNegative() {
		Maths math = new Maths();
		int ans = math.subtract(8, -2);
		Assert.assertEquals(10, ans);		
	}
	
//TC11	
	@Test
	public void testSubtractFirstZeroAndSecondNegative() {
		Maths math = new Maths();
		int ans = math.subtract(0, -2);
		Assert.assertEquals(2, ans);		
	}
	
//TC12	
	@Test
	public void testSubtractFirstNegativeAndSecondZero() {
		Maths math = new Maths();
		int ans = math.subtract(-2, 0);
		Assert.assertEquals(-2, ans);		
	}

//TC13
	@Test
	public void testSubtractFirstPositiveAndSecondZero() {
		Maths math = new Maths();
		int ans = math.subtract(2, 0);
		Assert.assertEquals(2, ans);		
	}
	
//TC14	
	@Test
	public void testSubtractFirstZeroAndSecondPositive() {
		Maths math = new Maths();
		int ans = math.subtract(0, 2);
		Assert.assertEquals(-2, ans);		
	}
	
//TC15	
	@Test
	public void testSubtractTwoZeroes() {
		Maths math = new Maths();
		int ans = math.subtract(0, 0);
		Assert.assertEquals(0, ans);		
	}
	
//Test conditions for Multiplication
//TC16	
	@Test
	public void testMultiplyTwoZeroes() {
		Maths math = new Maths();
		int ans = math.multiply(0, 0);
		Assert.assertEquals(0, ans);		
	}
	
//TC17	
	@Test
	public void testMultiplyTwoPositives() {
		Maths math = new Maths();
		int ans = math.multiply(2, 2);
		Assert.assertEquals(4, ans);		
	}
	
//TC18	
	@Test
	public void testMultiplyTwoNegatives() {
		Maths math = new Maths();
		int ans = math.multiply(-2, -2);
		Assert.assertEquals(4, ans);		
	}
	
//TC19	
	@Test
	public void testMultiplyOneNegativeAndOnePositive() {
		Maths math = new Maths();
		int ans = math.multiply(4, -2);
		Assert.assertEquals(-8, ans);		
	}
	
//TC20	
	@Test
	public void testMultiplyOneNegativeAndOneZero() {
		Maths math = new Maths();
		int ans = math.multiply(-4, 0);
		Assert.assertEquals(0, ans);		
	}
	
//TC21	
	@Test
	public void testMultiplyOnePositiveAndOneZero() {
		Maths math = new Maths();
		int ans = math.multiply(4, 0);
		Assert.assertEquals(0, ans);		
	}
	
//Test conditions for Division	
//TC22	
	@Test
	public void testTwoPositives() {
		Maths math = new Maths();
		int ans = math.divide(4, 4);
		Assert.assertEquals(1, ans);		
	}
	
//TC23	
	@Test
	public void testTwoNegatives() {
		Maths math = new Maths();
		int ans = math.divide(-4, -4);
		Assert.assertEquals(1, ans);		
	}
	
//TC24	
	@Test
	public void testOnePositiveAndOneNegative() {
		Maths math = new Maths();
		int ans = math.divide(4, -4);
		Assert.assertEquals(-1, ans);		
	}

//TC25
	@Test
	public void testFirstZeroAndSecondNegative() {
		Maths math = new Maths();
		int ans = math.divide(0, -4);
		Assert.assertEquals(0, ans);		
	}

//TC26
	@Test
	public void testFirstZeroAndSecondPositive() {
		Maths math = new Maths();
		int ans = math.divide(0, 4);
		Assert.assertEquals(0, ans);		
	}
	

//Throws exception for division with zero in denominator
//TC27	
	@Test(expected=ArithmeticException.class)
	public void testAnyNumberDivideByZero() {
		Maths math = new Maths();
		int ans = math.divide(4, 0);
		}
		

}
