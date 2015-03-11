/**
 * 
 */
package com.tdd.example.palindrome;

import java.io.FileReader;
import java.util.Properties;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

/**
 * @author MohanaRavali
 * 
 */
public class PalindromeCheckerTest extends TestCase {
	
	private static final String TEST_OBJECT_YESPALINDROME = "test_object_yespalindrome";
	private static final String TEST_OBJECT_NOPALINDROME = "test_object_nopalindrome";
	
	PalindromeChecker testObject = null;
	Properties prop = new Properties();
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		testObject = new PalindromeChecker();
		prop.load(new FileReader("Palindrome_Local.properties"));
	}

	@Test
	public void test() {

		assertNotNull(testObject);
	}

	public void testPalindromeChecker_YesPalindrome() {
	
		assertTrue(testObject.isPalindrome(prop.getProperty(TEST_OBJECT_YESPALINDROME)));
	}

	public void testPalindromeChecker_NotPalindrome() {
		assertFalse(testObject.isPalindrome(prop.getProperty(TEST_OBJECT_NOPALINDROME)));

	}

}
