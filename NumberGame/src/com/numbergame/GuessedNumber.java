package com.numbergame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GuessedNumber {
	int guesscount=0;
	ArrayList<Integer> ar= new ArrayList<>();
	public boolean check(int x, int y,String name) {
		guesscount++;
		ar.add(y);
		if (x==y) {
			print(x,guesscount,ar,name);
			return true;
		}
		else {
			wrong(x,y,name);
			guesscount++;
		}
		return false;
		
	}
	private void wrong(int x, int y, String name) {
		// TODO Auto-generated method stub
		if (x>y) {
			System.out.print("random number > "+y);
		}
		else {
			System.out.print("random number < "+y);
		}
		System.out.println("... Guess again!");
		@SuppressWarnings("resource")
		int guessednum = new Scanner(System.in).nextInt();

		check(x,guessednum,name);
	}
	public void print(int x,int g,ArrayList<Integer> ar, String player) {
		System.out.println("You have guessed it in "+g+" number of chances the number is "+x);
		System.out.println("Your guesses are "+ar);
		System.out.println("Do you want to play again ? (Y/N) ?");
		String c= new Scanner(System.in).next();
		if (c.equals("Y")) {
			
			NumberGame.game(player);
		}
		else
			System.out.println("Game Ended");
	}
}
