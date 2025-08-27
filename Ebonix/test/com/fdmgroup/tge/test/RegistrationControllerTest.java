package com.fdmgroup.tge.test;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.tge.user.ReadCommand;
import com.fdmgroup.tge.user.RegistrationController;
import com.fdmgroup.tge.user.User;
import com.fdmgroup.tge.user.UserFactory;
import com.fdmgroup.tge.user.WriteCommand;

public class RegistrationControllerTest {

	RegistrationController classUnderTest;

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
	public void testRegisterNewUserCallsCreateUserOnUserFactory() {
		// arrange
		UserFactory mockUserFactory = mock(UserFactory.class);
		WriteCommand mockWriteCommand = mock(WriteCommand.class);
		ReadCommand mockReadCommand = mock(ReadCommand.class);

		classUnderTest = new RegistrationController(mockUserFactory, mockWriteCommand, mockReadCommand);

		// act
		classUnderTest.registerNewUser(null, null, null);

		// assert
		verify(mockUserFactory).createUser(null, null);
	}

	@Test
	public void testRegisterNewUserCallsReadUserOnReadCommand() {
		// arrange
		UserFactory mockUserFactory = mock(UserFactory.class);
		WriteCommand mockWriteCommand = mock(WriteCommand.class);
		ReadCommand mockReadCommand = mock(ReadCommand.class);

		classUnderTest = new RegistrationController(mockUserFactory, mockWriteCommand, mockReadCommand);

		// act
		classUnderTest.registerNewUser("okay", null, null);

		// assert
		verify(mockReadCommand).readUser("okay");
	}

	@Test
	public void testRegisterNewUserCallsReadUserOnWriteCommand() {
		// arrange
		UserFactory mockUserFactory = mock(UserFactory.class);

		User user = new User();
		user.setUsername("user");
		user.setPassword("pass");
		when(mockUserFactory.createUser("user", "pass")).thenReturn(user);

		WriteCommand mockWriteCommand = mock(WriteCommand.class);
		ReadCommand mockReadCommand = mock(ReadCommand.class);

		classUnderTest = new RegistrationController(mockUserFactory, mockWriteCommand, mockReadCommand);

		// act
		classUnderTest.registerNewUser("user", "pass", null);

		// assert
		verify(mockWriteCommand).writeUser(user);
	}

}
