package com.sujata.producer;

import java.util.List;

public class Actor implements Performer{

	private List<String> scenes;

	public Actor(List<String> scenes) {
		super();
		this.scenes = scenes;
	}

	@Override
	public void perform() {
		System.out.print("Actor is performing on ");
		for(String scene:scenes) {
			System.out.print(scene+"     ");
		}
		System.out.println("scenes");
		
	}
	
	
}
