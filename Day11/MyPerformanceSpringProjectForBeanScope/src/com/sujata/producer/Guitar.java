package com.sujata.producer;

public class Guitar implements Instrument {

	public Guitar() {
		System.out.println("Hi I am Guitar Constrictor");
	}
	@Override
	public void play() {
		System.out.println("TIN TIN TIN");

	}

}
