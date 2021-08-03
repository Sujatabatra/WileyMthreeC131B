package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Dancer implements Performer {


	@Override
	public void perform() {
		System.out.println("Dancer in dancing in Kuchipuri Style");

	}

}
