package com.basics;

public class Computer extends Third{
	public String compileCode(String str) {
		return "Code Compiled successfully";
		
	}

	public void getMePen(int money) {
		// TODO Auto-generated method stub
		if (money >10)
		System.out.println("Purchase accepted");
		else
			System.out.println("Purchase rejected");
	}

	@Override
	public int Add(int a, int b) {
		// TODO Auto-generated method stub
//		return super.Add(a, b);
		return a+b+5;
	}
	
	

}
