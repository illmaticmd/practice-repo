package com.fdmgroup.tge.user;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadCommand implements ReadCommand {
	public void readFile(String filePath) {
		File userFile = new File(filePath);
		try (FileReader fileReader = new FileReader(userFile);) {
			int ch = fileReader.read();
			while (ch != -1) {
				System.out.print((char) ch);
				ch = fileReader.read();
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	@Override
	public User readUser(String username) {
		File userFile = new File("data/users.txt");
		try (BufferedReader fileReader = new BufferedReader(new FileReader(userFile))) {
			User user = new User();

			String line = fileReader.readLine();

			while (line != null) {
				String[] str = line.split(" ");

				if (username.equals(str[0])) {
					user.setUsername(str[0]);
					user.setPassword(str[1]);
					return user;
				} else {
					line = fileReader.readLine();
				}
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		return null;
		// TODO Auto-generated method stub

	}
}
