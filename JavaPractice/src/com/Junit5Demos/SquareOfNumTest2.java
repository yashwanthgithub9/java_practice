package com.Junit5Demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareOfNumTest2 {

	@Test
	void test() {
//		fail("Not yet implemented");
		SquareOfNum sq= new SquareOfNum();
		assertEquals(6, sq.sum(3, 3));
	}

}
