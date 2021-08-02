package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class PerformerMain {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perfomer.xml");
		
		Performer performer1=(Performer)springContainer.getBean("Deepika");
		
		performer1.perform();
		

	}

}
