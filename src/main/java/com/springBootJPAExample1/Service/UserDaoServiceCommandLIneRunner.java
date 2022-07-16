package com.springBootJPAExample1.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springBootJPAExample1.Entity.User;

@Component
public class UserDaoServiceCommandLIneRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(UserDaoServiceCommandLIneRunner.class);
	
	@Autowired
	UserDaoService userdaoservice;
	
	@Override
	public void run(String... user) throws Exception {
		
		User usr = new User("Vivek Sharma","Developer");
		userdaoservice.insert(usr);
		logger.info("Print success full");;
		
	}

}
