package com.tdd.example.decimaltoroman;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalToRomanTest {
	
	private DecimalToRoman decimaltoroman = null;

	@Before
	public void setUp() throws Exception {
		decimaltoroman= new DecimalToRoman();
	}

	@Test
	public void NullObjectTest() {
		assertNotNull(decimaltoroman);
	}

	@Test
	public void Decimal3(){
		assertEquals("III", decimaltoroman.getRomanNumber(3));
	}
	
	@Test
	public void Decimal5(){
		assertEquals("V", decimaltoroman.getRomanNumber(5));
	}

	@Test
	public void Decimal4(){
		assertEquals("IV", decimaltoroman.getRomanNumber(4));
	}
	
	@Test
	public void Decimal6(){
		assertEquals("VI", decimaltoroman.getRomanNumber(6));
	}
	
	@Test
	public void Decimal9(){
		assertEquals("IX", decimaltoroman.getRomanNumber(9));
	}
	
	@Test
	public void Decimal10(){
		assertEquals("IX", decimaltoroman.getRomanNumber(10));
	}
	
	
}
