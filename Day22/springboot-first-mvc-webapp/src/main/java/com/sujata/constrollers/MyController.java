package com.sujata.constrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/first")
	public ModelAndView firstController() {
		return new ModelAndView("output", "message", "Hello everyone welcome to Spring boot web mvc Application");
	}
}
