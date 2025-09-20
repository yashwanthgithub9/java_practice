package com.BankingApp;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========================");
		System.out.println("Welcome to YBI Bank");
		System.out.println("========================");
		System.out.println("Choose from below banking options");
		System.out.println("---------------------------------");
		System.out.println("1. Create Account");
		System.out.println("2. Login to existing account");
		System.out.println("3. Exit");
		System.out.println("enter here : ");
		
		try (Scanner sc = new Scanner(System.in)) {
			int choice = sc.nextInt();
			if (choice==1) {
				System.out.println("You have chosen to create a new Account... proceeding with it");
				CreateAccount.newAccount();
			}
			else if (choice==2) {
				System.out.println("You have chosen to login to your existing account... please enter your credentials");
			}
			else if (choice==3) {
				System.out.println("You have chosen to exit");
			}
			else {
				System.out.println("please enter correct choice");
			}
		}

	}

}
