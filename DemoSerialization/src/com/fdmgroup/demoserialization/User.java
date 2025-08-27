package com.fdmgroup.demoserialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User extends Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private static int currentId;

	private int id;
	private Credentials credentials;

	public User(String username, String password, String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		credentials = new Credentials(username, password);
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeUTF(getFirstName());
		oos.writeObject(getLastName());
	}

	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		ois.defaultReadObject();
		
		String firstName = ois.readUTF();
		this.setFirstName(firstName);
		
		Object lastNameObj  = ois.readObject();
		if(lastNameObj instanceof String) {
			String lastName = (String) lastNameObj;
			this.setLastName(lastName);
		}
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
