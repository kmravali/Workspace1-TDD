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
		assertEquals("X", decimaltoroman.getRomanNumber(10));
	}

	@Test
	public void Decimal11(){
		assertEquals("XI", decimaltoroman.getRomanNumber(11));
	}
	
	@Test
	public void Decimal13(){
		assertEquals("XIII", decimaltoroman.getRomanNumber(13));
	}
	
	@Test
	public void Decimal24(){
		assertEquals("XXIV", decimaltoroman.getRomanNumber(24));
	}
	
	@Test
	public void Decima49(){
		assertEquals("XLIX", decimaltoroman.getRomanNumber(49));
	}
	
	@Test
	public void Decimal50(){
		assertEquals("L", decimaltoroman.getRomanNumber(50));
	}
	
	@Test
	public void Decimal51(){
		assertEquals("LI", decimaltoroman.getRomanNumber(51));
	}
	
	@Test
	public void Decimal55(){
		assertEquals("LV", decimaltoroman.getRomanNumber(55));
	}
	
	@Test
	public void Decima75(){
		assertEquals("LXXV", decimaltoroman.getRomanNumber(75));
	}
	
	@Test
	public void Decima99(){
		assertEquals("XCIX", decimaltoroman.getRomanNumber(99));
	}
	
	@Test
	public void Decima100(){
		assertEquals("C", decimaltoroman.getRomanNumber(100));
	}
	@Test
	public void Decima101(){
		assertEquals("CI", decimaltoroman.getRomanNumber(101));
	}
	
	@Test
	public void Decima105(){
		assertEquals("CV", decimaltoroman.getRomanNumber(105));
	}
	
	@Test
	public void Decima300(){
		assertEquals("CCC", decimaltoroman.getRomanNumber(300));
	}
	@Test
	public void Decima506(){
		assertEquals("DVI", decimaltoroman.getRomanNumber(506));
	}
	
	@Test
	public void Decima3586(){
		assertEquals("MMMDLXXXVI", decimaltoroman.getRomanNumber(3586));
	}	
	
	
}
