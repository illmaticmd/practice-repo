package com.fdmgroup.tge.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.tge.user.FileReadCommand;
import com.fdmgroup.tge.user.FileWriteCommand;
import com.fdmgroup.tge.user.User;

public class FileReadCommandTest {

	FileReadCommand classUnderTest;
	
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
	public void testFileReadCommandReturnsUser() {
		//arrange
		String input = "someuser";
		String input2 = "somepass";
		classUnderTest = new FileReadCommand();
		User expected = new User();
		expected.setUsername(input);
		expected.setPassword(input2);
	
		
		//act
		
		User actual = classUnderTest.readUser(input);
		
		//assert
		assertEquals(expected,actual);
		
	}

}
