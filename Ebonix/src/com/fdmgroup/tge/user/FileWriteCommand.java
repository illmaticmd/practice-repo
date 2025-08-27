package com.fdmgroup.tge.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteCommand implements WriteCommand {

	private Scanner scan;

//	public void writeToFile(String filePath) {
//		File writeTo = new File(filePath);
//		try (FileWriter fileWriter = new FileWriter(writeTo, true);) {
//
//			scan = new Scanner(System.in);
//			System.out.println("\nUsername please");
//
//			String un = scan.nextLine();
//			fileWriter.write(un);
//			fileWriter.write("\n");
//
//		} catch (FileNotFoundException e) {
//
//		} catch (IOException e) {
//
//		}
//	}

	@Override
	public void writeUser(User user) {
		File writeTo = new File("data/users.txt");
		try (FileWriter fileWriter = new FileWriter(writeTo, true);) {

			fileWriter.write(user.getUsername() + " " + user.getPassword());
			fileWriter.write("\n");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}		
	}
}
