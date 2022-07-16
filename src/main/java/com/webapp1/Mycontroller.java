package com.webapp1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {
	
	
	@RequestMapping(value="getEmpDetailsUsingModelObject")
	public ModelAndView getEmpDetails(Emp emp) {
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("empobj",emp);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "home")	
	@ResponseBody
	public String getPage() {
		
		System.out.println("hi jsp page");
		return "Hi I am running and you can see me";
	}
	
	@RequestMapping(value="getMessage")
	public String getMessage(HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		String msg = req.getParameter("msg");
		session.setAttribute("msg", msg);
		return "home";
		
	}
	
	@RequestMapping(value="getMessageSpringBootFeature")
	public String getMessage(String msg, HttpSession session) {
		System.out.println("hi: "+msg);
		session.setAttribute("msg", msg);
		return "home";
	}
	
	@RequestMapping(value="getMessageModelAndViewSpringBootFeature")
	public ModelAndView getMessage(@RequestParam("msg") String message) {
		
		ModelAndView mv=  new ModelAndView();
		mv.addObject("msg", message);
		mv.setViewName("home");
		return mv;
	}
}
