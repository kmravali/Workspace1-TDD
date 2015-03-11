package com.tdd.example.decimaltobinary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalToBinaryTest {
	private Decimal2Binary decimalnumber =null;

	@Before
	public void setUp() throws Exception {
		decimalnumber = new Decimal2Binary();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals("100",decimalnumber.getBinary(4));
	}

}
