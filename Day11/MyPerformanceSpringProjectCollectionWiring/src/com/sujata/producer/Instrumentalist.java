package com.sujata.producer;

import java.util.Map;
import java.util.Set;

public class Instrumentalist implements Performer {

	private Map<String, Instrument> songsInstrument;

	public void setSongsInstrument(Map<String, Instrument> songsInstrument) {
		this.songsInstrument = songsInstrument;
	}

	@Override
	public void perform() {
		Set<String> songs=songsInstrument.keySet();
		
		for(String song:songs) {
			System.out.print("Instrumentalist is playing ");
			songsInstrument.get(song).play();
			System.out.println(" on "+song);
		}
	}

}
