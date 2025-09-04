package com.Junit5Demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class SquareOfNumTest2 {

	@Test
	void test() {
//		fail("Not yet implemented");
		SquareOfNum sq= new SquareOfNum();
		assertEquals(6, sq.sum(3, 3));
	}
	@Test
	@RepeatedTest(value = 4) //repeats test for value number of times
	void test1() {
//		RepetitionInfo r1 = null;
		System.out.println("Test method ");
	}

}
