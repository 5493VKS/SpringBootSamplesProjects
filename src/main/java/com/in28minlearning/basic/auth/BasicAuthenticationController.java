package com.in28minlearning.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minlearning.restservice_sb.bean.AuthenticationBean;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {

	@GetMapping(path = "/basicAuth")
	public AuthenticationBean getBasicAccess() {
		
		return new AuthenticationBean("You are authenticaticated");
	}
}
