package com.madhav.demo;

public class Audi extends Car{
	String engine;
	public Audi(String model, String color) {
		super("Audi "+model, color);
	}
	@Override
	public void engine() {
		System.out.println("Engine is 2.0 L TFSI 1998cc");
	}
}