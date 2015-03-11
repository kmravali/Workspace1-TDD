package com.tdd.example.factorial;

public class Factorial {

	public int getFactorial(int number) {
		// TODO Auto-generated method stub
		int numfact = 1;

		//if number is negative
		if (number < 0)
			return 0;
		
		while (number > 1) {
			numfact *= number;
			number--;
		}
		return numfact;
	}

}
