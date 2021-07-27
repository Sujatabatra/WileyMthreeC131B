package com.sujata.demo;

import com.sujata.training.ReverseNumber;

public class PalindromeNumber {
	
	private int number;
	private boolean palindrome;
	
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isPalindrome() {
		ReverseNumber reverseNumber=new ReverseNumber();
		reverseNumber.setNumber(number);
		if(reverseNumber.getReverse()==number)
			palindrome=true;
		return palindrome;
	}
	

}
