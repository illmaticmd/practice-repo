package com.fdmgroup.demotdd.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.demotdd.source.Circle;

public class CircleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInstanceOfCircle() {
		// fail("Not yet implemented");
		// arrange & act
		Object classUnderTest = new Circle(3.00);

		// assert
		assertTrue(classUnderTest instanceof Circle);

	}

	@Test
	public void testGetRadiusReturnsThreeOnCircleRadiusThree() {
		// arrange
		Circle classUnderTest = new Circle(3.00);
		double expected = 3.00;

		// act
		double actual = classUnderTest.getRadius();

		// assert
		assertEquals(expected, actual, 0.001);
	}

}
