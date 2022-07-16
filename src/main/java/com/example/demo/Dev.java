package com.example.demo;

import org.springframework.stereotype.Service;

import com.example.service.Developer;

@Service("getMessage")
public class Dev {

	public String getMessage(String name) {

		Developer obj = new Developer();
		obj.show();
		return "hello " + name + " welcome to spring boot application";
		
	}

}
