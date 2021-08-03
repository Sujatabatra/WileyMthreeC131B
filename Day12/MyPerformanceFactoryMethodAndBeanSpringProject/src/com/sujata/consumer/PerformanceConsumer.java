package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.demo.Employee;
import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;
import com.sujata.producer.Stage;

public class PerformanceConsumer {

	public static void main(String[] args) {
		
		/*
		 * Life Cycle : Constructor call -> setter methods call (Spring Container is doing it for us)
		 * Spring container is looking at configuration file and picking all the beans
		 */
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
		Employee emp=(Employee)springContainer.getBean("waged");
		emp.showEmp();
//		Performer firstPerformer=(Performer)springContainer.getBean("Saumya");
//		System.out.println("Hashcode of Saumya as firstPerformer "+firstPerformer);
//		
//		Performer fourthPerformer=(Performer)springContainer.getBean("Aryan");
//		System.out.println("Hashcode of Aryan as fourthPerformer "+fourthPerformer);
//		
//		Performer secondPerformer=(Performer)springContainer.getBean("Saumya");
//		System.out.println("Hashcode of Saumya as secondPerformer "+secondPerformer);
//		
//
//		Performer thirdPerformer=(Performer)springContainer.getBean("Aryan");
//		System.out.println("Hashcode of Aryan as thirdPerformer "+thirdPerformer);

	}

}
