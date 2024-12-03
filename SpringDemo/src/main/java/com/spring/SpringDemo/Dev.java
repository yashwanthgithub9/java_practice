package com.spring.SpringDemo;

public class Dev {
	
	private Computer comp;
	
	
	public Dev(Computer comp) {
		super();
		this.comp = comp;
	} 

	public void setLaptop(Computer comp) {
		this.comp = comp;
	}

	public Dev() {
		System.out.println("Dev Constructor");
	}
	
	public void build() {
		comp.compile();
		System.out.println("Building Spring Demo");
	}

}
