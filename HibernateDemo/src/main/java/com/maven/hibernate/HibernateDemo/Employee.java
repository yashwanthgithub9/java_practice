package com.maven.hibernate.HibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "EmpTable") //to change name of the table, default table name will be entity name
//default entity name will be Class name
public class Employee {
	@Id // declared as primary key
	private int empid;
	// will not be persisted or not stored in table
	private EmpName name;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", role=" + role + "]";
	}
	@Column(name = "Role Column")
	private String role;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public EmpName getName() {
		return name;
	}
	public void setName(EmpName name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
