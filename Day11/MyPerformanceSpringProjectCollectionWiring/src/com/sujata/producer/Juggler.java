package com.sujata.producer;

import java.util.Map;
import java.util.Set;

public class Juggler implements Performer {

	private Map<String,Integer> propsCount;

	public Juggler(Map<String, Integer> propsCount) {
		super();
		this.propsCount = propsCount;
	}



	@Override
	public void perform() {
	
		Set<String> props=propsCount.keySet();
		for(String prop:props) {
			System.out.println("Juggler is juggling "+propsCount.get(prop)+" "+prop);
		}

	}

}
