package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import com.sujata.bean.Learner;
import com.sujata.bean.Trainer;
import com.sujata.persistence.LearnerDao;
import com.sujata.persistence.TrainerDao;


@SpringBootApplication(scanBasePackages = "com.sujata")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
@EntityScan(basePackages = "com.sujata.bean")
public class SpringbootFirstJpaProjectApplication implements CommandLineRunner {

	@Autowired
	LearnerDao learnerDao;
	@Autowired
	TrainerDao trainerDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Learner l1=new Learner("L001","Learner1");
		Learner l2=new Learner("L002","Learner2");
		Learner l3=new Learner("L003","Learner3");
		Learner l4=new Learner("L004","Learner4");
		
		Trainer t1=new Trainer("T001", "Trainer 1");
		Trainer t2=new Trainer("T002", "Trainer 2");
		
		l1.setTrainer(t1);
		l2.setTrainer(t2);
		l3.setTrainer(t1);
		l4.setTrainer(t2);
		
		
		trainerDao.save(t1);
		trainerDao.save(t2);
		
		learnerDao.save(l1);
		learnerDao.save(l2);
		learnerDao.save(l3);
		learnerDao.save(l4);
		
		
		
	}

}
