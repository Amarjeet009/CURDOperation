package com.amarj.curdoperation.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.amarj.curdoperation.model.Person;

@Controller
public class HomeController {
	
/*	@RequestMapping("/")
	public String showHomePage()
	{
		return "index";
	}*/
	
	@Autowired
	Person person;

	@RequestMapping("/person/add")
	public ModelAndView onLoad(HttpSession session) {
	
		ModelAndView mv = new ModelAndView("index");
		session.setAttribute("person", person);
		return mv;
	}
}
