package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Keerthivasan")
public class Singer implements Performer {

	@Value("Chennai Express")
	private String song;

	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing " + song);

	}

}
