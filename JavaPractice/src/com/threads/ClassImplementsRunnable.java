package com.threads;

public class ClassImplementsRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implementing runnable "+Thread.currentThread().getPriority());
		
	}

}
