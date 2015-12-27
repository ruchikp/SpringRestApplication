package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	
@RequestMapping("/")
public String showMessage(){
	
	return "My Spring Rest mapping";
		
	
	
	}
	}
