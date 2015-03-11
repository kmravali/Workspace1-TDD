package com.tdd.example.factorial;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

	private Factorial number = null;

	@Before
	public void setUp() throws Exception {
		number = new Factorial();
	}

	@Test
	//test the factorial of integer 1
	public void GetFactorailTestforzero() {
		assertEquals(1, number.getFactorial(0), 0);
	}
	
	@Test
	//test the factorial of integer 1
	public void GetFactorailTestfor1() {
		assertEquals(1, number.getFactorial(1), 0);
	}
	
	@Test
	//test the factorial of integer 3
	public void GetFactorailTestfor3() {
		assertEquals(6, number.getFactorial(3), 0);
	}
	@Test
	//test the factorial of negative integer 3
	public void GetFactorailTestfornegativeInt() {
		assertEquals(0, number.getFactorial(-3));
	}
}
