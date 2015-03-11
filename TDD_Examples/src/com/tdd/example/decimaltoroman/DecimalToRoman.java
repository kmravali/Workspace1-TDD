package com.tdd.example.decimaltoroman;

public class DecimalToRoman {

	public Object getRomanNumber(int decimal) {
		String result = "";

		
		if (decimal == 10)
			result = "X";
		if (decimal == 9)
			result = "IX";

		while (decimal <= 8) {
			result += "I";
			while (decimal < 4) {
				result = "V" + result;
			}
			decimal--;
		}
		if (decimal == 5)
			result = "V";

		if (decimal == 4)
			result = "IV";

		while (decimal < 4) {
			result += "I";
			decimal--;
		}
		return result;
	}

}
