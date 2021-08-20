package com.sujata.service;

import org.springframework.stereotype.Service;

@Service
public class MyDemoService {

	public String printMessage() {
		return "<h1>Welcome to the world of REST API</h1>";
	}
}
