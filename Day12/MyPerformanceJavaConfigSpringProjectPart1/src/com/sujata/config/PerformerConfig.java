package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

@Configuration
public class PerformerConfig {

	@Bean(name = "Keerthivasan")
//	@Scope("prototype")
//	@Lazy(true)
	public Singer getSinger() {
		Singer singer=new Singer();
		singer.setSong("Chennai Express");
		return singer;
	}
	
	@Bean
	public Dancer Mahesh() {
		return new Dancer("Kuchipuri");
	}
	
	@Bean
	public Juggler Madhav() {
		return new Juggler(3);
	}
	
	@Bean
	public Guitar guitar() {
		return new Guitar();
	}
	
	@Bean
	public Tabla tabla() {
		return new Tabla();
	}
	
	@Bean
	public Drum drum() {
		return new Drum();
	}
	
	@Bean("Deepika")
	public Instrumentalist getInstumentalist() {
		Instrumentalist instrumentalist=new Instrumentalist();
		instrumentalist.setInstrument(guitar());
		return instrumentalist;
	}
	
}
