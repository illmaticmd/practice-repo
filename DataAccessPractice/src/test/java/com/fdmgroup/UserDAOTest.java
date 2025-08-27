package com.fdmgroup;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserDAOTest {

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

	UserDAO dao = new JDBCUserDAO();
	
	@Test
	public void test_ifUserDao_canAddUserToDatabase() {
		int user_id =1;
		String username = "someusername";
		String password = "pass";
		String firstName = "larry";
		String lastName = "fisherman";
		String email = "larebear@email.com";
		String role = "someguy";
		int status = 3;
		
		User user1 = new User();
		user1.setUser_id(user_id);
		user1.setUsername(username);
		user1.setFirstName(firstName);
		user1.setLastName(lastName);
		user1.setPassword(password);
		user1.setEmail(email);
		user1.setRole(role);
		user1.setStatus(status);
		
		// User user = dao.addUser(user1);
		
		
		assertEquals(username,user1.getUsername());
	}
	
	User userToWrite = new User();
	
	@Test
	public void test_addUpdateAndRemoveUserFromDatabase() {
		
		//first make sure does not exist in Database
		/*use dao to get user with the username of user
		 * object created to test if 
		 * that username exists in database*/
		User user = dao.getUser(userToWrite.getUsername());
		assertNull(user); //makes sure its equal to null
		
		//if does not exist then add to database
		/*uses DAO to add User object 
		 *then DAO to get User with user object "userToWrite"'s 
		 *Username and set it to "user" user object to then be 
		 *used to compare to "userToWrite" */
		dao.addUser(userToWrite);
		user = dao.getUser(userToWrite.getUsername());
		assertEquals(userToWrite, user);
		
		
		/*sets "userToWrite" fields*/
		userToWrite.setPassword("somePassword");
		userToWrite.setEmail("someEmail");
		userToWrite.setFirstName("someFirstName");
		userToWrite.setLastName("someLastName");
		userToWrite.setStatus(3);
		
		/*uses dao to update "userToWrite" User
		 *then uses DAO to get User with user object "userToWrite"'s 
		 *Username and set it to "user" user object to then be 
		 *used to compare to "userToWrite" */
		dao.updateUser(userToWrite);
		user = dao.getUser(userToWrite.getUsername());
		assertEquals(userToWrite, user);
		
		/*uses DAO to remove User object "userToWrite" using it's
		 * username then DAO to get User with user 
		 * object "userToWrite"'s Username and set it to 
		 * "user" user object to then be used to 
		 * ensure that it does not exist */
		dao.removeUser(userToWrite.getUsername());
		user = dao.getUser(userToWrite.getUsername());
		assertNull(user);
	}
	

}
