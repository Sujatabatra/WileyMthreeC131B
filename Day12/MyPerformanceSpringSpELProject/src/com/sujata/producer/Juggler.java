package com.sujata.producer;

public class Juggler implements Performer {

	private int balls;
	
	public void setBalls(int balls) {
		this.balls = balls;
	}
	
	
	public int getBalls() {
		return balls;
	}


	@Override
	public void perform() {
		System.out.println("Juggler is juggling "+balls+" balls");

	}

}
