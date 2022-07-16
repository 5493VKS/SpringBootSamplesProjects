package com.webappJPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.webappJPA.dao.Aliendao;
import com.webappJPA.model.Alien;

@Controller
public class HomeController {

	@Autowired
	Aliendao adao;
	@RequestMapping
	public String getPage() {
		System.out.println("hello i love you");
		return "home";
	}
	
	@RequestMapping(value="adddetails")
	public String saveDetailes(Alien alien) {
		
		adao.save(alien);
		System.out.println("Success");
		return "home";
	}
	
	@RequestMapping(value="showData")
	public ModelAndView getData(@RequestParam int eid) {
		
		System.out.println(" in getData");
		ModelAndView mv = new ModelAndView("showdata");
		Alien al = adao.findById(eid).orElse(new Alien());
		
		System.out.println(adao.findByTech("java"));
		System.out.println(adao.findByEidGreaterThan(102));
		System.out.println(adao.findByEidSorted("java"));
		mv.addObject(al);
		return mv;
		
	}
	
	//RestService
	@RequestMapping("/aliens")
	@ResponseBody
	public String getResult() {
		
		return adao.findAll().toString();
	}
	@RequestMapping("/aliens/{eid}")
	@ResponseBody
	public String getResult(@PathVariable("eid") int eid) {
		
		return adao.findById(eid).toString();
	}
	
	//Resservice with json format
	@RequestMapping(value="/allalienswithjson")
	@ResponseBody
	public List<Alien> getAlienDetails() {
		
		return adao.findAll();
	}
	
	@RequestMapping(value="/aliensbyidwithjson/{eid}")
	@ResponseBody
	public Optional<Alien> getAlienDetails(@PathVariable("eid") int eid) {
		
		return adao.findById(eid);
		
	}
	@RequestMapping(path="/allalienswithjxml", produces = {"application/xml"})
	@ResponseBody
	public List<Alien> getAlienDetails1(){
		
		return adao.findAll();
	}
	
	
	
}
