package com.simplilearn;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.simplilearn")
@EntityScan(basePackages = "com.simplilearn.bean")
@EnableJpaRepositories(basePackages = "com.simplilearn.repository")
public class AadharApplication {

	public static void main(String[] args) {
		SpringApplication.run(AadharApplication.class, args);
	}

}
