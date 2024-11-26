package com.maven.hibernate.Caching;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
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
