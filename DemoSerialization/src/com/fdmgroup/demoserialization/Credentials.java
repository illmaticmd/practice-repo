package com.fdmgroup.demoserialization;

import java.io.Serializable;

public class Credentials implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private transient String password;
	
	public Credentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		
	}

	@Override
	public String toString() {
		return "Credentials [username=" + username + ", password=" + password + "]";
		
	}
	
	

}
