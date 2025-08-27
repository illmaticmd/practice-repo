package com.fdmgroup.tddpractice.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.tddpractice.source.Attendant;
import com.fdmgroup.tddpractice.source.Denominations;
import com.fdmgroup.tddpractice.source.QuarterDispenser;

public class QuarterDispenserTest {

	private QuarterDispenser classUnderTest;

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
	public void testExchangeReturnsFourQuartersOnOneDollarInput() {
		// arrange
		classUnderTest = new QuarterDispenser();
		Denominations input = Denominations.ONE;
		int expected = 4;

		// act
		int actual = classUnderTest.exchange(input);

		// assert
		assertEquals(expected, actual);
	}

	@Test
	public void testExchangeReturnsTwentyQuartersOnFiveDollarInput() {
		// arrange
		classUnderTest = new QuarterDispenser();
		Denominations input = Denominations.FIVE;
		int expected = 20;

		// act
		int actual = classUnderTest.exchange(input);

		// assert
		assertEquals(expected, actual);
	}

	@Test
	public void testExchangeReturnsFortyQuartersOnTenDollarInput() {
		// arrange
		classUnderTest = new QuarterDispenser();
		Denominations input = Denominations.TEN;
		int expected = 40;

		// act
		int actual = classUnderTest.exchange(input);

		// assert
		assertEquals(expected, actual);
	}

	@Test
	public void testRefillCallsAddQuartersOnAttendant() {
		// arrange
		// classUnderTest = new QuarterDispenser(); //based on class we are testing ofc
		Attendant mockAttendant = mock(Attendant.class); // class object of the type that is mocked

		// classUnderTest.setAttendant(mockAttendant); //setting up for act
		classUnderTest = new QuarterDispenser(mockAttendant);

		// act
		classUnderTest.refill();

		// assert
		// assertEquals(expected, actual);
		verify(mockAttendant).addQuarters(); // verifying on mock object to the method that is called on it //implicitly
												// expects addQuarters 1 time
	}

	@Test
	public void testEmptyCallsMakeDepositOnAttendantWhenAmountEqualtoFiveHundred() {
		// arrange
		classUnderTest = new QuarterDispenser(); // must get instance of class we are testing
		Attendant mockAttendant = mock(Attendant.class);// class object of the type that is mocked
		when(mockAttendant.getDollars()).thenReturn(500); // when mock of method we want equals/returns 500 - stubbing?
		classUnderTest.setAttendant(mockAttendant); // pass in reference to mock

		// act
		classUnderTest.empty(); // we are testing that empty is doing what it needs to

		// assert
		// assertEquals(expected, actual);
		verify(mockAttendant, times(1)).makeDeposit(); // verifying on mock object to the method that we want to make
														// sure works when empty is called exactly once
	}

	@Test(expected = RuntimeException.class) // assertion - this is our expected Exception
	public void testEmptyCallsGetDollarThrowsWhenAmountZero() {
		// arrange
		classUnderTest = new QuarterDispenser(); // must get instance of class we are testing
		Attendant mockAttendant = mock(Attendant.class);// class object of the type that is mocked
		when(mockAttendant.getDollars()).thenReturn(0); // when mock of method we
		// want equals/returns 0 - stubbing?
		classUnderTest.setAttendant(mockAttendant); // pass in reference to mock

		// act
		classUnderTest.empty(); // we are testing that empty is doing what it needs to
	}
}
