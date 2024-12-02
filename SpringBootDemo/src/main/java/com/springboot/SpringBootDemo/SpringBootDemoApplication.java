package com.springboot.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootDemoApplication.class, args); // SpringApplication.run will create Spring Container for project
		
//		Dev dev = new Dev(); // Creating an object
//		System.out.println(dev.buid()); // using object, this is not how we use DI, Spring should create an obj for us
		
//		ApplicationContext applicationContext; 
		//run() returns public static ConfigurableApplicationContext , this extends Application context
		// so run will gives us obj of ApplicationContext
		
		ApplicationContext applicationContext = SpringApplication.run(SpringBootDemoApplication.class, args);
		
		// obj can be created applicationContext
		
		Dev dev = applicationContext.getBean(Dev.class);//Error: Could not find or load main class com.springboot.SpringBootDemo.SpringBootDemoApplication
		//Caused by: java.lang.ClassNotFoundException: com.springboot.SpringBootDemo.SpringBootDemoApplication
		// To solve the above error we have to declare the required class as Component, so that Spring will tc of class and objects
		dev.buid();
	}

}
