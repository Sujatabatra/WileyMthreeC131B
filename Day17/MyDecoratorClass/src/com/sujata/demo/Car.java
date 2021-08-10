package com.sujata.demo;

public abstract class Car {

	private String model;
	private String color;
	public Car() {
		
	}
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
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
	
	abstract public void engine();
}
