package com.maven.hibernate.HibernateDemo;

import jakarta.persistence.Embeddable;

@Embeddable // this will make sure to insert Empname as column in Emp table instead of creating new table
public class EmpName {
	
	private String fname;
	private String mname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "EmpName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	
	


}
