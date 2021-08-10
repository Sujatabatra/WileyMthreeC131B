package com.sujata.demo;

public class MyMainDecoratorClass {

	public static void main(String[] args) {
		BMW bmw1=new BMW("Q5", "Blue");
		BMW bmw2=new BMW("Q3", "Silver");
		
		Audi audi1=new Audi("A6", "Red");
		Audi audi2=new Audi("A8", "Black color");
		
		bmw1.engine();
		bmw2.engine();

		audi1.engine();
		audi2.engine();
		
		LuxuryCar bmw1Luxury=new LuxuryCar(bmw1);
		bmw1Luxury.engine();
		bmw1Luxury.customize();
	}

}
