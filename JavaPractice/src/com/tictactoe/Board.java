package com.tictactoe;

public class Board {
	
	
	public void buildBoard() {
		String [][] board= new String[3][3];
		int init=0;
		for (int i = 0; i < board.length; i++) {
			System.out.println("");
			for (int j = 0; j < board.length; j++) {
				board[i][j]=String.valueOf(init);
				System.out.print("|"+board[i][j]+"|");
				init++;
			}
		}System.out.println("");
		
		System.out.println(board[2][2]);
		board[2][2]="X";
		System.out.println(board[2][2]);
		printboard(board);
			
	}

	public void printboard(String [][] Arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length; j++) {
				System.out.print("|"+Arr[i][j]+"|");
			}System.out.println("");
		}
		
	}

	

}
