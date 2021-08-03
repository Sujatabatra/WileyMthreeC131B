package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class PerformerMain {

	public static void main(String[] args) {
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perfomer.xml");
		
		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("perfomer.xml");
		
		springContainer.registerShutdownHook();
		System.out.println("BEAN IS READY TO BE USED");
		
//		Performer performer1=(Performer)springContainer.getBean("Keerthivasan");
		Performer performer2=(Performer)springContainer.getBean("Ahmad");
		
//		performer1.perform();
		performer2.perform();
		System.out.println("==========================");

	}

}
