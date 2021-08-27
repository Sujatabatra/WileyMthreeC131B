package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Blog;
import com.sujata.persistence.BlogDao;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
@EntityScan(basePackages = "com.sujata.bean")
public class SpringbootBlogRestapiApplication /*implements CommandLineRunner*/{

//	@Autowired
//	private BlogDao blogDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogRestapiApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		blogDao.save(new Blog(1,"My new website","lorem ipsum...","mario"));
//		blogDao.save(new Blog(2,"Welcome Party!","lorem ipsum...","yoshi"));
//		blogDao.save(new Blog(3,"Web Dev Top Tips","lorem ipsum...","mario"));
//		blogDao.save(new Blog(4,"React Dev Tips","lorem ipsum...","mario"));
//		
//	}

}
