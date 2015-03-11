package com.tdd.example.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTesting {

	  Calculator calculator;

	  @Before
	  public void setUp() {
	    calculator = new Calculator();
	  }

	  @Test
	  public void testCalculatingSingleNumber() {
	    assertEquals(18.0, calculator.calculate("5 * 3 + 3"), 0);
	  }

	  // Now try adding addition such as "5 + 5"
}
