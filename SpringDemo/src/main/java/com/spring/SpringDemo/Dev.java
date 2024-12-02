package com.spring.SpringDemo;

public class Dev {
	
	private Laptop laptop;
	
	
	public Dev(Laptop laptop) {
		super();
		this.laptop = laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Dev() {
		System.out.println("Dev Constructor");
	}
	
	public void build() {
		laptop.compile();
		System.out.println("Building Spring Demo");
	}

}
