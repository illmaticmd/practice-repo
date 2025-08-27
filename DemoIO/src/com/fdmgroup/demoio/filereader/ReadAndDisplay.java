package com.fdmgroup.demoio.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndDisplay {

	public void getFromSource(String filePath) {

		File file = new File(filePath);
		//FileReader fileReader = null;
		try (FileReader fileReader = new FileReader(file);) {
			//fileReader = new FileReader(file);
			int ch = fileReader.read();
			while (ch != -1) {
				System.out.print((char)ch);
				ch = fileReader.read();
			}
		} catch (FileNotFoundException e) { // most specific exceptions first...

			e.printStackTrace();
		} catch (IOException e) { // ...before the more general exception

			e.printStackTrace();
//		} finally {
//			try {
//				if (fileReader != null) {
//					fileReader.close();
//				}
//			} catch (IOException e) {
//
//				e.printStackTrace();
//			}
		}

	}

}
