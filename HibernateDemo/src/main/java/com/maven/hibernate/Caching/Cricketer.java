package com.maven.hibernate.Caching;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cricketer{
	@Id
	private String cname;
	private int score;
	private String jersey;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getJersey() {
		return jersey;
	}
	public void setJersey(String jersey) {
		this.jersey = jersey;
	}
	@Override
	public String toString() {
		return "Cricket [cname=" + cname + ", score=" + score + ", jersey=" + jersey + "]";
	}
	public Cricketer(String cname, int score, String jersey) {
		super();
		this.cname = cname;
		this.score = score;
		this.jersey = jersey;
	}
	public Cricketer() {
		// TODO Auto-generated constructor stub
	}
	

	
	

}
