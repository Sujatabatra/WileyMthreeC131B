package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Dancer implements Performer {

	private String style;

	public Dancer() {

	}

	public Dancer(@Value("SomeDance") String style) {
		super();
		this.style = style;
	}

	@Value("Kuchipuri")
	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer in dancing in " + style + " Style");

	}

}
