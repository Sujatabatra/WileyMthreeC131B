package com.sujata.producer;

public class Tabla implements Instrument {

	public Tabla() {
		System.out.println("Hi I am Tabla Constructor");
	}
	@Override
	public void play() {
		System.out.println("DHIN TAK TAK!");

	}

}
