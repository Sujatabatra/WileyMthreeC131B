package com.madhav.demo1;

import com.madhav.demo.Car;

public class Driver {
	
	private String name;
	private Car car;
	
	Driver(String n){
		this.name = n;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void drive() {
		System.out.println(name+" is drving " +car.getColor()+" "+car.getModel());
		car.engine();
	}

	

}
