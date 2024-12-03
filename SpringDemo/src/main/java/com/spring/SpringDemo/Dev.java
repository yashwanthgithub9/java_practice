package com.spring.SpringDemo;

public class Dev {
	
	private Computer comp;
	

	public Dev(Computer comp) {
		super();
		this.comp = comp;
	}

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
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
