package com.sujata.demo;

public class MyDishMain {

	public static void main(String[] args) {
		Dish dish1;
		
		dish1=Dish.DAL;
		System.out.println("Dish is Vegetarian : "+dish1.isVegetarian());
		System.out.println("Calorie Count "+dish1.getCalorie());
		System.out.println("Dish Price : "+dish1.getPrice());
		

	}

}
