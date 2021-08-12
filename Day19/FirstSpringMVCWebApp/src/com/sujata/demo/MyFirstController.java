package com.sujata.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {

	@RequestMapping("/first")  //MappingHandler
	public ModelAndView firstController() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome to Spring Web MVC from /first url");
		mv.setViewName("output.jsp");
		return mv;
	}
	
	@RequestMapping("/second")
	public ModelAndView secondController() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome to Spring Web MVC from /second url");
		mv.setViewName("output.jsp");
		return mv;
	}
	
	@RequestMapping("/my")
	public ModelAndView thirdController() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome to Spring Web MVC from /my url");
		mv.setViewName("output.jsp");
		return mv;
	}
}
