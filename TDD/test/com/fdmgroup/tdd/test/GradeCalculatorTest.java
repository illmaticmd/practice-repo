package com.fdmgroup.tdd.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.tdd.gradecalculator.GradeCalculator;

public class GradeCalculatorTest {

	private GradeCalculator classUnderTest;
	
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
	public void testGetClassificationReturnsFailWhenInputEqualsSeventyFour() {
		//arrange
		classUnderTest = new GradeCalculator();
		Double input = (double) 74;
		String expected = "fail";
		
		//act
		String actual = classUnderTest.getClassification(input);
		
		//assert
		assertEquals(expected, actual);
	}
	@Test
	public void testGetClassificationReturnsPassWhenInputEqualsSeventyFive() {
		//arrange
		classUnderTest = new GradeCalculator();
		Double input = (double) 75;
		String expected = "pass";
		
		//act
		String actual = classUnderTest.getClassification(input);
		
		//assert
		assertEquals(expected, actual);
	}
	@Test
	public void testGetClassificationReturnsMeritWhenInputEqualsEighty() {
		//arrange
		classUnderTest = new GradeCalculator();
		Double input = (double) 80;
		String expected = "merit";
		
		//act
		String actual = classUnderTest.getClassification(input);
		
		//assert
		assertEquals(expected, actual);
	}
	@Test
	public void testGetClassificationReturnsMeritWhenInputEqualsNinety() {
		//arrange
		classUnderTest = new GradeCalculator();
		Double input = (double) 90;
		String expected = "distinction";
		
		//act
		String actual = classUnderTest.getClassification(input);
		
		//assert
		assertEquals(expected, actual);
	}
	
}
