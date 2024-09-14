package com.threads;

public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		ClassExtendsThread t1 = new ClassExtendsThread();
//		//t1.start();
//		Thread t2 = new Thread(new ClassImplementsRunnable());
//		//t2.start();
		
		for (int i = 0; i <10; i++) {
			ClassExtendsThread t1 = new ClassExtendsThread();
			t1.start();
			try {
				t1.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread t2 = new Thread(new ClassImplementsRunnable());
//			t2.start();
			t2.setPriority(8);
			t2.start();
//			System.out.println(t2.getState()); //Runnable
//			t2.sleep(100);
//			System.out.println(t2.getState()); // Terminated
//			t2.join();
//			System.out.println(t2.getState()); //Terminated
			try {
				t2.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//t2.notify();
			
		}

	}

}
