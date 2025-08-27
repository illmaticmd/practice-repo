package com.fdmgroup.demotdd.test;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import static com.fdmgroup.demotdd.source.ShapeShifter.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.demotdd.source.ShapeShifter;
import com.fdmgroup.demotdd.source.Square;

public class ShapeShifterTest {

	private ShapeShifter classUnderTest;

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
	public void testSquaretoCircleCallsGetDiagonalAtSizeLimit() {
		// arrange
		classUnderTest = new ShapeShifter();
		Square mockSquare = mock(Square.class);
		when(mockSquare.getSide()).thenReturn(LIMIT);
		
		// act
		
		classUnderTest.squareToCircle(mockSquare);
		
		
		// assert
		verify(mockSquare, times(1)).getDiagonal();
	}

	@Test
	public void testSquaretoCircleCallsGetSideOnSquareOverSizeLimit() {
		// arrange
		classUnderTest = new ShapeShifter();
		Square mockSquare = mock(Square.class);
		when(mockSquare.getSide()).thenReturn(ShapeShifter.LIMIT + 1);
		
		// act
		
		classUnderTest.squareToCircle(mockSquare);
		
		
		// assert
		verify(mockSquare, times(2)).getSide();
	}
}
