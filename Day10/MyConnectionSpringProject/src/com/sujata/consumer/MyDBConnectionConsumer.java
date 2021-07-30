package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.MyDBConnection;

public class MyDBConnectionConsumer {

	public static void main(String args[]) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("connect.xml");
		
		MyDBConnection db1=(MyDBConnection)springContainer.getBean("mySQL");
		db1.createConnection();
	}
}
