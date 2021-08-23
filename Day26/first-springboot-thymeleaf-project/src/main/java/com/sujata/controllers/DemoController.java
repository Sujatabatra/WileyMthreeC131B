package com.sujata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping("/my")
	public ModelAndView myDemoController() {
		return new ModelAndView("first","message","Displaying view using Thymeleaf!");
	}
}
