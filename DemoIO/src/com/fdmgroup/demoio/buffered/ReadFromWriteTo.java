package com.fdmgroup.demoio.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFromWriteTo {

	private String source;
	private String destination;

	public ReadFromWriteTo(String source, String destination) {

		this.source = source;
		this.destination = destination;
	}

	public void getPut() {

		File fileFrom = new File(source);
		File fileTo = new File(destination);

		try (FileReader fileReader = new FileReader(fileFrom);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				FileWriter fileWriter = new FileWriter(fileTo, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
			String currentLine = bufferedReader.readLine();
			while (currentLine != null) {
				bufferedWriter.write(currentLine);
				bufferedWriter.newLine();
				currentLine = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
