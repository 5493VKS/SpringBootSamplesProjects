package com.springboot1Restfull.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage{
	
	public String retriveMessage() {
		return "Hello! Brother how are you new updatedservice";
	}
}
