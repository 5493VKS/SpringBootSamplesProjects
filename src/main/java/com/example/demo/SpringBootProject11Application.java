package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.service.Developer;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class SpringBootProject11Application {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringBootProject11Application.class, args);		
		Dev d1 = con.getBean(Dev.class);
		System.out.println(d1.getMessage("Vivek Sharma")); 
		Developer obj = con.getBean(Developer.class);
		obj.show();
	}



}
