package com.SpringOAuth2.DemoOAuth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String greet() {
		return "Welcome to Home page controller";
	}

}
