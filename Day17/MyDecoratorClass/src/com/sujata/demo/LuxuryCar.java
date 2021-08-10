package com.sujata.demo;

public class LuxuryCar extends Car implements CustomizeCar {

	private Car car;
	
	public LuxuryCar(Car car) {
		this.car = car;
	}

	@Override
	public void customize() {
		System.out.println("Customizing "+car.getModel()+" in "+car.getColor()+" to Super Luxury Car");
		car.engine();
	}

	@Override
	public void engine() {
		car.engine();
		
	}
	
	
	

}
