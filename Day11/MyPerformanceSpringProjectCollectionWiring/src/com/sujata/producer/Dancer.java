package com.sujata.producer;

public class Dancer implements Performer {

	private String style;
	private String song;

	public Dancer(String style,String song) {
		super();
		this.style = style;
		this.song=song;
	}

	@Override
	public void perform() {
		System.out.println("Dancer in dancing in " + style + " Style on song "+song);

	}

}
