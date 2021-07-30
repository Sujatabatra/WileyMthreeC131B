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
		 * Life Cycle : creation of objects(Asof now)
		 */
		BeanFactory springContainer = new XmlBeanFactory(new ClassPathResource("greet.xml"));
		/*
		 * Greet greet=new GoodMorning();
		 */
		Greet greet=(Greet)springContainer.getBean("mrng");
		greet.wish("Sai Ganesh");

		
	}

}
