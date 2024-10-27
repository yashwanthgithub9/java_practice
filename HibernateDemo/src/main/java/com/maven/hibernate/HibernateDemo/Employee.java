package com.maven.hibernate.HibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Employee Table1") //to change name of the table, default table name will be entity name
//default entity name will be Class name
public class Employee {
	@Id // declared as primary key
	private int empid;
	@Transient // will not be persisted or not stored in table
	private String name;
	@Column(name = "Role Column")
	private String role;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
