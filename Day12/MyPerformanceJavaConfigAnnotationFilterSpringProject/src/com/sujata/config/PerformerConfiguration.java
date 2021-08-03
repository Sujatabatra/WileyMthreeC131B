package com.sujata.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.sujata.producer.Performer;

@Configuration
@ComponentScan(basePackages = "com.sujata.producer",
includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value =Performer.class))
public class PerformerConfiguration {

}
