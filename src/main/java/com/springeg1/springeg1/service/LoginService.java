package com.springeg1.springeg1.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean loginCredential(String name, String password) {
		
		return name.equalsIgnoreCase("vivek") && password.equalsIgnoreCase("sharma");
	}

}
