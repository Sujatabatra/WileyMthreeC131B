package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.service.MyDemoService;

@RestController
public class MyResource {

	@Autowired
	MyDemoService myDemoService;
	/*
	 * printMessage : anyone can call with uri /first on http get method 
	 * and return type will be plain text
	 */
	@RequestMapping(path = "/first",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String serviceOne() {
		return myDemoService.printMessage();
	}
	
	@RequestMapping(path = "/second",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String serviceTwo() {
		return myDemoService.printMessage();
	}
}
