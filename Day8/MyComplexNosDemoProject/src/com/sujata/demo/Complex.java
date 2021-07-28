package com.sujata.demo;

public class Complex {
	
	private int real,imag;
	
	public Complex() {
		
	}

	public Complex(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
	
	public void display() {
		System.out.print(real);
		if(imag>0)
			System.out.println("+"+imag+"i");
		else if(imag<0)
			System.out.println(imag+"i");
	}
	
	public void sum(Complex c1,Complex c2) {
		real=c1.real+c2.real;
		imag=c1.imag+c2.imag;
	}

}
