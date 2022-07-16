package com.springBootJPAExample1.springBootJPAExample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan("com.springBootJPAExample1")
@SpringBootApplication
public class SpringBootJpaExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaExample1Application.class, args);
	}

}
