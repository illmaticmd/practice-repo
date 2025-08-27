package com.fdmgroup;

public class UserRegister {
	private UserDAO dao = new JpaUserDao();

	public User registerUser(User user) {

		dao.addUser(user);
		return user;

	}

}
