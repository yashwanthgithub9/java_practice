package com.Junit5Demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SquareOfNumTest3 {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Running before each test");
	}

	@Test
	@BeforeEach
	void test111() {
//		fail("Not yet implemented");
		SquareOfNum sq = new SquareOfNum();
		assertNotEquals(50, sq.multiply(55, 10));
		System.out.println("From test 1");
	}
	@Test
	void test1() {
//		fail("Not yet implemented");
		SquareOfNum sq = new SquareOfNum();
		assertNotEquals(50, sq.multiply(55, 10));
		System.out.println("From test 2");
	}
	@Disabled // Disables test check in test runner it will be disabled state
	@Test
	void test11() {
//		fail("Not yet implemented");
		SquareOfNum sq = new SquareOfNum();
		assertNotEquals(50, sq.multiply(55, 10));
		System.out.println("From test 3");
	}
	@Test // not mandatory to use static  
	@DisplayName(value = "Testing Display name") // in test cases, name will be shown as value instead if print() just cross check
	void print() {
		System.out.println("After All Test Cases");
	}
	
	@BeforeAll //Mandatory to use static
	static void print1() {
		System.out.println("Before All Test Cases");
	}

}
