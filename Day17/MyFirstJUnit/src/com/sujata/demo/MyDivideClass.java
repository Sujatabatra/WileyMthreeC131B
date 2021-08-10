package com.sujata.demo;

public class MyDivideClass {

	/*
	 * divide will alow to divide any two positive nos
	 * if division on negative no  then method should return NegativeNumberException
	 * if denominator is negative method shld throw arithmetic exception
	 * 
	 */
	public int divide(int number1,int number2) {
		if(number1>=0 && number2>=0)
			return number1/number2;
		throw new NegativeNumberException("Negative Value not allowed");
		
	}
}
