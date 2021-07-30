package com.sujata.consumer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sujata.producer.Greet;

public class GreetConsumer {

	public static void main(String[] args) {

		/*
		 * spring container will read XML configuration file and will run the life cycle
		 * of all the classes, which are mentioned with <bean> tag
		 * 
		 * Life Cycle : creation of objects and calling of setter methods(As of now)
		 */
		BeanFactory springContainer = new XmlBeanFactory(new ClassPathResource("greet.xml"));
		/*
		 * Greet greet=new GoodMorning();
		 */
		
		/*
		 * Depedency of name 
		 * IOC :Inversion of Control : Separating the dependency logic from the actual business logic of an application
		 * how we achieve IOC : dependency injection
		 * two types of depedency injection : constructor, setter
		 */
		Greet greet=(Greet)springContainer.getBean("eve");
	
		greet.wish();

		
	}

}
