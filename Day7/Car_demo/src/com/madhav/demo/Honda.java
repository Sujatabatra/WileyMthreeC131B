package com.madhav.demo;

public class Honda extends Car {
//	String engine;
	public Honda(String model, String color) {
		super("Honda City "+model, color);
	}

	@Override
	public void engine() {
		System.out.println("Engine is i-DTEC DOHC 1498cc");
	}
}
