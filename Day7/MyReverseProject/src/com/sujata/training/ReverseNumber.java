package com.sujata.training;

public class ReverseNumber {
	
	private int number,reverse;

	
	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverse() {
		while(number!=0) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		return reverse;
	}

	

}
