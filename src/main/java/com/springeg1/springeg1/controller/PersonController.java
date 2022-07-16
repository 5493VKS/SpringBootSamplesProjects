package com.springeg1.springeg1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springeg1.springeg1.model.Persons;
import com.springeg1.springeg1.service.PersonService;

@Controller
@SessionAttributes("name")
public class PersonController {
	
	@Autowired
	private PersonService perSrc;
	
	@RequestMapping(value="/getPList")
	public String getPersonList(ModelMap  model) {
		
		List<Persons> prsnList = perSrc.getPersonList();
		
		model.put("PersonList", prsnList);
		String username = (String) model.get("name");
		model.put("name", username);
		
		return "person";
		
	}

}
