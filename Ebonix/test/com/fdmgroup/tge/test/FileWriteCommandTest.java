package com.fdmgroup.tge.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.tge.user.FileWriteCommand;
import com.fdmgroup.tge.user.ReadCommand;
import com.fdmgroup.tge.user.RegistrationController;
import com.fdmgroup.tge.user.UserFactory;
import com.fdmgroup.tge.user.WriteCommand;

public class FileWriteCommandTest {

	FileWriteCommand classUnderTest;
	
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
	public void testFileWriteCommandCallsWriteUserOnWriteCommand() {
//		WriteCommand mockWriteCommand = mock(WriteCommand.class);
//
//		classUnderTest = new FileWriteCommand(mockUserFactory, mockWriteCommand, mockReadCommand);
//
//		// act
//		classUnderTest.registerNewUser(null, null, null);
//
//		// assert
//		verify(mockWriteCommand).writeUser(null);
	}

}
