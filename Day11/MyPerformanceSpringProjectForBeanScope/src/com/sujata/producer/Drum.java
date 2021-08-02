package com.sujata.producer;

public class Drum implements Instrument {

	public Drum() {
		System.out.println("Hi I am Drum Constructor");
	}
	@Override
	public void play() {
		System.out.println("DUM DUM DUM!");

	}

}
