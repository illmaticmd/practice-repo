package com.fdmgroup.tge.test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.tge.user.User;
import com.fdmgroup.tge.user.UserFactory;

public class UserFactoryTest {

	private UserFactory classUnderTest;

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
	public void testCreateUserReturnsUsernameAndPassword() {
		// arrange
		classUnderTest = new UserFactory();
		String input = "eh";
		String input2 = "ok";
		User expected = new User();
		expected.setUsername(input);
		expected.setPassword(input2);
		// User expected = classUnderTest.getUsers();
	

		// act
		User actual = classUnderTest.createUser(input, input2);

		// assert
		assertEquals(expected, actual);
	}

}
