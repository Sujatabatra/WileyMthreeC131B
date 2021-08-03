package com.sujata.producer;

public class Dancer implements Performer {

	private String style;
	
	public Dancer(String style) {
		super();
		System.out.println("DANCER CONSTRUCTOR!");
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in "+style+" style");

	}

}
