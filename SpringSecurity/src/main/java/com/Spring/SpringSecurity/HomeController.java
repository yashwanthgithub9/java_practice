package com.Spring.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String greet(HttpServletRequest req) {
		return "Welcome to Home Page..." + req.getSession().getId() ;
		
	}

}
