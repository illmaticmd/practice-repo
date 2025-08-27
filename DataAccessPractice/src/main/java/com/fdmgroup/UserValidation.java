package com.fdmgroup;

public class UserValidation {

	private UserDAO dao = new JpaUserDao();

	public boolean validateUser(User user) {
		User userSearch = dao.getUser(user.getUsername());
		if (userSearch != null) {
			return false;
		}
		return true; 
	}
}
