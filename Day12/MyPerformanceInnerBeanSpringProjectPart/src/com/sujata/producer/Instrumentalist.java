package com.sujata.producer;

public class Instrumentalist implements Performer {

	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	@Override
	public void perform() {
		System.out.print("Instrumentalist is Playing ");
		instrument.play();

	}

}
