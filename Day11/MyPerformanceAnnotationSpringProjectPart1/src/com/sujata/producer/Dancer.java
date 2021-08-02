package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Mahesh")
public class Dancer implements Performer {

	
	private String style;

	public Dancer(@Value("Kuchipuri")String style) {
		super();
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer in dancing in " + style + " Style");

	}

}
