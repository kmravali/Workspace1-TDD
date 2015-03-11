package com.tdd.example.stringtoURL;

import java.util.StringTokenizer;

public class StringToURL {
	


	public String  getURL(String userstring) {

		String newusrstr = "";
		StringTokenizer usrstr = new StringTokenizer(userstring, "-");

		while (usrstr.hasMoreElements()) {

			newusrstr += usrstr.nextElement().toString()
					.replace("&", "and")
					.replace("'", "")
					.replace(".", "")
					.replace(",", "")
					.replace(" ", "-")
					.toLowerCase();

		}		
		return "https://www."+newusrstr + ".com";
	}



}
