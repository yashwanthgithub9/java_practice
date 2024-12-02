package com.springboot.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args); // SpringApplication.run will create Spring Container for project
		
		Dev dev = new Dev(); // Creating an object
		System.out.println(dev.buid()); // using object, this is not how we use DI, Spring should create an obj for us
	}

}
