package com.sujata.producer;

public class Dancer implements Performer {

	private String style;

	public Dancer(String style) {
		super();
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer in dancing in " + style + " Style");

	}

}
