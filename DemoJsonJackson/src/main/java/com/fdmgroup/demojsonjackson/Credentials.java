package com.fdmgroup.demojsonjackson;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Credentials implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String username;
	@JsonIgnore
	private String password;
	
	public Credentials() {
		super();
	}

	public Credentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		
	}

	@Override
	public String toString() {
		return "Credentials [username=" + username + ", password=" + password + "]";
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
