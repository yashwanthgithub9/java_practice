package com.springboot.SpringBootDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // Now Desktop is also a component so spring will have ambiguity
@Primary
public class Desktop implements Computer{

	@Override
	public void compile() {
		// TODO Auto-generated method stub
		System.out.println("\nCompiling in Desktop which is bit fast");
		
	}

}

//Field comp in com.springboot.SpringBootDemo.Dev required a single bean, but 2 were found:
//	- desktop: defined in file [C:\Users\DELL\git\java_practice\SpringBootDemo\target\classes\com\springboot\SpringBootDemo\Desktop.class]
//	- laptop: defined in file [C:\Users\DELL\git\java_practice\SpringBootDemo\target\classes\com\springboot\SpringBootDemo\Laptop.class]
//
//This may be due to missing parameter name information