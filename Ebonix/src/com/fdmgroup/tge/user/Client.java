package com.fdmgroup.tge.user;

public class Client {
	public static void main(String[] args) {

		FileReadCommand fileread = new FileReadCommand();



		FileWriteCommand filewrite = new FileWriteCommand();

		//filewrite.writeToFile("data/users.txt");
		//User user = new User();
		//filewrite.writeUser(user);
		
		//RegistrationController registrationController = new RegistrationController(userFactory, writeCommand, readCommand)
		
		UserFactory uf = new UserFactory();
		
		uf.createUser("tim", "teebo");
		
		fileread.readFile("data/users.txt");

	}
}
