package com.fdmgroup.tdd.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.tdd.groupcontroller.DatabaseReader;
import com.fdmgroup.tdd.groupcontroller.DatabaseWriter;
import com.fdmgroup.tdd.groupcontroller.GroupController;

public class GroupControllerTest {

	private GroupController classUnderTest;
	
	
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
	public void testGetAllTraineesCallsReadGroupOnDatabaseReader() {
		// arrange
		DatabaseReader mockDataBaseReader = mock(DatabaseReader.class); 
		classUnderTest = new GroupController(mockDataBaseReader);

		// act
		classUnderTest.getAllTrainees();

		// assert
		verify(mockDataBaseReader).readGroup();
	}
	@Test
	public void testAddTrainee() {
		// arrange
		DatabaseWriter mockDataBaseWriter = mock(DatabaseWriter.class);
		classUnderTest = new GroupController(mockDataBaseWriter);

		// act
		classUnderTest.addTrainee(null);

		// assert
		verify(mockDataBaseWriter).addTrainee(null);
	}
	@Test
	public void testRemoveTraineeByUsername() {
		// arrange
		DatabaseWriter mockDataBaseWriter = mock(DatabaseWriter.class); 
		classUnderTest = new GroupController(mockDataBaseWriter);

		// act
		classUnderTest.removeTraineeByUsername(null);

		// assert
		verify(mockDataBaseWriter).deleteTraineeByUsername(null);
	}
}
