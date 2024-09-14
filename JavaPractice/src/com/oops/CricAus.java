package com.oops;

public class CricAus extends ICC{
	public int worldcups=6;
	public int rank =2;
	public String country="Australia";
	
	public void getDetails() {
		System.out.println(country + " Played "+totalWc +" World Cups and Won "+worldcups);
	}

	@Override
	void venue() {
		// TODO Auto-generated method stub
		System.out.println("Playing Cricket in "+country);
		
	}

}
