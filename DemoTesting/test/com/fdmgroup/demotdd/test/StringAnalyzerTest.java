package com.fdmgroup.demotdd.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.demotdd.source.StringAnalyzer;

public class StringAnalyzerTest {

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
	public void testIsPalendromeReturnsTrueOnStringLengthOne() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "a";
		//boolean expected = true;
		
		//act
		//boolean actual = classUndertest.isPalendrome(input);
		
		//assert
		//act & assert
		assertTrue(classUndertest.isPalendrome(input)); //putting act in assert
	}
	
	@Test
	public void testIsPalendromeReturnsTrueOnStringLengthTwoEndsMatch() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "aa";
		//boolean expected = true;
		
		//act
		//boolean actual = classUndertest.isPalendrome(input); - don't need this
		
		//assert
		//act & assert
		assertTrue(classUndertest.isPalendrome(input)); //putting act in assert
	}
	
	@Test
	public void testIsPalendromeReturnsFalseOnStringLengthTwoEndsNotMatched() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "ab";
		
		//act & assert
		assertFalse(classUndertest.isPalendrome(input)); //putting act in assert
	}
	
	@Test
	public void testIsPalendromeReturnsTrueOnStringLengthThreeAllMatched() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "aaa";
		
		//act & assert
		assertTrue(classUndertest.isPalendrome(input)); //putting act in assert
	}
	
	@Test
	public void testIsPalendromeReturnsTrueOnStringLengthThreeEndsMatched() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "aza";
		
		//act & assert
		assertTrue(classUndertest.isPalendrome(input)); //putting act in assert
	}
	
	@Test
	public void testIsPalendromeReturnsFalseOnStringLengthThreeEndsNotMatched() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "abc";
		
		//act & assert
		assertFalse(classUndertest.isPalendrome(input)); //putting act in assert
	}
	
	@Test
	public void testIsPalendromeReturnsTrueOnStringLengthFourAllMatched() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "aaaa";
		
		//act & assert
		assertTrue(classUndertest.isPalendrome(input)); //putting act in assert
	}
	
	@Test
	public void testIsPalendromeReturnsFalseOnStringLengthFourEndsNotMatched() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "aaab";
		
		//act & assert
		assertFalse(classUndertest.isPalendrome(input)); //putting act in assert
	}
	
	@Test
	public void testIsPalendromeReturnsFalseOnStringLengthFourInnersNotMatched() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "abca";
		
		//act & assert
		assertFalse(classUndertest.isPalendrome(input)); //putting act in assert
	}
	
	@Test
	public void testIsPalendromeReturnsTrueOnInputString_step_on_no_pets() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "step on no pets";
		
		//act & assert
		assertTrue(classUndertest.isPalendrome(input)); //putting act in assert
	}
	
	@Test
	public void testIsPalendromeReturnsTrueOnInputString_hannah() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "hannah";
		
		//act & assert
		assertTrue(classUndertest.isPalendrome(input)); //putting act in assert
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIsPalendromeThrowsOnEmptyStringInput() {
		//arrange
		StringAnalyzer classUndertest = new StringAnalyzer();
		String input = "";
		
		//act & assert
		classUndertest.isPalendrome(input); //putting act in assert
	}
}
