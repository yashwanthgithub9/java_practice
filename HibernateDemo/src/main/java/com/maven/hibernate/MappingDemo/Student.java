package com.maven.hibernate.MappingDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Override
	public String toString() {
		return "Student [sroll=" + sroll + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
	@Id
	private int sroll;
	private String sname;
	private int smarks;
	@OneToOne
	private Laptop lap; // mapping one Laptop into student, primary key of Laptop which is lid, will be created in Student table
	
	
	
	public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	public int getSroll() {
		return sroll;
	}
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	
	

}
