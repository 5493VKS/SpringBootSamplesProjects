package com.in28minlearning.restservice_sb.restservice_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.in28minlearning.restservice_sb")
public class RestserviceSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestserviceSbApplication.class, args);
	}

}
