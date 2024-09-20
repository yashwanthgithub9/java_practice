package com.Junit5Demos;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ SquareOfNumTest.class, SquareOfNumTest2.class, SquareOfNumTest3.class })
public class AllTests {

}
 // Add Test class names in the above list to include it in test suit.