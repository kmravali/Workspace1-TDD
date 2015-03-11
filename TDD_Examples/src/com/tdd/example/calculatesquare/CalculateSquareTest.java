package com.tdd.example.calculatesquare;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculateSquareTest {
	
	CalculateSquare testObject = null;

	@Before
	public void setUp() throws Exception {
		testObject = new CalculateSquare();
	}

	@Test
	public void SquareTest() throws Exception{
		assertNotNull(testObject);
		
	}
	
	//yet to write test cases for different inputs :)
	@Test
	public void Square()throws Exception{
		assertEquals(10*10,testObject.getSquare(10) );
		
	}

}
