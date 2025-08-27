package com.fdmgroup.demojsonjackson;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User extends Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private static int currentId;

	@JsonProperty("user_id")
	private int id;
	@JsonProperty("access")
	private Credentials credentials;
	
	public User() {
		super();
	}

	public User(String username, String password, String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		credentials = new Credentials(username, password);
	}

	public int getId() {
		if (id == 0) {
			id = ++currentId;
		}
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	@Override
	public String toString() {
		return "User [id=" + getId() + ", firstName= " + getFirstName() + ", lastName= " + getLastName()
				+ ", credentials=" + credentials + "]";
	}

}
