package com.springboot.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	
	@Autowired //Field Injection
	// Searches byType "Laptop" and connects it using autowired
	private Computer comp; // Now we are using reference of Computer
	
//	//below is Constructor injection where @Autowired annotation is not needed
//	public Dev(Laptop laptop) {
//		this.laptop=laptop;
//	}
	
	
	
	public void buid()
	{
		comp.compile();
		System.out.println("\nWorking on Dev Project");
		
	}


//	@Autowired
//	// below is setter injection
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
}
