package com.springboot1Restfull.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot1Restfull.model.Survey;
import com.springboot1Restfull.service.SurveyService;

@RestController
public class SurveyController {

	@Autowired
	private SurveyService surveys;
	
	//@RequestMapping("/surveys/{surveyId}/getsurveys")
	@GetMapping("/surveys/{surveyId}/getsurveys")
	public Survey getSurveys(@PathVariable String surveyId) {

		Survey srvys = surveys.retrieveSurvey(surveyId);
		
		return srvys;

	}
}
