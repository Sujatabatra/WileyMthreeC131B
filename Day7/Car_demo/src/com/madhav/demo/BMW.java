package com.madhav.demo;

public class BMW extends Car{
	public BMW(String model, String color) {
		super("BMW "+model, color);
	}
	@Override
	public void engine() {
		System.out.println("Engine is TwinPower Turbo 6592cc");
	}
}
