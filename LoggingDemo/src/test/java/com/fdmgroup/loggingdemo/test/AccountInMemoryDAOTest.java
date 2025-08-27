package com.fdmgroup.loggingdemo.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.loggingdemo.model.Account;
import com.fdmgroup.loggingdemo.model.AccountInMemoryDAO;

public class AccountInMemoryDAOTest {

	private AccountInMemoryDAO classUnderTest;

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
		List<Account> inputList = new ArrayList<>();
		Object classUnderTest = new AccountInMemoryDAO(inputList);
		assertTrue(classUnderTest instanceof AccountInMemoryDAO);
	}

	@Test(expected = IllegalArgumentException.class) // assertion is the expected
	public void testInstantiationThrowsOnNullListInput() {
		classUnderTest = new AccountInMemoryDAO(null);
	}

	@Test
	public void testCreateAddsAccount() {
		// arrangement
		// Account mockAccount = org.mockito.Mockito.mock(Account.class); //or with
		// import static org.mockito.Mockito.*;
		List<Account> inputList = new ArrayList<>();
		classUnderTest = new AccountInMemoryDAO(inputList);
		Account mockAccount = mock(Account.class);
		int expectedSize = inputList.size() + 1;

		// act

		// classUnderTest.create(mockAccount);
		boolean created = classUnderTest.create(mockAccount);

		// assert
		if (created) {
			assertEquals(expectedSize, inputList.size());
		} else {
			fail();
		}
	}

	@Test(expected = IllegalArgumentException.class) // assertion
	public void testCreateThrowsOnNullAccountInput() {
		//arrangement
		List<Account> inputList = new ArrayList<>();
		classUnderTest = new AccountInMemoryDAO(inputList);
		
		//act
		classUnderTest.create(null);
	}

}
