package com.sujata.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class GlobalInitialization implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("6. Pre Initialization Bean Post Processor "+beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("9. Post Initialization Bean Post Processor "+beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
