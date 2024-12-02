package com.springboot.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	
	@Override
	public void compile() {
		System.out.println("\nCompiling in Laptop is bit slow");
	}

}
