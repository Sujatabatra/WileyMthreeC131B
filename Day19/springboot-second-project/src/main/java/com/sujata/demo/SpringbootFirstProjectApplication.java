package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.producer.Greet;
/*
 * @SpringBootApplication : @Configuration + @ComponentScan
 */
@SpringBootApplication(scanBasePackages = "com.sujata.producer")
public class SpringbootFirstProjectApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("goodEvening")
	private Greet greet;
	
	public static void main(String[] args) {

		SpringApplication.run(SpringbootFirstProjectApplication.class, args);
		
//		ApplicationContext springContainer= SpringApplication.run(SpringbootFirstProjectApplication.class, args);
//		Greet greet=(Greet)springContainer.getBean("goodMorning");
//		greet.wish();
		
	}

	@Override
	public void run(String... args) throws Exception {
		greet.wish();
		
	}

}
