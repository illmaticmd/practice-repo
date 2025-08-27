package com.fdmgroup.tge.user;

public class RegistrationController  {
	private ReadCommand readCommand;
	private WriteCommand writeCommand;
	private UserFactory userFactory;

	public RegistrationController(UserFactory userFactory, WriteCommand writeCommand, ReadCommand readCommand) {
		this.userFactory = userFactory;
		this.writeCommand = writeCommand;
		this.readCommand = readCommand;
	}

	public void registerNewUser(String username, String password, String role) {
		User user = userFactory.createUser(username, password);
		readCommand.readUser(username);
		writeCommand.writeUser(user);

		
	}
}
