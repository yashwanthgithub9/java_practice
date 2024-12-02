package com.springboot.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	
	@Autowired //Field Injection
	// Searches byType "Laptop" and connects it using autowired
	private Laptop laptop;
	
	public void buid()
	{
		laptop.compile();
		System.out.println("\nWorking on Dev Project");
		
	}
}
