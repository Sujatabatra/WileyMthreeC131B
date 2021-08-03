package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class PerformerMain {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
		
		Performer performer1=(Performer)springContainer.getBean("dancer");
		Performer performer2=(Performer)springContainer.getBean("singer");
		Performer performer3=(Performer)springContainer.getBean("juggler");
		
		
		performer1.perform();
		performer2.perform();
		performer3.perform();
		

	}

}
