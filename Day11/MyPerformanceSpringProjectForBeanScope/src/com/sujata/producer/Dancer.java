package com.sujata.producer;

public class Dancer implements Performer {

	private String style;

	public Dancer(String style) {
		super();
		System.out.println("Hi I am Dancer Constructor");
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer in dancing in " + style + " Style");

	}

}
