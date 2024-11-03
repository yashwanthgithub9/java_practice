package com.maven.hibernate.MappingDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	@Id
	private int lid;
	private String lname;
	
	@ManyToOne
	private Student student; //One Student
	
	public Student getStudent() { //one student
		return student;
	}
	public void setStudent(Student student) { // one student
		this.student = student;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() { 
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
