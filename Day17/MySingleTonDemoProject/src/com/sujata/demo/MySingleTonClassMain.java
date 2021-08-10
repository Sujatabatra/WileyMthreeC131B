package com.sujata.demo;

public class MySingleTonClassMain {

	public static void main(String[] args) {
		MySingleTonClass obj;
		
		
		obj=MySingleTonClass.getInstance();
		System.out.println("obj : "+obj);
		
		MySingleTonClass obj1=MySingleTonClass.getInstance();
		System.out.println("obj1 : "+obj1);

	}

}
