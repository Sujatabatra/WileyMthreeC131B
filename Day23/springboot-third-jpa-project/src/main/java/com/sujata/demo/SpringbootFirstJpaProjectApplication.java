package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Husband;
import com.sujata.bean.Wife;
import com.sujata.persistence.HusbandDao;
import com.sujata.persistence.WifeDao;


@SpringBootApplication(scanBasePackages = "com.sujata")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
@EntityScan(basePackages = "com.sujata.bean")
public class SpringbootFirstJpaProjectApplication implements CommandLineRunner {

	@Autowired
	WifeDao wifeDao;
	@Autowired
	HusbandDao husbandDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Wife w1=new Wife(101, "Wife1");
		Husband h1=new Husband("H001", "Husband1");
		w1.setHusband(h1);
		
		husbandDao.save(h1);
		wifeDao.save(w1);
		
		
	}

}
