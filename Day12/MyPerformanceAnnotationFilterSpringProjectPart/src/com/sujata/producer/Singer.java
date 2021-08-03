package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Singer implements Performer {

	@Override
	public void perform() {
		System.out.println("Singer is singing Chennai Express");

	}

}
