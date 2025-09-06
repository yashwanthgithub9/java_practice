package com.numbergame;

import java.util.Scanner;

public class NumberGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name : ");
		String name=sc.next();
		game(name);
		
	}

	static void game(String name) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Hi "+"\""+name+"\""+" Welcome...");
		int randomnumber=(int) (100*Math.random());
		System.out.println("Random Number between 1 and 100 :"+randomnumber);
		System.out.println("Hi "+"\""+name+"\""+" Random number has been generated guess the number now");
		int guessednum = sc.nextInt();
		
		GuessedNumber gn= new GuessedNumber();
		System.out.println(gn.check(randomnumber,guessednum,name));
		
	}

}
