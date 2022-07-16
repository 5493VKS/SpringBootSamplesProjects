package com.springeg1.springeg1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springeg1.springeg1.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService loginservice;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String welcomePage(@RequestParam String username,@RequestParam String password,ModelMap model) {
		
		boolean status = loginservice.loginCredential(username, password);
		if(!status) {
			model.put("errormessage","Invalid Credentials");
			return "login";
		}
		model.put("name",username);
		return "welcome";
	}


}
