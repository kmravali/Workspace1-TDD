package com.tdd.example.calculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Calculator {

	List<String> value;
	double result;

	public Calculator() {
		value = new ArrayList<String>();
		result = 0;
	}

	public double calculate(String expression) {
		StringTokenizer str = new StringTokenizer(expression);

		while (str.hasMoreElements()) {
			value.add((String) str.nextElement());
		}

		//value = sort(value);
		result = sortedEquation(value);
		// sort the expression into iterator following BODMAS rule

		//
		// Iterator itr = value.iterator();
		// result = Integer.parseInt((String) itr.next());
		// while (itr.hasNext()) {
		// result = operator(result,
		// (String) itr.next(),
		// Integer.parseInt((String) itr.next()));}

		return result;
	}

	private double sortedEquation(List<String> value2) {
		double result = 0;
		int multiplier = 1;
		Iterator equIterator = value2.iterator();
		while (equIterator.hasNext()) {
			String operandOrOperator = (String) equIterator.next();
			if (operandOrOperator.equals("*")) {
				result *= Integer.parseInt((String) equIterator.next());
			} else if (operandOrOperator.equals("-")) {
				multiplier = -1;
			} else if (operandOrOperator.equals("+")) {
				multiplier = 1;
			} else {
				result += (multiplier * Integer.parseInt(operandOrOperator));
			}
		}
		System.out.println("Final result : " + result);
		return result;

	}

/*	private List<String> sort(List<String> expression) {
		ArrayList<String> sortedexpr = new ArrayList<String>();
		int size = expression.size();
		for(int index=0, numsize=size; index<numsize; index++){
			if(expression.get(index+1).equals("-")){
				sortedexpr.add(size-1, );
			}
		}
	 }*/

	private double operator(double result, String expr, int value) {

		switch (expr) {

		case "+":
			result = result + value;
			System.out.println(result);
			break;

		case "-":
			result = result - value;
			System.out.println(result);
			break;

		case "*":
			result = result * value;
			System.out.println(result);
			break;

		case "/":
			result = result / value;
			System.out.println(result);
			break;

		}

		return result;
	}

}
