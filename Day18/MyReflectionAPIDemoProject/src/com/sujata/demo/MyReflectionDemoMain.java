package com.sujata.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
 * Reflection is an API which is used to examine or modify the behaviour of 
 * methods, classes and interfaces at run time
 */
public class MyReflectionDemoMain {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		MyReflectionDemo obj=new MyReflectionDemo();
		
		System.out.println("Class Name : "+obj.getClass());
		
		Class cls=obj.getClass();
		
		Constructor constructor=cls.getConstructor();
		

		System.out.println("Name of constructor : "+constructor.getName());
		
		Method[] methods=cls.getMethods();
		for(Method method:methods) {
			System.out.println(method.getName());
		}
		
		Method methodCall=cls.getDeclaredMethod("display", int.class);
		
		try {
			methodCall.invoke(obj, 25);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
