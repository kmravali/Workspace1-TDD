package com.tdd.example.testenv;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestingEnvTest {

	private TestingEnv testingenv;

	@Before
	public void setUp() throws Exception {
		testingenv= new TestingEnv();
	}

	@Test
	public void testGetReply() {
		assertEquals("Hello TestNG!", testingenv.getReply());
		
	}

}
