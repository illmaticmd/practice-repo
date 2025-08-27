package com.fdmgroup.demotdd.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.demotdd.source.Square;

public class SquareTest {

	private Square classUnderTest; 
	
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
	public void testInstanceClassUnderTest() {
		//arrange & act
		Object classUnderTest = new Square(5);
		
		// assert
		assertTrue(classUnderTest instanceof Square);
		//fail("Not yet implemented");
	}
	
	@Test 
	public void testGetSideReturnsFiveOnSquareSideFive() {
		//arrange
		Square classUnderTest = new Square(5);
		int expected = 5;
		
		//act
		int actual = classUnderTest.getSide();
		
		//assert
		assertEquals(expected,actual);
	}
	
	@Test 
	public void testGetSideReturnsFiveOnSquareSideNegativeFive() {
		//arrange
		Square classUnderTest = new Square(-5);
		int expected = 5;
		
		//act
		int actual = classUnderTest.getSide();
		
		//assert
		assertEquals(expected,actual);
	}

	@Test 
	public void testGetSideReturnsSixOnSquareSideSix() {
		//arrange
		Square classUnderTest = new Square(6); //arrangement change for test method change
		int expected = 6;
		
		//act
		int actual = classUnderTest.getSide();
		
		//assert
		assertEquals(expected,actual);
	}
	
	@Test 
	public void testGetPerimeterReturnsTwentyOnSquareSideFive() {
		//arrange
		classUnderTest = new Square(5); //arrangement change for test method change
		int expected =20;
		
		//act
		int actual = classUnderTest.getPerimeter();
		
		//assert
		assertEquals(expected,actual);
	}
	
	
	@Test 
	public void testGetAreaReturnsTwentyFiveOnSquareSideFive() {
		//arrange
		classUnderTest = new Square(5); //arrangement change for test method change
		int expected =25;
		
		//act
		int actual = classUnderTest.getArea();
		
		//assert
		assertEquals(expected,actual);
	}
	
	@Test
	public void testGetDiagonalOnSideSquareFive() {
		//arrange
		classUnderTest = new Square(5);
		double expected = 7.07;
		
		//act
		double actual = classUnderTest.getDiagonal();
		
		//assert
		assertEquals(expected,actual,0.001068);
	}
}
