package com.threads;

public class ClassExtendsThread extends Thread{
	public void run() {
		System.out.println("extending Thread "+Thread.currentThread().getPriority());
//		System.out.println("extending Thread "+Thread.MAX_PRIORITY);
//		System.out.println("extending Thread "+Thread.MIN_PRIORITY);
//		System.out.println(Thread.getAllStackTraces());
//		System.out.println(Thread.activeCount());

	}

}
