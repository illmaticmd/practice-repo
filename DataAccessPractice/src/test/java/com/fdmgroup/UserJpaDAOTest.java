package com.fdmgroup;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserJpaDAOTest {

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
	
	UserDAO dao = new JpaUserDao();
	User userToWrite = new User();

	@Test
	public void test_ifUserDao_canWriteUpdateAndDeleteUserFromDatabase() {
	
		User user = dao.getUser(userToWrite.getUsername());
		assertNull(user);
		
		dao.addUser(userToWrite);
		user = dao.getUser(userToWrite.getUsername());
		assertEquals(userToWrite, user);
		
		userToWrite.setPassword("newPassword");
		userToWrite.setEmail("newEmail");
		userToWrite.setFirstName("newFirstName");
		userToWrite.setLastName("newLastName");
		userToWrite.setStatus(5);
		dao.updateUser(userToWrite);
		user = dao.getUser(userToWrite.getUsername());
		assertEquals(userToWrite, user);
		
		dao.removeUser(userToWrite.getUsername());
		user = dao.getUser(userToWrite.getUsername());
		assertNull(user);
	}


}
