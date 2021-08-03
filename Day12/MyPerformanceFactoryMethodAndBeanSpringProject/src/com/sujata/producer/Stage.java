package com.sujata.producer;

public class Stage {
	
	private Stage() {
	}
	public static class StageSingletonHolder{
		static Stage instance=new Stage(); 
	}
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
	
	public void show() {
		System.out.println("Hi I am show method of stage");
	}
	
}
