package com.fdmgroup.loggingdemo.model;

public class Account {

	private String userName;
	private String password;
	
	Account(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
