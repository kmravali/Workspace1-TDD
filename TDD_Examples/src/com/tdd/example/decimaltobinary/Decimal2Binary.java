package com.tdd.example.decimaltobinary;

public class Decimal2Binary {

	public String getBinary(int decimalnumber) {
		// TODO Auto-generated method stub
		String binary = "";
		if(decimalnumber==0)
			return "0";
		while (decimalnumber>0) {
			binary = decimalnumber % 2+binary;
			decimalnumber = decimalnumber / 2;
		}
		System.out.println(binary);
		return binary;
		
	}

}
