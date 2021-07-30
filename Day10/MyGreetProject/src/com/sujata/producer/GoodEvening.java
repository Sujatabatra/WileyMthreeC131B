package com.sujata.producer;

public class GoodEvening implements Greet {

	private String name;

	public GoodEvening(String name) {
		super();
		this.name = name;
	}

	@Override
	public void wish() {
		System.out.println("Good Evevning " + name);

	}

}
