package com.jspmaven.model;

public class Alien {
	
	private int aid;
	private String name;
	private String tech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Hi "+name+" your aid is "+aid+" and your current technology is "+tech;
//		return "Alien [aid=" + aid + ", name=" + name + ", tech=" + tech + "]";
	}
	

}
