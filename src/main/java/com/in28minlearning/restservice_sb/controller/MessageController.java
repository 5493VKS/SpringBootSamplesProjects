package com.in28minlearning.restservice_sb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28minlearning.restservice_sb.bean.MessageBean;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MessageController {
	
	
	//@RequestMapping(method = RequestMethod.GET, path = "/msg")
	@GetMapping("/msg")
	public String getMessage() {
		
		return "Hello World!";
	}
	
	@GetMapping(path = "/hello-world-msg")
	public MessageBean getMessageBean() {
		
		return new MessageBean("hello world");
	}
	
	@GetMapping(path = "/hello-world-msg/pathvar/{name}")
	public MessageBean getMessageBeanPathVar(@PathVariable String name) {
		
		//throw new RuntimeException("Something went wrong, please contact support team");
		return new MessageBean(String.format("hello world, %s", name));
	}
	
}
