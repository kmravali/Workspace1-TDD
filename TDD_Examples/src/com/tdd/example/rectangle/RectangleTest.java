package com.tdd.example.rectangle;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
	
	private MyRectangle rectangle = null;

	@Before
	public void setUp() throws Exception {
		rectangle = new MyRectangle(10, 20);
	}

	@Test
	public void perimeterTest() {				
		assertEquals(2*(10+20),rectangle.getPerimeter(),0);
		
	}
	@Test
	public void AreaTest() {				
		assertEquals(10*20,rectangle.getArea(),0);
		
	}
}
