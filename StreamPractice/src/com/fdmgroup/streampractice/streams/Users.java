package com.fdmgroup.streampractice.streams;

public class Users {

	String username;
	String firstname;
	String lastname;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
