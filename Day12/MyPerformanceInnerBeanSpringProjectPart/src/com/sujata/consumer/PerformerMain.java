package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Performer;

public class PerformerMain {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perfomer.xml");
		
		
		Instrumentalist performer3=(Instrumentalist)springContainer.getBean("Deepika");
		System.out.println("performer 3 : "+performer3);
		System.out.println("performer 3 instrument : "+performer3.getInstrument());
		System.out.println("==================");
		Instrumentalist performer4=(Instrumentalist)springContainer.getBean("Deepika");
		System.out.println("performer 4 : "+performer4);
		System.out.println("performer 4 instrument : "+performer4.getInstrument());
		

	}

}
