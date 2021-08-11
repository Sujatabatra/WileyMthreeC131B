package com.sujata.demo;

public class MyReflectionDemo {

	private String str;
	
	public MyReflectionDemo() {
		str="Sujata Batra";
	}
	
	public void show() {
		System.out.println("Name : "+str);
	}
	
	public void display(int number) {
		System.out.println("Hi I am display method of MyReflectionDemo class ,number : "+number);
	}

	private void method() {
		System.out.println("Hi I am private method");
	}
}
