package com.tdd.example.stringtoURL;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringToURLTest {

	private StringToURL string_url;

	@Before
	public void setUp() throws Exception {
		string_url = new StringToURL();
	}

	@Test
	public void CompleteURLTest() {
		assertEquals("https://www.mohana-and-km-dev-studio-co-inc.com",
				string_url.getURL("Mohana & KM Dev Studio Co., Inc"));
	}
	
	@Test
	public void SplChartest() {
		assertEquals("https://www.mandk-associates-company.com",
				string_url.getURL("M&K Associates Company."));
	}
	@Test
	public void MyFavGoogletest() {
		assertEquals("https://www.google.com",
				string_url.getURL("Google"));
	}
	
}
