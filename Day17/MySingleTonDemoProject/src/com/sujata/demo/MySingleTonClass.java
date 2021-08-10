package com.sujata.demo;

public class MySingleTonClass {
//	LAZY OBJECT CREATION
//	private static MySingleTonClass object;
	
	//eager object
	private static MySingleTonClass object=new MySingleTonClass();
	
	private MySingleTonClass() {
		
	}
	public static MySingleTonClass getInstance() {
//		Lazy Object Creation
//		if(object==null)
//			object=new MySingleTonClass();
		return object;
	}
	public void show() {
		System.out.println("Hi I am show method from MySingleTonClass");
	}

}
