package com.maven.JpaDemo2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Studentinfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll;
	private String name;
	private int marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Studentinfo [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
