package com.sujata.producer;

public class Juggler implements Performer {

	private int balls;

	public Juggler(int balls) {
		super();
		System.out.println("Hi I am Juggler constructor");
		this.balls = balls;
	}

	@Override
	public void perform() {
		System.out.println("Juggler is juggling " + balls + " Balls!");

	}

}
