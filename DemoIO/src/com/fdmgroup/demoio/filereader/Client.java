package com.fdmgroup.demoio.filereader;

import java.io.File;
import java.io.IOException;

public class Client {

	public static void main(String[] args) {

//		File file = new File("demo.txt");
//
//		System.out.println("File 'demo.txt' exists? " + file.exists());
//
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		if (file.exists()) {
//			System.out.println(file.getAbsolutePath());
//			file.delete();
//		}
		
		ReadAndDisplay readAndDisplay = new ReadAndDisplay();
		
		readAndDisplay.getFromSource("data/example.txt");
	}

}
