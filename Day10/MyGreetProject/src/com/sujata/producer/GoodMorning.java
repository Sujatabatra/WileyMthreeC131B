package com.sujata.producer;

public class GoodMorning implements Greet {

	private String name;
	
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void wish() {
		System.out.println("Good Morning "+name);

	}
	

}
