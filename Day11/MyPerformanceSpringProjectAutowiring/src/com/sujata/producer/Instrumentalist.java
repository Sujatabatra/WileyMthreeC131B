package com.sujata.producer;

public class Instrumentalist implements Performer {

	private Instrument instrument;

	
	public Instrumentalist(Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.print("Instrumentalist is Playing ");
		instrument.play();

	}

}
