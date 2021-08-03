package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Juggler implements Performer {


	@Override
	public void perform() {
		System.out.println("Juggler is juggling 3 Balls!");

	}

}
