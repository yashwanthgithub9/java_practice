package com.springboot.SpringBootWebDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController // this can be used in place of @controller and we can remove @responsebody
public class HomeController {
	
	@RequestMapping("/") //is @Controller is used, request mapping will search for Welcom to Home page.html file
//	@ResponseBody// to show only content we have to use this annotations
	public String greet() {
		return "Welcom to Home page";
		
	}
	
	@RequestMapping("/about")
	public String about() {
		
		return "About is under construction";
	}

}
