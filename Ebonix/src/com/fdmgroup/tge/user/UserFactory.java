package com.fdmgroup.tge.user;

public class UserFactory {

	public User createUser(String username, String password) {
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		

		
		return u;
	}

}
