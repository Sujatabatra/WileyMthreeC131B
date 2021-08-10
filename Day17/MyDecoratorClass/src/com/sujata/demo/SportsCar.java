package com.sujata.demo;

public class SportsCar extends Car implements CustomizeCar {

	private Car car;
	
	public SportsCar(Car car) {
		this.car = car;
	}

	@Override
	public void customize() {
		System.out.println("Customizing "+car.getModel()+" in "+car.getColor()+" to Sports Car");
		car.engine();
	}

	@Override
	public void engine() {
		car.engine();
		
	}
	
	
	

}
