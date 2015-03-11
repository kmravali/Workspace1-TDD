package com.tdd.example.decimaltoroman;

public class DecimalToRoman {

	public Object getRomanNumber(int decimal) {
		String result = "";
		
		if (decimal == 10){
			return "X";
		}
				
		if (decimal == 9)
			return "IX";

		if (decimal <= 8 && decimal>4) {
			result="V";
			decimal=decimal-5;
		}
		if (decimal == 5)
			return "V";

		if (decimal == 4)
			return "IV";

		while (decimal >=1) {
			result += "I";
			decimal--;
		}
		
		return result;
	}

}
