package com.sujata.demo;

public class MainComplex {

	public static void main(String[] args) {
		Complex c1=new Complex(2,8);
		
		c1.display();
		
		Complex c2=new Complex(4,-2);
		c2.display();
		
		Complex c3=new Complex();
		c3.sum(c1, c2);
		c3.display();

	}

}
