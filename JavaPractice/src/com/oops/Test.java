package com.oops;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inheritance
		
//		CricInd ind = new CricInd();
//		System.out.println("Rank of India is "+ind.rank);
//		ind.playWorldCup();
//		CricAus aus = new CricAus();
//		aus.getDetails();
//		ind.winWorldCup();
//		System.out.println(ind.rank +" " +ind.country);
		
		//Class casting
		
//		ICC ind = new CricInd(); // Up casting creating ICC object with ref to CricInd
//		ind.winWorldCup();
//		CricInd ind1=(CricInd)ind;
//		System.out.println(ind1.rank);
//		ind1.winWorldCup();
//		ind1.playWorldCup();
//		//ind.playWorldCup(); // this won't work because ind is object of ICC which don't have that method
//		
		
//		//Encapsulation
//		
//		CricEng eng = new CricEng();
//		System.out.println(eng.totalWc);
//		eng.winWorldCup();
//		System.out.println(eng.getWorldcups());
//		eng.setWorldcups(0);
//		System.out.println(eng.getWorldcups());
		
//		CricAus aus = new CricAus();
//		aus.venue();
//		CricInd ind = new CricInd();
//		ind.venue();

		//Interfaces
		
		CricInd ind = new CricInd();
		System.out.println(ind.country+" Playing in "+ind.format()+" format having "+ind.overs()+" overs");
		ind.playing();// calling default method in interface from CricInd object, can be overridden
		playingFormat.play(); // calling static method from interface directly
		ind.play();
		System.out.println(ind.defaultovers); 
	}

}
