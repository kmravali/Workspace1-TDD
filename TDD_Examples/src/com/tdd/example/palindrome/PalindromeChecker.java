package com.tdd.example.palindrome;

public class PalindromeChecker {

	public boolean isPalindrome(String string) {
		// TODO Auto-generated method stub
		String reverseString = getReverseString(string);
		if (reverseString.equals(string))
			return true;
		else
			return false;
	}

	private String getReverseString(String string) {
		// TODO Auto-generated method stub
		StringBuffer stringbuff = new StringBuffer(string);
		stringbuff.reverse();
		return stringbuff.toString();
	}

}
