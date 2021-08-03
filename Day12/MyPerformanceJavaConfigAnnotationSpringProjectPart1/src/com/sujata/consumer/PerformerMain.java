package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.config.PerformerConfiguration;
import com.sujata.producer.Performer;

public class PerformerMain {

	public static void main(String[] args) {
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
		
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(PerformerConfiguration.class);
		Performer performer1=(Performer)springContainer.getBean("Keerthivasan");
		Performer performer2=(Performer)springContainer.getBean("Mahesh");
		Performer performer3=(Performer)springContainer.getBean("Madhav");
		Performer performer4=(Performer)springContainer.getBean("Deepika");
		
		performer1.perform();
		performer2.perform();
		performer3.perform();
		performer4.perform();

	}

}
