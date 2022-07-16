package com.springeg1.springeg1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springeg1.springeg1.model.Persons;

@Service
public class PersonService {
	
	private static List<Persons> perlist = new ArrayList<Persons>();
	
	static {
		
		perlist.add(new Persons(1,"Vivek","Mumbai","TCS"));
		perlist.add(new Persons(2,"Sanjay","MP","Wipro"));
		perlist.add(new Persons(3,"Ravi","UP","IBM"));
	}

		public List<Persons> getPersonList(){
			
			return perlist;
		}
}
