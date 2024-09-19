package com.Junit5Demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareOfNumTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		SquareOfNum sq= new SquareOfNum();
		assertEquals(25, sq.square(5));
		assertEquals(6, sq.sum(3, 3));
	}
	

}
