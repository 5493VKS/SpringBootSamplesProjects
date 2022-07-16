package com.springboot1Restfull.entrypoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot1Restfull")
public class RunApplication {
	
	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(RunApplication.class, args);
	}

}
