package com.maven.JpaDemo2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "name","marks" }))
//Above line enforces name and mark to be unique with other entries
public class Studentinfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll;
	@Column(name="Cricketer")
	private String name;
	@Column(name="Jersey")
	private int marks;
	
	public Studentinfo() {
		super();
	}
	public Studentinfo(String string, int i) {
		// TODO Auto-generated constructor stub
		this.name=string;
		this.marks=i;
	}
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
