package com.sujata.producer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singer implements Performer, 
BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,
DisposableBean{

	private String song;
	private String name;

	public Singer() {
		System.out.println("1. Hi I am Singer Constructor");
	}

	public void setSong(String song) {
		System.out.println("2. Hi I am song setter from Singer ");
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println(name+" is singing " + song);

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("3. setBeanName() called for beanName "+name);
		this.name = name;

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. setBeanFactory from Singer");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("5. setApplicationContext from Singer");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("7. afterPropertySet() from Singer");
		
	}
	
	public void customInitForKeerthivasan() {
		System.out.println("8. customInit for Singer Keerthivasan");
	}
	
	public void customDestroyForAhmad() {
		System.out.println("2. customDestroy for Singer Ahmad");
	}

	public void customDestroyForKeerthivasan() {
		System.out.println("2. customDestroy for Singer Keerthivasan");
	}
	
	public void customInitForAhmad() {
		System.out.println("8. customInit for Singer Ahmad");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("1. destroy() for Singer ");
		
	}

	@PostConstruct
	public void customAnnotaionInit() {
		System.out.println("Hi I am Init from Singer");
	}
	
	@PreDestroy
	public void customAnnotationDestroy() {
		System.out.println("Hi I am destroy from Singer");
	}
}
