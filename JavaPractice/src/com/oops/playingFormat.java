package com.oops;

public interface playingFormat {
	
	String format();
	Integer overs();// As the same method is being declared as abstract in numberOfOvers interface there is no ambiguity
	// this helps in multiple inheritance using interfaces
	static void play() {
		System.out.println("hi from static play method");
		//static methods can be there
	}
	default void playing() {
		//default methods can be there
		System.out.println("Hi from default play method");
	}
//	void plays() {
//		//we can declare a method implementation in interface
//	}
}
