package com.spring.SpringDemo;

public class Laptop implements Computer{
	
	public Laptop() {
		System.out.println("Laptop Constructor");
	}
	
	@Override
	public void compile() {
		System.out.println("Compiling in Laptop");
	}

}
