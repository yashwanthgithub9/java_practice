package com.oops;

public class CricInd extends ICC implements numberOfOvers,playingFormat{
	public int worldcups=4;
	public int rank=1;
	public String country = "India";
	//int defaultovers=100;
//	@Override
	public void playWorldCup() {
		// TODO Auto-generated method stub
		System.out.println("India is Playing worldcup for "+totalWc+" times");
//		super.playWorldCup();
	}
	@Override
	public void winWorldCup() {
		// TODO Auto-generated method stub
		System.out.println("India won the world cup for " + worldcups+" times");
//		super.winWorldCup();
	}
	@Override
	void venue() {
		// TODO Auto-generated method stub
		System.out.println("Playing in "+country);
	}
	@Override
	public String format() {
		// TODO Auto-generated method stub
		return "ODI";
		
	}
	@Override
	public Integer overs() {
		// TODO Auto-generated method stub
		return 50;
		
	}
	public void playing() {
		System.out.println("Overridden Playing from CricInd class");
	}
	public void play() {
		System.out.println("Overridden Play from CricInd Class");
	}
	

}
