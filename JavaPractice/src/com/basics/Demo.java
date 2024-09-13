package com.basics;

import java.util.Scanner;

public class Demo extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Third th = new Third();
//		int add=th.Add(5, 6);
//		System.out.println(add);
		Computer comp = new Computer();
//		System.out.println("Enter Money");
		Scanner sc = new Scanner(System.in);
//		int money = sc.nextInt();
//		comp.getMePen(money);	
		comp.getMePen(comp.Add(3,3 ));
		

	}

}
