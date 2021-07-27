package com.madhav.demo;

public abstract class Car {
	private String model,color;

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color+" "+model;
	}

	public abstract void engine();

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}