package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class PerformerMain {

	public static void main(String[] args) {
		/*
		 * what ever beans we have specified in .xml file their life cycle(Constructor -> setter) will be called the time we launch ApplicationContext
		 * By default all beans are loaded eagerly , 
		 * you can make it as lazy loading, with attribute lazy-init=true in <bean> tag,
		 * By default lazy-init=false
		 * 
		 * All Beans by default are at the scope singleton 
		 */
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perfomer.xml");
		
		Performer performer1=(Performer)springContainer.getBean("Keerthivasan");
		System.out.println("performer1 "+performer1);
		System.out.println("===========================");
		
		Performer performer2=(Performer)springContainer.getBean("Keerthivasan");
		System.out.println("performer2 "+performer2);
		
		
		

	}

}
