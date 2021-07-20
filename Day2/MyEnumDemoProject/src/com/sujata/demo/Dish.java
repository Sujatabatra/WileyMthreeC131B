package com.sujata.demo;

public enum Dish {

	CHICKEN(450,false,650),PANEER(350,true,450),DAL(450,true,350),POTATO(750,true,200),FISH(250,false,750);
	
	
	Dish(int calorie, boolean vegetarian, double price) {
		this.calorie = calorie;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	private int calorie;
	private boolean vegetarian;
	private double price;
	
	public int getCalorie() {
		return calorie;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public double getPrice() {
		return price;
	}
	
	
}
